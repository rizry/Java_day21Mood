package com.java.day21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMoodAnalyzer {

  @Test
  public void testMessageContainsSad_thenHappy() {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
    String mood = moodAnalyzer.analyzeMood();
    assertEquals("SAD", mood);
  }

  @Test
  public void testMessageContainsHappy_thenHappy() {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
    String mood = moodAnalyzer.analyzeMood();
    assertEquals("HAPPY", mood);
  }

  @Test
  public void testMessageForNullMessage_thenHappy() {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
    String mood = "";
    try {
      mood = moodAnalyzer.analyzeMood();
    } catch (MoodAnalysisException e) {
      System.out.println(e.getMessage());
    }
  }

}
