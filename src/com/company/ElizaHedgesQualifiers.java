package com.company;

import java.util.*;

public class ElizaHedgesQualifiers extends ElizaReplacements {

	// Declare protected data fields.
	// This allows only the subclass to access its value explicitly
	protected String hedgeOrQualifierDisplay;
	protected String[] hedgeOrQualifierWithoutPunct;

	// Create constructor that receives the user's answer as an argument
	public ElizaHedgesQualifiers(String answer) {
		// Pass user's answer to superclass's constructor
		super(answer);
		// Call setter method to perform its actions
		setHedgeOrQualifierDisplay();
		setHedgeOrQualifierWithoutPunct();
	}

	/* This method is responsible for generating a random qualifier or hedge */
	public void setHedgeOrQualifierDisplay() {

		// Create HashSet of Strings and add hedges to it
		HashSet<String> hedges = new HashSet<>();
		hedges.add("Please tell me more.");
		hedges.add("Many of my patients tell me the same thing.");

		// Create HashSet of Strings and add qualifiers to it
		HashSet<String> qualifiers = new HashSet<>();
		qualifiers.add("Why do you say that " + secondPersonSentence + "?");
		qualifiers.add("You seem to think that " + secondPersonSentence + ".");
		qualifiers.add("So, you are concerned that " + secondPersonSentence + ".");

		// Create Random object
		Random random = new Random();
		// Determine randomly whether a hedge or qualifier will be generated
		HashSet<String> hashSet = (random.nextBoolean()) ? hedges : qualifiers;

		// Create Iterator object to access all the elements in the HashSet
		Iterator<String> iteratorHashSet = hashSet.iterator();
		int hashSetId = random.nextInt(hashSet.size());
		hedgeOrQualifierDisplay = iteratorHashSet.next().toString();
		for (int count = 0; count < hashSetId; count++)
			hedgeOrQualifierDisplay = iteratorHashSet.next().toString();
	}

	/*
	 * This method is responsible for removing punctuation from the random hedge or
	 * qualifier
	 */
	public void setHedgeOrQualifierWithoutPunct() {

		// Declare string variable that holds the response without punctuation
		String responseWithoutPunct;

		try {
			// Return response, excluding the period
			responseWithoutPunct = hedgeOrQualifierDisplay.substring(0, hedgeOrQualifierDisplay.indexOf("."));
		} catch (StringIndexOutOfBoundsException e) {
			// If an exception is thrown, catch it.
			// Then, return response without the question mark
			responseWithoutPunct = hedgeOrQualifierDisplay.substring(0, hedgeOrQualifierDisplay.indexOf("?"));
		}

		// Convert the sentence into a set of words using split
		hedgeOrQualifierWithoutPunct = responseWithoutPunct.split(" ");
	}

	/*
	 * This method is responsible for displaying the string representation of the
	 * ElizaHedgesQualifiers's object
	 */
	@Override
	public String toString() {
		return hedgeOrQualifierDisplay + " Enter your response here or Q to quit: ";
	}

}
