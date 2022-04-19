package it.aesys.gc.CalcValuta.service;

import it.aesys.gc.CalcValuta.models.Currencies;
import it.aesys.gc.CalcValuta.models.Currency;
import it.aesys.gc.CalcValuta.repository.ExchangeRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class ExchangeService {

    public BigDecimal exchangeCalc(String id1, String id2, BigDecimal amount) {

        ExchangeRepository exchangeRepository = new ExchangeRepository();

        Map<String, Currency> currencies = exchangeRepository.getMap();


        switch (id1) {
            case ("USD"): {
                switch(id2){
                    case("GBP"):{
                        return (currencies.get("USD").getMap().get("GBP")).multiply(amount);
                        break;
                    }
                    case("EUR"):{
                        return (currencies.get("USD").getMap().get("EUR")).multiply(amount);
                        break;
                    }
                    case("CHF"):{
                        return (currencies.get("USD").getMap().get("CHF")).multiply(amount);
                        break;
                    }
                    default: return null;
                }
                break;
            }
            case ("GBP"): {
                switch (id2) {
                    case ("USD"): {
                        return (currencies.get("GBP").getMap().get("USD")).multiply(amount);
                        break;
                    }
                    case ("EUR"): {
                        return (currencies.get("GBP").getMap().get("EUR")).multiply(amount);
                        break;
                    }
                    case ("CHF"): {
                        return (currencies.get("GBP").getMap().get("CHF")).multiply(amount);
                        break;
                    }
                    default: return null;
                }
                break;

            }
            case ("EUR"): {
                switch(id2) {
                    case ("USD"): {
                        return (currencies.get("EUR").getMap().get("USD")).multiply(amount);
                        break;
                    }
                    case ("GBP"): {
                        return (currencies.get("EUR").getMap().get("GBP")).multiply(amount);
                        break;
                    }
                    case ("CHF"): {
                        return (currencies.get("EUR").getMap().get("CHF")).multiply(amount);
                        break;
                    }
                    default: return null;
                }
                break;
            }
            case("CHF"): {
                switch(id2){
                    case("USD"):{
                        return (currencies.get("CHF").getMap().get("USD")).multiply(amount);
                        break;
                    }
                    case("GBP"):{
                        return (currencies.get("CHF").getMap().get("GBP")).multiply(amount);
                        break;
                    }
                    case("EUR"):{
                        return (currencies.get("CHF").getMap().get("EUR")).multiply(amount);
                        break;
                    }
                    default: return null;
                }
                break;
            }
            default: return null;
        }
        return null;
    }
}
