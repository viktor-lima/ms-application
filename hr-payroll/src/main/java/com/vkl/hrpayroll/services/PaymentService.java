package com.vkl.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.vkl.hrpayroll.entiteis.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
	
}
