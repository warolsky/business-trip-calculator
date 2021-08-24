package com.karwil.businesstripcalculator.service;

import com.karwil.businesstripcalculator.model.BusinessTrip;
import com.karwil.businesstripcalculator.repository.BusinessTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BusinessTripService {

    private final BusinessTripRepository repository;

    public BusinessTripService(BusinessTripRepository repository) {
        this.repository = repository;
    }

    public List<BusinessTrip> getAllBusinessTrips(){
        return repository.findAll();
    }

    public void addBusinessTrip(BusinessTrip businessTrip){

        if(businessTrip == null)
            throw new NullPointerException("Empty data");

        repository.save(businessTrip);
    }

}
