public class Pounds {

	public static void main(String[] args) {

		int feetPerMile;
		double miles, feet;

		int ouncePerPound;
		double ounces, pound;

		ounces = 178;
		ouncePerPound = 16;

		pound = ounces / ouncePerPound;

		miles = 2.5;
		feetPerMile = 5280;

		feet = miles * feetPerMile;

		/*
		 * System.out.print("The number of feet in "); System.out.print(miles);
		 * System.out.print(" miles is "); System.out.print(feet); System.out.println();
		 */

		System.out.print("The number of pounds in ");
		System.out.print(ounces);
		System.out.print(" ounces is ");
		System.out.print(pound);
		System.out.println();
	}

}