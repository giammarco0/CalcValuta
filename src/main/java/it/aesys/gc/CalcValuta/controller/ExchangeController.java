package it.aesys.gc.CalcValuta.controller;

import it.aesys.gc.CalcValuta.service.ExchangeService;
import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/calculator")
public class ExchangeController {

    @RequestMapping(method = RequestMethod.GET)
    public BigDecimal exchange(@PathVariable String id1,
                           @PathVariable String id2,
                           @PathVariable BigDecimal amount){

        ExchangeService exchangeService = new ExchangeService();


        return exchangeService.exchangeCalc(id1, id2, amount);
    }

}
