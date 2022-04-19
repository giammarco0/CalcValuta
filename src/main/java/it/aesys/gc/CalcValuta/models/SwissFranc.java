package it.aesys.gc.CalcValuta.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SwissFranc implements Currency {

    private final BigDecimal EXCHANGE_RATE_EUR = new BigDecimal("0.98");
    private final BigDecimal EXCHANGE_RATE_GBP = new BigDecimal("0.81");
    private final BigDecimal EXCHANGE_RATE_USD = new BigDecimal("1.06");

    Map<String, BigDecimal> exchangeRateSwissFranc = new HashMap<>(3);

    public SwissFranc(){
        exchangeRateSwissFranc.put("EUR", new BigDecimal("0.98"));
        exchangeRateSwissFranc.put("GBP", new BigDecimal("0.81"));
        exchangeRateSwissFranc.put("USD", new BigDecimal("1.06"));
    }

    @Override
    public Map<String, BigDecimal> getMap(){
        return exchangeRateSwissFranc;
    }
}

