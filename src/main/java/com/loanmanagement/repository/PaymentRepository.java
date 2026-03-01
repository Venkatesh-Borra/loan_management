package com.loanmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loanmanagement.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Additional query methods can be defined here if needed
}