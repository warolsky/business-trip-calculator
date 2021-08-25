package com.karwil.businesstripcalculator.api.controller;

import com.karwil.businesstripcalculator.api.model.Expense;
import com.karwil.businesstripcalculator.api.service.ExpensesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/expenses")
public class ExpensesController {

    private final ExpensesService service;

    public ExpensesController(ExpensesService service) {
        this.service = service;
    }

    @GetMapping
    private List<Expense> getAllBusinessTrips(){
        return service.getAllExpensess();
    }

    @PostMapping
    private void addBusinessTrip(@RequestBody Expense expense){
        service.addExpenses(expense);
    }

}
