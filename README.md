# Currency Converter

Welcome to the Currency Converter, a console application developed in Java that allows users to convert values between different currencies using real-time exchange rates. This project was inspired by the educational challenge from Oracle Next Education in partnership with Alura.

## Description

The application allows users to select a currency and an amount to convert, providing the converted value in another currency using up-to-date exchange rates from a currency exchange API. The application ensures that users always receive the most current conversion rates available.

## Conversion Options

- USD (US Dollar) to BRL (Brazilian Real)
- USD (US Dollar) to ARS (Argentine Peso)
- USD (US Dollar) to COP (Colombian Peso)
- BRL (Brazilian Real) to USD (US Dollar)
- ARS (Argentine Peso) to USD (US Dollar)
- COP (Colombian Peso) to USD (US Dollar)

For example:

- 100 USD => BRL (The converted value based on the current exchange rate)
- 50 BRL => USD (The converted value based on the current exchange rate)

## Requirements

- Java JDK 11 or higher
- Maven (if using Maven for dependency management)
- An API key from ExchangeRate-API to access exchange rates.

## Features

- Convert currency values using real-time exchange rates
- Support for multiple currency pairs
- Error handling for invalid currency codes and API connection issues

## How to Use

 1. **Clone the Repository**:
    
    ```
    git clone https://github.com/julianamanzieri/currency_converter.git
    ```
2. **Configure the API Key**:

- Sign up at ExchangeRate-API to get a free API key.
- Replace "YOUR-API-KEY" in the ExchangeRateService.java file with your actual API key.
- Run the Application:

## Technologies Used

- Java
- Gson (for JSON parsing)
- ExchangeRate-API (for fetching exchange rates)

## Author

Developed by Juliana Manzieri. Connect with me on LinkedIn or check out my other projects on GitHub.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
