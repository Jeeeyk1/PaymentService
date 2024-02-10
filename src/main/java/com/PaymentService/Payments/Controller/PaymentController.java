package com.PaymentService.Payments.Controller;


import com.PaymentService.Payments.Model.RequestPayment;
import com.PaymentService.Payments.Model.ResponsePayment;
import com.PaymentService.Payments.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/payOrder")

    public ResponseEntity<ResponsePayment> payOrder(@RequestBody RequestPayment requestPayment){
        return new ResponseEntity<>(
                service.payOrder(requestPayment), HttpStatus.OK
        );

    }


}
