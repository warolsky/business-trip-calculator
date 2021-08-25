package com.karwil.businesstripcalculator.api.repository;

import com.karwil.businesstripcalculator.api.model.BusinessTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Long> {
}
