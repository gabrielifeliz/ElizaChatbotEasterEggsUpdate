package com.company;

import java.util.*;

public class ElizaReplacements {

	// Declare protected data field.
	// This allows only the subclass to access its value explicitly
	protected String secondPersonSentence;

	// Create constructor that receives the user's answer as an argument
	public ElizaReplacements(String answer) {
		// Call setter method to perform its actions
		setSecondPersonSentence(answer);
	}

	/*
	 * This method is responsible for splitting first-person sentence and returns a
	 * second-person sentence
	 */
	public void setSecondPersonSentence(String answer) {

		/*
		 * Add first-person pronouns as keys with their second-person forms as values to
		 * a hash map
		 */
		HashMap<String, String> replacements = new HashMap<>();
		replacements.put("I", "you");
		replacements.put("me", "you");
		replacements.put("my", "your");
		replacements.put("am", "are");

		// Initialize new sentence and protected data field to empty string
		secondPersonSentence = "";
		// Convert the first-person sentence into an array of words using split
		String[] response = answer.split(" ");

		// Access all the words in the array, using a for loop from the initial element
		// to the last
		for (int i = 0; i < response.length; i++) {

			// Change first person to second person with if-else statements
			if (replacements.containsKey(response[i]))
				response[i] = replacements.get(response[i]);

			// Add words separated by spaces if it's not the last word.
			// If it is, just add the last word
			secondPersonSentence += ((i != response.length - 1) ? (response[i] + " ") : (response[i]));
		}
	}

	/*
	 * This method is responsible for returning the value of the data field
	 */
	public String getSecondPersonSentence() {
		return secondPersonSentence;
	}

}