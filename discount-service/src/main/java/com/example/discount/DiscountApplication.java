package com.example.discount;

import com.example.discount.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import javax.annotation.processing.Processor;
import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@EnableBinding(Processor.class)
public class DiscountApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountApplication.class, args);
	}

	public List<Product> addDiscountToProduct(List<Product> products) {
		for (Product product : products) {
			if (product.getPrice().compareTo(new BigDecimal(8000)) > 0) {

			} else if (product.getPrice().compareTo(new BigDecimal(5000)) > 0) {

			}
		}
		return null;
	}

}
