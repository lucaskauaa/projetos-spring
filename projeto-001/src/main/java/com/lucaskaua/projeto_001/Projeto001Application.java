package com.lucaskaua.projeto_001;

import com.lucaskaua.projeto_001.entities.Employee;
import com.lucaskaua.projeto_001.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Projeto001Application implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(Projeto001Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);

		System.out.println("Salário líquido: R$ " + salaryService.netSalary(employee));
	}
}
