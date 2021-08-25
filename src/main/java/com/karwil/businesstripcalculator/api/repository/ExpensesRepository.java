package com.karwil.businesstripcalculator.api.repository;

import com.karwil.businesstripcalculator.api.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expense, Long> {
}
