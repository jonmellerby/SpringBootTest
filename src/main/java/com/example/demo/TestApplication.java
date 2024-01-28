package com.example.demo;

public class TestApplication {
    public static void main(String[] args) {
        WebController w = new WebController();
        while (true) {
            String riderNumber = w.scan.next();
            w.sendPostrequest(riderNumber);
        }
    }
}
