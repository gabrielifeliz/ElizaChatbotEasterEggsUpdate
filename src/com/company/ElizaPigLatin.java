package com.company;

public class ElizaPigLatin extends ElizaHedgesQualifiers {

	// Declare protected data field.
	// This allows only the subclass to access its value explicitly
	protected String pigLatinMessage;

	// Create constructor that receives the user's answer as an argument
	public ElizaPigLatin(String answer) {
		// Pass user's answer to superclass's constructor
		super(answer);
		// Call setter method to perform its actions.
		// Also pass the string representation of the superclass's object
		setPigLatinMessage();
	}

	/*
	 * This method is responsible for translating the random qualifier or hedge to
	 * pig Latin
	 */
	public void setPigLatinMessage() {

		// Initialize protected data field to an empty string
		pigLatinMessage = "";
		// Declare string array that will contain a set of words
		String[] response = hedgeOrQualifierWithoutPunct;

		// Access all the words in the array, using a for loop from the initial element
		// to the last
		for (int i = 0; i < response.length; i++) {

			// Create boolean variable firstCharVowel to test whether the first letter of
			// the word is a vowel
			boolean firstCharVowel = response[i].charAt(0) == 'a' || response[i].charAt(0) == 'e'
					|| response[i].charAt(0) == 'i' || response[i].charAt(0) == 'o' || response[i].charAt(0) == 'u',

					// Create boolean variable secondCharVowel to test whether the second letter of
					// the word is a vowel
					secondCharVowel = response[i].charAt(1) == 'a' || response[i].charAt(1) == 'e'
							|| response[i].charAt(1) == 'i' || response[i].charAt(1) == 'o'
							|| response[i].charAt(1) == 'u';

			if (firstCharVowel) {
				// If first letter of the word is a vowel, add an "ay" at the end of that word
				response[i] += "ay";
			} else if (!firstCharVowel && !secondCharVowel) {
				// If first and second letters of the word are consonants, move them to the last
				// place and add an "ay" at the end of that word
				response[i] = response[i].substring(2) + response[i].substring(0, 2) + "ay";
			} else if (!firstCharVowel && secondCharVowel) {
				// If first letter of the word is a consonant but the second one is a vowel,
				// move the consonant to the last place and add an "ay" at the end of that word
				response[i] = response[i].substring(1) + response[i].charAt(0) + "ay";
			}

			// If we add the last word, don't include a space.
			// If not, add a space in between the words.
			pigLatinMessage += ((i != response.length - 1) ? (response[i] + " ") : (response[i]));
		}

		// End the pig Latin sentence with a question mark if the first letter of the
		// hedge or
		// qualifier is W. Otherwise, end the pig Latin sentence with a period
		pigLatinMessage += ((hedgeOrQualifierDisplay.charAt(0) == 'W') ? "? " : ". ");
	}

	/*
	 * This method is responsible for displaying the string representation of the
	 * ElizaPigLatin's object
	 */
	@Override
	public String toString() {

		return pigLatinMessage + "Enter your response here or Q to quit: ";
	}
}
