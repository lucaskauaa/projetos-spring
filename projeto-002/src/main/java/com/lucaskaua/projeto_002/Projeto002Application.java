package com.lucaskaua.projeto_002;

import com.lucaskaua.projeto_002.entities.Order;
import com.lucaskaua.projeto_002.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Projeto002Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Projeto002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			int code = sc.nextInt();
			sc.nextLine();

			double basic = sc.nextDouble();
			sc.nextLine();

			double discount = sc.nextDouble();
			sc.nextLine();

			Order order = new Order(code, basic, discount);

			System.out.println("Pedido código " + order.getCode());
			System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		}

	}
}
