package assigments;

 public class Smallbig {

	static int a = 13;
	static int b = 45;

	public void checkGreaterOrLesser() {

		if (a > b) {
			System.out.println("A greater then B");

		} else {
			System.out.println("A less then B");

		}
	}

	public static void main(String[] args) {

		Smallbig sb = new Smallbig();
		sb.checkGreaterOrLesser();
		

	}

}
