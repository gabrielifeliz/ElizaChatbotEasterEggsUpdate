package com.company;

public class ElizaRedResponse extends ElizaHedgesQualifiers {

	// Declare protected data field.
	// This allows only the subclass to access its value explicitly
	protected final String ANSI_RED = "\u001B[31m";
	protected final String ANSI_RESET = "\u001B[0m";
	protected String redMessage;

	// Create constructor that receives the user's answer as an argument
	public ElizaRedResponse(String answer) {
		// Pass user's answer to superclass's constructor
		super(answer);
		// Call setter method to perform its actions.
		// Also pass the string representation of the superclass's object
		setRedMessage();
	}

	public void setRedMessage() {
		redMessage = ANSI_RED + hedgeOrQualifierDisplay + ANSI_RESET;
	}

	/*
	 * This method is responsible for displaying the string representation of the
	 * ElizaRedResponse's object
	 */
	@Override
	public String toString() {

		return redMessage + " Enter your response here or Q to quit: ";
	}
}
