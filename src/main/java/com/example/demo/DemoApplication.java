package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext contex = SpringApplication.run(DemoApplication.class, args);
//		PaymentGateway paymentGateway = contex.getBean(PaymentGateway.class);
//		 paymentGateway.setType("RazorPay ");
//		 paymentGateway.setRetryCount(5 );

		System.out.println("Hello World!");
//		paymentGateway.print();

	}

}
