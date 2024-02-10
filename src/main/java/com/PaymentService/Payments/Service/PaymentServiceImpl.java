package com.PaymentService.Payments.Service;

import com.PaymentService.Payments.Entity.PaymentEntity;
import com.PaymentService.Payments.Model.RequestPayment;
import com.PaymentService.Payments.Model.ResponsePayment;
import com.PaymentService.Payments.Repository.PaymentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository repository;

    @Override
    public ResponsePayment payOrder(RequestPayment requestPayment) {

        PaymentEntity payment = PaymentEntity.builder()
                .id(requestPayment.getId())
                .paymentDate(requestPayment.getPaymentDate()).
                paymentMode(requestPayment.getPaymentMode())
                .orderId(requestPayment.getOrderId())
                .transactionId(requestPayment.getTransactionId())
                .totalAmount(requestPayment.getTotalAmount())
                .build();
        ResponsePayment response = new ResponsePayment();
        repository.save(payment);
        BeanUtils.copyProperties(payment,response);
        return response;

    }
}
