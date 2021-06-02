package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.ApplyLoan;
import com.bezkoder.springjwt.security.services.AppliedLoansService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")

public class ApplyLoanController {
    private final AppliedLoansService appliedLoansService;


    public ApplyLoanController(AppliedLoansService appliedLoansService) {
        this.appliedLoansService = appliedLoansService;
    }
    @PostMapping("/saveAll")
    public void addLoans(@Valid @NonNull @RequestBody ApplyLoan applyLoan){
        appliedLoansService.addLoans(applyLoan);
    }

    @GetMapping("/getAllLoans")
    public Iterable<ApplyLoan> getAllLoans(){
        return appliedLoansService.selectALlLoans();
    }

    @GetMapping(path = "{id}")
    public ApplyLoan getLoansById(@PathVariable("id") Long id){
        return  appliedLoansService.selectLoanById(id)
                .orElse(null);
    }

    @DeleteMapping("{id}")
    public void DeleteLoans(@PathVariable("id") Long id){
        appliedLoansService.deleteLoansById(id);
    }

    @PutMapping(path ="{id}")
    public ApplyLoan UpdateLoansById(@PathVariable("id") UUID id,@Valid @NonNull @RequestBody ApplyLoan applyLoanToUpdate){
        return appliedLoansService.updateLoansById(id, applyLoanToUpdate);
    }

}
