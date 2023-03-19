package com.example.tinkoffservice.model;

public enum Currency {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    HKD("HKD"),
    CHF("CNF"),
    JPY("JPY"),
    CNY("CNY"),
    TRY("TRY");
private String currency;
    Currency(String currency) {this.currency = currency;}
}
