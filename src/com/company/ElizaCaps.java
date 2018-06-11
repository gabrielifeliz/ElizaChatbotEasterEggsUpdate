package com.company;

public class ElizaCaps extends ElizaHedgesQualifiers {

	// Declare protected data field.
	// This allows only the subclass to access its value explicitly
	protected String capsMessage;

	// Create constructor that receives the user's answer as an argument
	public ElizaCaps(String answer) {
		// Pass user's answer to superclass's constructor
		super(answer);
		// Call setter method to perform its actions.
		// Also pass the string representation of the superclass's object
		setCapsMessage();
	}

	/*
	 * This method is responsible for converting the random qualifier or hedge to
	 * all caps
	 */
	public void setCapsMessage() {

		// Initialize protected data field to an empty string
		capsMessage = "";
		// Declare string array that will contain a set of words
		String[] response = hedgeOrQualifierWithoutPunct;

		// Access all the words in the array, using a for loop from the initial element
		// to the last
		for (int i = 0; i < response.length; i++) {

			// If we add the last word, convert it to upper case but don't include a space.
			// If not, convert the word to upper case and add a space in between the words.
			capsMessage += ((i != response.length - 1) ? (response[i].toUpperCase() + " ")
					: (response[i].toUpperCase()));
		}

		// End the all upper case sentence with a question mark if the first letter of
		// the hedge or qualifier is W. Otherwise, end the pig Latin sentence with a
		// period
		capsMessage += ((hedgeOrQualifierDisplay.charAt(0) == 'W') ? "? " : ". ");
	}

	/*
	 * This method is responsible for displaying the string representation of the
	 * ElizaCaps's object
	 */
	@Override
	public String toString() {
		return capsMessage + "Enter your response here or Q to quit: ";
	}

}
