package com.example.obejerciciosrestjpa;

import com.example.obejerciciosrestjpa.entities.Laptop;
import com.example.obejerciciosrestjpa.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObEjerciciosRestJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObEjerciciosRestJpaApplication.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop libro1 = new Laptop(null, "lenovo",4200F,"plomo");
		Laptop libro2 = new Laptop(null, "hp",4200F,"negro");
		Laptop libro3 = new Laptop(null, "asus",4200F,"rojo");

		laptopRepository.save(libro1);
		laptopRepository.save(libro2);
		laptopRepository.save(libro3);
	}

}
