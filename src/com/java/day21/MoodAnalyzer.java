package com.java.day21;

public class MoodAnalyzer {

  private String message;
  public MoodAnalyzer() {

  }

  public MoodAnalyzer(String message) {
    this.message = message;

  }

  public String analyzeMood() {
    try {
      if (message.toLowerCase().contains("sad")) return "SAD";
        else return "HAPPY";
    } catch (NullPointerException e) {
      System.out.println("Cant determine mood. message is null.");
      throw new NullPointerException();
    }
  }
}
