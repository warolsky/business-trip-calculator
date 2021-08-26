package com.karwil.businesstripcalculator.api.controller;

import com.karwil.businesstripcalculator.api.model.BusinessTrip;
import com.karwil.businesstripcalculator.api.model.CurrencyTable;
import com.karwil.businesstripcalculator.api.service.BusinessTripService;
import com.karwil.businesstripcalculator.api.service.CurrencyTableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/businesstrips")
public class BusinessTripController {

    private final BusinessTripService businessTripService;
    private final CurrencyTableService currencyTableService;

    public BusinessTripController(BusinessTripService businessTripService, CurrencyTableService currencyTableService) {
        this.businessTripService = businessTripService;
        this.currencyTableService = currencyTableService;
    }

    @GetMapping
    private List<BusinessTrip> getAllBusinessTrips(){
        return businessTripService.getAllBusinessTrips();
    }

    @GetMapping(path = "/table")
    private CurrencyTable[] getActualCurrencyTable(){
        return currencyTableService.getCurrencyTable();
    }

    @PostMapping
    private void addBusinessTrip(@RequestBody BusinessTrip trip){
        businessTripService.addBusinessTrip(trip);
    }

}
