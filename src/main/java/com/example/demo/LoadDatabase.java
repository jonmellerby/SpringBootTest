//package com.example.demo;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//class LoadDatabase {
//
//  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//  @Bean
//  CommandLineRunner initDatabase(TimeRepository repository) {
//
//    return args -> {
//      log.info("Preloading" + repository.save(new Time(String.format("Förare %s", repository.count() + 1))));
//      log.info("Preloading" + repository.save(new Time(String.format("Förare %s", repository.count() + 1))));
//    };
//  }
//}
