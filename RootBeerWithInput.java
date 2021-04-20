import textio.TextIO;

public class RootBeerWithInput {

	public static void main(String[] args) {

		double people, glassesPerPerson, glassesPerKeg, totalGlasses;
		double costPerKeg, kegsNeeded, totalCost;

		glassesPerPerson = 3;
		glassesPerKeg = 210;

		System.out.print("How many people?");
		people = TextIO.getlnDouble();

		System.out.print("Cost per keg?");
		costPerKeg = TextIO.getlnDouble();

		totalGlasses = people * glassesPerPerson;
		kegsNeeded = totalGlasses / glassesPerKeg;
		totalCost = kegsNeeded * costPerKeg;

		System.out.print("If " + people + " people drink " + glassesPerPerson);
		System.out.print(" glasses each and each keg has " + glassesPerKeg);
		System.out.println(" glasses of root beer. And each keg costs $" + costPerKeg + ".");
		System.out.println("Then we would need " + kegsNeeded + " kegs, at a total cost of $" + totalCost + ".");
	}

}
