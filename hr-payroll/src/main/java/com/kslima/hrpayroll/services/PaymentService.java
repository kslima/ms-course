package com.kslima.hrpayroll.services;

import com.kslima.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Kleuder de Souza Lima", 200.0, days);
    }
}
