package com.karwil.businesstripcalculator.api.controller;

import com.karwil.businesstripcalculator.api.model.BusinessTrip;
import com.karwil.businesstripcalculator.api.service.BusinessTripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/businesstrips")
public class BusinessTripController {

    private final BusinessTripService service;

    public BusinessTripController(BusinessTripService service) {
        this.service = service;
    }

    @GetMapping
    private List<BusinessTrip> getAllBusinessTrips(){
        return service.getAllBusinessTrips();
    }

    @PostMapping
    private void addBusinessTrip(@RequestBody BusinessTrip trip){
        service.addBusinessTrip(trip);
    }

}
