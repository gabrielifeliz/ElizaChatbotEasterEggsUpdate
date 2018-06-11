package com.company;

import java.util.*;

public class Eliza {

    public static void main(String[] args) {

        // Create Random and Scanner objects
        // Also, create ElizaReplacements objects to use methods inside it
        Scanner keyboard = new Scanner(System.in);

        // Create ArrayList to save conversation between user and Eliza
        ArrayList<String> userElizaConversation = new ArrayList<>();

        // Initialize answer to an empty string
        String answer = "";

        // Prompt the user to enter his or her problem and get the response
        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
        // Add introduction to the conversation report
        userElizaConversation.add("ELIZA:   Good day. What is your problem? Enter your response here or Q to quit: ");
        answer = keyboard.nextLine();
        // Add user's response to the conversation report
        userElizaConversation.add("USER:   " + answer);

        // Initialize loop count to control how much the user interacts with Eliza
        int loopCount = 0;
        // Process the user's initial response while it is not Q or q
        while (!answer.equalsIgnoreCase("Q")) {
            // Process the user's responses if the loop count does not equal to 8
            if (loopCount != 8) {
                // If the user's input is "pig latin", then display pig Latin sentence
                if (answer.equalsIgnoreCase("pig latin")) {

                    // Create ElizaPigLatin object to translate sentence to pig Latin
                    ElizaPigLatin pigLatin = new ElizaPigLatin(answer);
                    // Display string representation of the object (toString() method)
                    System.out.print("\n" + pigLatin);
                    // Add Eliza's sentence in pig Latin to the conversation report
                    userElizaConversation.add("ELIZA:   " + pigLatin);
                    // Receive response from the user
                    answer = keyboard.nextLine();
                    // Add user's response to the conversation report
                    userElizaConversation.add("USER:   " + answer);

                }
                // If the user's input is "caps", then display all upper case sentence
                else if (answer.equalsIgnoreCase("caps")) {

                    // Create ElizaCaps object to make sentence all caps
                    ElizaCaps caps = new ElizaCaps(answer);
                    // Display string representation of the object (toString() method)
                    System.out.print("\n" + caps);
                    // Add Eliza's sentence in all caps to the conversation report
                    userElizaConversation.add("ELIZA:   " + caps);
                    // Receive response from the user
                    answer = keyboard.nextLine();
                    // Add user's response to the conversation report
                    userElizaConversation.add("USER:   " + answer);

                }
                // If the user's input is "play game", then play a game with Eliza
                else if (answer.equalsIgnoreCase("play game")) {
                    // Display introduction of the game
                    System.out.println("\nWELCOME TO \"CHOOSE YOUR OWN ADVENTURE\"!\n");
                    System.out.print("You are in a creepy house!  Would you like to " + "go \"upstairs\" or into the\n"
                            + "\"kitchen\"?> ");
                    // Add introduction of the game to the conversation report
                    userElizaConversation.add("ELIZA:   " + "WELCOME TO \"CHOOSE YOUR OWN ADVENTURE\"!\n"
                            + "You are in a creepy house! Would you like to "
                            + "go \"upstairs\" or into the \"kitchen\"?> ");
                    // Receive response from the user
                    answer = keyboard.nextLine();
                    // Add user's response to the conversation report
                    userElizaConversation.add("USER:   " + answer);

                    // Create ElizaAdventureGame object to obtain attributes about the game
                    ElizaAdventureGame game = new ElizaAdventureGame();

                    // Create HashMap for the option of going upstairs or going to the kitchen
                    HashMap<String, String> hashMap = new HashMap<>();

                    // If the user chooses to play the game and enters upstairs,
                    // perform the actions below
                    if (answer.equalsIgnoreCase("upstairs")) {
                        // Add all the keys and values from ElizaAdventureGame class to this variable
                        // about what is upstairs
                        hashMap.putAll(game.getUpstairsOption());
                    }
                    // If the user chooses to play the game and enters upstairs, perform the actions
                    // below
                    else if (answer.equalsIgnoreCase("kitchen")) {
                        // Add all the keys and values from ElizaAdventureGame class to this variable
                        // about the kitchen
                        hashMap.putAll(game.getKitchenOption());
                    }
                        // Process the user's input while it is a valid key in the HashMap variable
                        while (hashMap.containsKey(answer)) {
                            // Declare and initialize String value to the value returned from the key,
                            // determined by the user
                            String elizaResponse = hashMap.get(answer);
                            // Display key
                            System.out.print(elizaResponse);
                            // Add Eliza's response in the game and replace the first occurrence of the
                            // newline character to an empty string to the conversation report
                            userElizaConversation.add("ELIZA:   " + elizaResponse.replaceFirst("\n", ""));
                            // Receive response from the user
                            answer = keyboard.nextLine();
                            // Add user's response to the conversation report
                            userElizaConversation.add("USER:   " + answer);
                        }
                }
                // If the user's input is "red", then change color of sentence to red
                else if (answer.equalsIgnoreCase("red")) {

                    // Create ElizaRedResponse object to display red message
                    ElizaRedResponse redResponse = new ElizaRedResponse(answer);
                    // Display string representation of the object (toString() method)
                    System.out.print("\n" + redResponse);
                    // Add Eliza's sentence in red to the conversation report
                    userElizaConversation.add("ELIZA:   " + redResponse);
                    // Receive response from the user
                    answer = keyboard.nextLine();
                    // Add user's response to the conversation report
                    userElizaConversation.add("USER:   " + answer);

                }
                // If none of the above conditions are met, then display random hedges or
                // qualifiers
                else {
                    // Create ElizaHedgesQualifiers
                    ElizaHedgesQualifiers display = new ElizaHedgesQualifiers(answer);
                    // Display string representation of the object (toString() method)
                    System.out.print("\n" + display);
                    // Add hedge or qualifier from Eliza to the conversation report
                    userElizaConversation.add("ELIZA:   " + display);
                    // Receive response from the user
                    answer = keyboard.nextLine();
                    // Add user's response to the conversation report
                    userElizaConversation.add("USER:   " + answer);

                }

                // Increase loop count to one on each iteration of the outermost while loop
                loopCount++;

            } else {
                /*
                 * If the loop counts gets to 8, the "chat-bot" breaks the while loop and
                 * terminates the program
                 */
                System.out.println("\nIt is getting late, maybe we had better quit\n\n");
                // Add last message from Eliza to the conversation report
                userElizaConversation.add("ELIZA:   It is getting late, maybe we had better quit");
                break;
            }
        }

        // Close Scanner object to stop receiving input from the user
        keyboard.close();

        /*
         * This for loop displays the entire conversation between the user and Eliza
         * for (String s : userElizaConversation)
         *      System.out.println(s);
         */

        /*
         * This for loop displays a log of Eliza's responses
         * for (int i = 0; i <= userElizaConversation.size(); i += 2)
         *      System.out.println(userElizaConversation.get(i));
         */

        /*
         * This for loop displays a log of the user's responses
         * for (int i = 1; i < userElizaConversation.size(); i += 2)
         *      System.out.println(userElizaConversation.get(i));
         */
    }
}