package com.karwil.businesstripcalculator.repository;

import com.karwil.businesstripcalculator.model.BusinessTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Long> {
}
