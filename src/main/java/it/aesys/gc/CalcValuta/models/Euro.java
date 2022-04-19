package it.aesys.gc.CalcValuta.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Euro implements Currency {

    private final BigDecimal EXCHANGE_RATE_USD = new BigDecimal("1.08");
    private final BigDecimal EXCHANGE_RATE_GBP = new BigDecimal("0.83");
    private final BigDecimal EXCHANGE_RATE_CHF = new BigDecimal("1.02");

    Map<String, BigDecimal> exchangeRateEuro = new HashMap<>(3);

    public Euro(){
        exchangeRateEuro.put("USD", new BigDecimal("1.08"));
        exchangeRateEuro.put("GBP", new BigDecimal("0.83"));
        exchangeRateEuro.put("CHF", new BigDecimal("1.02"));
    }

    @Override
    public Map<String, BigDecimal> getMap(){
        return exchangeRateEuro;
    }
}
