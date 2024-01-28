package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests {

	@Autowired
	TimeController timeController;

	@Test
	void contextLoads() {
		assertThat(timeController).isNotNull();
	}
	

	@Test
	void testWebGet() {
		WebClient client = WebClient.create("http://localhost:8080");
		var t = client.get().uri("/times").retrieve().bodyToFlux(Time.class).collectList().block();
		for (var tm : t) {
			System.out.println(tm);
		}
	}

	@Test
	void testWebPut() {
		WebClient client = WebClient.create("http://localhost:8080");
		client.put().uri("times");
	}


}
