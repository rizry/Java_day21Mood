package com.java.day21;

public class MoodAnalyzer {

  public String analyzeMood(String message) {
    if (message.toLowerCase().contains("sad")) return "SAD";
      else return "HAPPY";
  }
}
