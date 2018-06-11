package com.company;

import java.util.HashMap;

public class ElizaAdventureGame {

	protected HashMap<String, String> upstairsOption = new HashMap<>();
	protected HashMap<String, String> kitchenOption = new HashMap<>();

	public ElizaAdventureGame() {

		setUpstairsOption();
		setKitchenOption();
	}

	public HashMap<String, String> getUpstairsOption() {
		return upstairsOption;
	}

	/*
	 * This method is responsible for adding the keys and values to the HashMap
	 * variable upstairsOption
	 */
	public void setUpstairsOption() {

		upstairsOption.put("upstairs", "\nUpstairs you see a hallway. At the end of the hallway is the master\n"
				+ "\"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like\n" + "to go?> ");
		upstairsOption.put("bedroom",
				"\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The\n"
						+ "bed is unmade. In the back of the room, the closet door is ajar. Would you\n"
						+ "like to open the door? (\"yes\" or \"no\")> ");
		upstairsOption.put("no", "\nWell, then I guess you'll never know what was in there. Thanks for playing,\n"
				+ "I'm tired of making nested if statements.\n" + "Enter your response here or Q to quit: ");
		upstairsOption.put("yes", "\nYou open the closet... And you find piles of golds. Congratulations!!\n"
				+ " Enter your response here or Q to quit: ");
		upstairsOption.put("bathroom", "\nIt is difficult to get in but you put enough strength to open the door.\n"
				+ "When you were finally inside the bathroom, the door closed and you got locked in.\n"
				+ "In the bathtub, you see a saw and an unknown bottle.\n"
				+ "You thinking you can use one of these items to open the bathroom's door. \n"
				+ "Would you choose the \"saw\" or the unknown \"bottle\" \nto find a way out of the bathroom?> ");
		upstairsOption.put("saw",
				"\nThe saw turns out to be made out of plastic...\n"
						+ "As a result, it broke as you tried to create an opening on the door.\n"
						+ "Because you're trapped, you will not continue in the adventure.\n"
						+ "Enter your response here or Q to quit: ");
		upstairsOption.put("bottle",
				"\nThe unknown bottle turned out to contain acid to help you make a way out."
						+ "\nYou successfully leave the bathroom and continue onto the adventure!\n"
						+ "Enter your response here or Q to quit: ");

	}

	public HashMap<String, String> getKitchenOption() {
		return kitchenOption;
	}

	/*
	 * This method is responsible for adding the keys and values to the HashMap
	 * variable kitchenOption
	 */
	public void setKitchenOption() {

		kitchenOption.put("kitchen",
				"\nThere is a long countertop with dirty dishes everywhere. Off to one side\n"
						+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n"
						+ "or look in a \"cabinet\".> ");
		kitchenOption.put("refrigerator", "\nInside the refrigerator you see food and stuff. It looks pretty nasty.\n"
				+ "Would you like to eat some of the food? (\"yes\" or \"no\")> ");
		kitchenOption.put("no", "\nYou die of starvation... eventually." + "\nEnter your response here or Q to quit: ");
		kitchenOption.put("yes",
				"\nCongrats. You don't starve. \nYour stomach hurts but you can still continue the quest."
						+ "\nEnter your response here or Q to quit: ");
		kitchenOption.put("cabinet",
				"\nYou looked in a cabinet... And a serpent bites your right hand and leaves the cabinet.\n"
						+ "The venom spreads through your body. Luckily, there are two medicines inside the same cabinet.\n"
						+ "The problem is that they are not labeled. So you must take a crucial decision.\n"
						+ "Would you take medicine \"one\" or \"two\"?> ");
		kitchenOption.put("one",
				"\nThis pill turned out to be a painkiller.\n"
						+ "You don't suffer as much but you will unfortunately die. :("
						+ "\nEnter your response here or Q to quit: ");
		kitchenOption.put("two",
				"\nYou survived with this pill. Great choice!" + "\nEnter your response here or Q to quit: ");

	}

}
