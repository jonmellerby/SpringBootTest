package com.example.demo;

import java.time.LocalTime;

public class TimeDTO {
  private String startNbr;
  private LocalTime time; //Eller använda ZonedDateTime??

  public TimeDTO() {
      //Default-konstruktor för JSON-konvertering
  }

  public TimeDTO(String startNbr, LocalTime time) {
    this.startNbr = startNbr;
    this.time = time;
  }

  public String getStartNbr() {
    return startNbr;
  }

  public LocalTime getTime() {
    return time;
  }

  @Override
  public String toString() {
    return String.format("%s; %s", startNbr, time.toString());
  }
}

