package it.aesys.gc.CalcValuta.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Pound implements Currency {

    private final BigDecimal EXCHANGE_RATE_EUR = new BigDecimal("1.21");
    private final BigDecimal EXCHANGE_RATE_CHF = new BigDecimal("1.23");
    private final BigDecimal EXCHANGE_RATE_USD = new BigDecimal("1.30");

    Map<String, BigDecimal> exchangeRatePound = new HashMap<>(3);

    public Pound(){
        exchangeRatePound.put("EUR", new BigDecimal("1.21"));
        exchangeRatePound.put("CHF", new BigDecimal("1.23"));
        exchangeRatePound.put("USD", new BigDecimal("1.30"));
    }

    @Override
    public Map<String, BigDecimal> getMap(){
        return exchangeRatePound;
    }
}
