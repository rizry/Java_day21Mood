package com.java.day21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMoodAnalyzer {

		@Test
		public void testMessageContainsSad_thenHappy() {
				MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
				String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
				assertEquals("SAD", mood);
		}

		@Test
		public void testMessageContainsHappy_thenHappy() {
				MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
				String mood = moodAnalyzer.analyzeMood("This is a happy message");
				assertEquals("HAPPY", mood);
		}

}
