package assigments;

public class Relativeoperator {

	double a = 16.1;
	double b = 13.3;

	public void checkRelative() {

		// condition is true then if logic will be executed
		if (a < b) {

			System.out.println("A less then B: ");

		}

		// if condition is false then else logic will be executed
		else {

			System.out.println("A greater then B");
		}

	}

	public static void main(String[] args) {

		Relativeoperator ref = new Relativeoperator();

		ref.checkRelative();

	}

}
