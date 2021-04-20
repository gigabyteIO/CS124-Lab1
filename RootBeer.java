
public class RootBeer {

	public static void main(String[] args) {

		double people, glassesPerPerson, glassesPerKeg, totalGlasses;
		double costPerKeg, kegsNeeded, totalCost;

		people = 2061;
		glassesPerPerson = 3;
		glassesPerKeg = 210;
		costPerKeg = 87.69;

		totalGlasses = people * glassesPerPerson;
		kegsNeeded = totalGlasses / glassesPerKeg;
		totalCost = kegsNeeded * costPerKeg;

		System.out.print("If " + people + " people drink " + glassesPerPerson);
		System.out.print(" glasses each and each keg has " + glassesPerKeg);
		System.out.println(" glasses of root beer. And each keg costs $" + costPerKeg + ".");
		System.out.println("Then we would need " + kegsNeeded + " kegs, at a total cost of $" + totalCost + ".");
	}

}
