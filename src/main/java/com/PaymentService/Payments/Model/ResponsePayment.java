package com.PaymentService.Payments.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePayment {

    private long id;
    private String orderId;
    private String transactionId;
    private Instant paymentDate;
    private long totalAmount;
    private String paymentMode;
}
