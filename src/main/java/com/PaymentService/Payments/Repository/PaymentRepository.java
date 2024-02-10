package com.PaymentService.Payments.Repository;

import com.PaymentService.Payments.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {
}
