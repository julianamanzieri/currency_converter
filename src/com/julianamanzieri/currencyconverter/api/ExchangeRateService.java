package com.julianamanzieri.currencyconverter.api;

import com.google.gson.*;
import com.julianamanzieri.currencyconverter.exception.ConversionException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    String API_URL = "https://v6.exchangerate-api.com/v6/7e8f2d04f38a984fd3b692db/latest/";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws ConversionException {
        try {
            String url = API_URL + fromCurrency;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String json = response.body();
                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        .create();

                JsonObject jsonResponse = JsonParser.parseString(json).getAsJsonObject();
                JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");

                if (rates.has(toCurrency)) {
                    return rates.get(toCurrency).getAsDouble();
                } else {
                    throw new ConversionException("Currency code not found in the API response.");
                }
            } else {
                throw new ConversionException("API responded with status code: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new ConversionException("Error connecting to the API: " + e.getMessage());
        }
    }
}
