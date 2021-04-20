import textio.TextIO;

public class Square {

	public static void main(String[] args) {
		double side, area;

		System.out.print("What is the length of a side? ");
		side = TextIO.getlnDouble();

		area = side * side;
		System.out.print("The area of the square is ");
		System.out.println(area);
	}

}
