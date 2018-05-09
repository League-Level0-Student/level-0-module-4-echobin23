import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog("What pet do you want");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <= 10; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you wanna make your " + pet + " happy?", "Pet meter",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Give food", "Cuddle", "PLay with it" },
					null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				food();
			} else if (task == 1) {
				cuddle();
			} else if (task == 2) {
				play();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 10) {
				System.out.println("Your pet loves you");
				break;
			}
		}
	}

	static void food() {
		System.out.println("The " + pet + " is full and hyped");
		happinessLevel += 3;
	}

	static void cuddle() {
		System.out.println("The " + pet + " comes closer and snoozes");
		happinessLevel += 4;
	}

	static void play() {
		System.out.println("The " + pet + " is now tired and sleepy");
		happinessLevel += 2;
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}