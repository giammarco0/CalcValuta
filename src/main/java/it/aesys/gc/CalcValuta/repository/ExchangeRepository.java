package it.aesys.gc.CalcValuta.repository;

import it.aesys.gc.CalcValuta.models.*;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRepository {

    Map<String, Currency> currencies = new HashMap<>();

    public ExchangeRepository() {

        currencies.put("USD", new Dollar());
        currencies.put("USD", new Euro());
        currencies.put("USD", new Pound());
        currencies.put("USD", new SwissFranc());

    }

    public Map<String, Currency> getMap(){
        return currencies;
    }


}

