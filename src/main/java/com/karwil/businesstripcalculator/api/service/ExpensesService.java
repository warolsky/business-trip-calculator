package com.karwil.businesstripcalculator.api.service;

import com.karwil.businesstripcalculator.api.model.Expense;
import com.karwil.businesstripcalculator.api.repository.ExpensesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    private final ExpensesRepository repository;

    public ExpensesService(ExpensesRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpensess(){
        return repository.findAll();
    }

    public void addExpenses(Expense expense){

        if(expense == null)
            throw new NullPointerException("Empty data");

        repository.save(expense);
    }
    
}
