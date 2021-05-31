package com.bezkoder.springjwt.repository;
import com.bezkoder.springjwt.models.ApplyLoan;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface AppliedLoanRepository extends CrudRepository<ApplyLoan, Long> {
}
