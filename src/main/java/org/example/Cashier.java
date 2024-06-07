package org.example;

import java.util.Arrays;
import java.util.List;

public class Cashier {

    private static final List<String> acceptedCurrencies = Arrays.asList("EUR", "GBP");

    public static double validateTransaction(String currency, double amount) throws IllegalAccessException {

        if(currencyIsAccepted(currency) && amountIsValid(amount)) {
            return amount;
        }
        return -1;
    }

    private static boolean currencyIsAccepted(String currency) throws IllegalAccessException {
        if (!acceptedCurrencies.contains(currency)){
            throw new IllegalAccessException("Currency " + currency + " not within accepted currencies list.");
        }
        return true;
    }

    private static boolean amountIsValid(double amount) {
        if(amount<0){
            throw new InvalidTransactionAmountException("Transaction amount must be greater than 0");
        }
        return true;
    }

}
