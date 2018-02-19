package assigments;

public class Logical {
	public void praticeOrOperator() {
		int a = 6;
		int b = 7;
		int c = a + b;
		int d = b - a;
		if ((c == d) || (d != c)) {
			System.out.println("C and are Equal");

		} else {
			System.out.println("C and D are not equal");

		}

	}

	public void praticeAndOperator() {
		int a = 6;
		int b = 7;
		int c = a + b;
		int d = b - a;
		if ((c == d) && (d != c)) {
			System.out.println("C and are Equal");

		} else {
			System.out.println("C and D are not equal");

		}

	}

	public void practicesLogicalyOperators() {

		int a = 6;
		int b = 7;
		if (a == b) {
			System.out.println("A and B are euqal");

		} else {
			System.out.println("Aand B are not euqal");
		}

	}

	public static void main(String[] args) {

		Logical ref = new Logical();
		ref.practicesLogicalyOperators();
		ref.praticeAndOperator();
		ref.praticeOrOperator();
	}

}
