import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		System.out.println("One day you are walking in the woods at night");
		int task = JOptionPane.showOptionDialog(null, "You suddenly run into a wolf you...", "Adventure", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Attack", "run away", "communicate" }, null);
		if (task == 0) {
			attack();
			System.exit(0);
		} else if (task == 1) {
			runaway();
		} else if (task == 2) {
			communicate();
			System.exit(0);
		}
		int choice = JOptionPane.showOptionDialog(null,
				"As you almost reach your home you encounter a bridge. From under it a troll appears and asks you a riddle: What has a head, a tail, is brown, and has no legs? Your answer is...",
				"Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "idk", "a brown fish", "penny" },
				null);
		if (choice == 0) {
			idk();
			System.exit(0);
		} else if (choice == 1) {
			brownfish();
			System.exit(0);
		} else if (choice == 2) {
			penny();
			System.exit(0);
		}

	}

	static void attack() {
		System.out.println("The wolf leaps at you and kills you THE END");
	}

	static void runaway() {
		System.out.println("You manage to lose the wolf and continue walking");
	}

	static void communicate() {
		System.out.println("You apparently had said something mean because the  wolf pounces and eats you THE END");
	}

	static void idk() {
		System.out.println("The troll doesn't appriciate it and decides to eat you THE END");
	}

	static void brownfish() {
		System.out.println("You are incorrect so the troll brings you down to the bottom of the bridge");
	}

	static void penny() {
		System.out.println("You are correct and you make it back home THE END");
	}
}