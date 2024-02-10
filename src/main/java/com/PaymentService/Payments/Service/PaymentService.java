package com.PaymentService.Payments.Service;

import com.PaymentService.Payments.Model.RequestPayment;
import com.PaymentService.Payments.Model.ResponsePayment;
import org.springframework.stereotype.Service;



public interface PaymentService {
    ResponsePayment payOrder(RequestPayment requestPayment);
}
