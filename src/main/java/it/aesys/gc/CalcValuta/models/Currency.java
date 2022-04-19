package it.aesys.gc.CalcValuta.models;

import java.math.BigDecimal;
import java.util.Map;

public interface Currency {
    Map<String, BigDecimal> getMap();
}
