package com.example.my_first_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "HI!";
	}

	@GetMapping("/test")
	public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello " + name + "!";
	}

	@GetMapping("/numbers")
	public int telNumber(@RequestParam(value = "first", defaultValue = "2") int first,
						 @RequestParam(value = "second", defaultValue = "2") int second) {
		return first + second;
	}

	@GetMapping("/anthem")
	public String seyAnthem() {
		return "Снова еду я за долбоёбом,\n" +
				"Пацану, видно, пиздец хуёво.\n" +
				"Девяносто ехать он не хочет,\n" +
				"Поэтому там едет, дрочит.";
	}
}