package com.example.demo;

import java.time.LocalTime;
import java.util.Scanner;

import org.springframework.web.reactive.function.client.WebClient;

public class WebController {
    WebClient webClient;
    Scanner scan;

    public WebController() {
        this.webClient = WebClient.create("http://localhost:8080");
        scan =  new Scanner(System.in);
    }

    public void sendPostrequest(String number) {
        Time t = new Time(number, LocalTime.now());
        webClient.post().uri("/times").bodyValue(t).retrieve().toBodilessEntity().subscribe(response -> {
          System.out.println("POST Response Status: " + response.getStatusCode());
        });
    }
}
