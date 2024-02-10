package com.PaymentService.Payments.Model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;


@Data
@Builder
public class RequestPayment {

    private long id;
    private String orderId;
    private String transactionId;
    private Instant paymentDate;
    private long totalAmount;
    private String paymentMode;
}
