package assigments;

public class Increment {
	
	public void increment() {
		int i=10;
		i++;
		System.out.println("Increment operator:"+i);
		
		
	}
	public void decreament() {
		int j =20;
		j--;
		System.out.println("Decreament operator:"+j);
	}

	public static void main(String[] args) {
		Increment obj = new Increment();
		obj.increment();
		obj.decreament();
		
		


	}

}
