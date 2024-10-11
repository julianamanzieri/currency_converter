package com.julianamanzieri.currencyconverter.ui;

import com.julianamanzieri.currencyconverter.exception.ConversionException;
import com.julianamanzieri.currencyconverter.service.CurrencyConverterService;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        CurrencyConverterService converterService = new CurrencyConverterService();
        Scanner scanner = new Scanner(System.in);
        int option;

        try {
            do {
                ConversionMenu.displayMenu();
                option = scanner.nextInt();

                if (option >= 1 && option <= 6) {
                    System.out.println("Enter the amount you want to convert:");
                    double amount = scanner.nextDouble();
                    String fromCurrency = "";
                    String toCurrency = "";

                    switch (option) {
                        case 1:
                            fromCurrency = "USD";
                            toCurrency = "ARS";
                            break;
                        case 2:
                            fromCurrency = "ARS";
                            toCurrency = "USD";
                            break;
                        case 3:
                            fromCurrency = "USD";
                            toCurrency = "BRL";
                            break;
                        case 4:
                            fromCurrency = "BRL";
                            toCurrency = "USD";
                            break;
                        case 5:
                            fromCurrency = "USD";
                            toCurrency = "COP";
                            break;
                        case 6:
                            fromCurrency = "COP";
                            toCurrency = "USD";
                            break;
                    }

                    double result = converterService.convert(fromCurrency, toCurrency, amount);
                    System.out.printf("Amount %.2f [%s] converted to %.2f [%s]\n", amount, fromCurrency, result, toCurrency);

                } else if (option != 7) {
                    System.out.println("Invalid option. Please try again.");
                }

            } while (option != 7);

            System.out.println("Thank you for using the Currency Converter!");

        } catch (ConversionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}