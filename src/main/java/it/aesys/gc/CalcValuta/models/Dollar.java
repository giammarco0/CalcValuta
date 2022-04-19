package it.aesys.gc.CalcValuta.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dollar implements Currency {

    private final BigDecimal EXCHANGE_RATE_EUR = new BigDecimal("0.93");
    private final BigDecimal EXCHANGE_RATE_GBP = new BigDecimal("0.77");
    private final BigDecimal EXCHANGE_RATE_CHF = new BigDecimal("0.95");

    Map<String, BigDecimal> exchangeRateDollar = new HashMap<>(3);

    public Dollar(){
        exchangeRateDollar.put("EUR", new BigDecimal("0.93"));
        exchangeRateDollar.put("GBP", new BigDecimal("0.77"));
        exchangeRateDollar.put("CHF", new BigDecimal("0.95"));
    }

    @Override
    public Map<String, BigDecimal> getMap(){
        return exchangeRateDollar;
    }
}
