package com.karwil.businesstripcalculator.api.service;

import com.karwil.businesstripcalculator.api.model.CurrencyTable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyTableService {

    public CurrencyTable[] getCurrencyTable(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CurrencyTable[]> response =
                restTemplate.getForEntity(
                        "http://api.nbp.pl/api/exchangerates/tables/a/",
                        CurrencyTable[].class);
        CurrencyTable[] currencyTables = response.getBody();
        return currencyTables;

    }

}
