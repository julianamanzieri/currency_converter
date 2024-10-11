package com.julianamanzieri.currencyconverter.service;

import com.julianamanzieri.currencyconverter.api.ExchangeRateService;
import com.julianamanzieri.currencyconverter.exception.ConversionException;

public class CurrencyConverterService {
    private ExchangeRateService exchangeRateService;

    public CurrencyConverterService() {
        this.exchangeRateService = new ExchangeRateService();
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws ConversionException {
        double rate = exchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
