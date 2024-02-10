package com.PaymentService.Payments.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name= "PAYMENT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String orderId;
    private String transactionId;
    private Instant paymentDate;
    private long totalAmount;
    private String paymentMode;

}
