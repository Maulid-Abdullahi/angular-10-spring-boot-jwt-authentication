package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.ApplyLoan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppliedLoansRepository extends JpaRepository<ApplyLoan, Long> {
    Optional<ApplyLoan> findByIdNumber(String idnumber);
    Boolean existsByEmail(String email);
}
