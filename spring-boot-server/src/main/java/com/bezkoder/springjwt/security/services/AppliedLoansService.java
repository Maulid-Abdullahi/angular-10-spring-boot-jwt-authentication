package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.ApplyLoan;
import com.bezkoder.springjwt.repository.AppliedLoanRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class AppliedLoansService {
    private  final AppliedLoanRepository appliedLoanRepository;
    private Collection<? extends GrantedAuthority> authorities;

    public AppliedLoansService(AppliedLoanRepository appliedLoanRepository) {
        this.appliedLoanRepository = appliedLoanRepository;
    }

    public ApplyLoan addLoans(ApplyLoan applyLoan) {
        //applyLoan.setId(UUID.randomUUID());
        return appliedLoanRepository.save(applyLoan);
    }


    public Iterable<ApplyLoan> selectALlLoans() {
        return appliedLoanRepository.findAll();
    }


    public Optional<ApplyLoan> selectLoanById(Long id) {
           return appliedLoanRepository.findById(id);
    }


    public void deleteLoansById(Long id) {
         appliedLoanRepository.deleteById(id);
    }


    public ApplyLoan updateLoansById(UUID id, ApplyLoan applyLoan) {
        return appliedLoanRepository.save(applyLoan);
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

}
