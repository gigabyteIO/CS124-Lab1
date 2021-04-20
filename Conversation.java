import textio.TextIO;

public class Conversation {
	public static void main(String[] args) {

		String name;
		int age;
		String eyeColor;
		String religion;

		System.out.print("Hi, what is your name?");
		name = TextIO.getlnWord();
		System.out.println("That's a nice name, " + name + ".\n");

		System.out.print("How old are you?");
		age = TextIO.getInt();

		if (age >= 30) {
			System.out.println(age + "... you're no spring chicken anymore!\n");
		}

		else if (age >= 40) {
			System.out.println(age + "... it must have been hard living in the stone age!\n");
		} else {
			System.out.println(age + "... you're just a baby!\n");
		}

		System.out.print("What is your eye color?");
		eyeColor = TextIO.getlnWord();

		System.out.println("I love the color " + eyeColor + "! Let's be best friends.\n");

		System.out.print("What religion do you practice?");
		religion = TextIO.getlnWord();

		System.out.println(religion + " is neat. I'm personally agnostic, but I have a Daemon inside me.");

	}
}
