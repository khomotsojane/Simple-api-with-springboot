package com.example.springTwo;

import com.example.springTwo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTwoApplication.class, args);
	}
}



