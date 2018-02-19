package assigments;

public class Datatypes {
	
	/**
	 *d,e,f,g are Global variables
	 */
	String d="Preethika";
	float e=10.1f;
	float f=20.2f;
	float g=e-f;
	double value=9.8;
	char alphate='g';
	boolean result=true;
	
	
	

	public static void main(String[] args) {
		Datatypes dt=new Datatypes();
		
		
		/**
		 * k,b,c are local variables
		 */
		int k=40;
		int b=50;
		int c=k+b; 
		
		
		System.out.println("Addition of two numbs:    "+ c  );
		
		
		
		System.out.println("Substraction of two numbs:"+dt.g );
		
		
		
		System.out.println("My name is:"+dt.d );
		
		
		System.out.println("Double value:"+dt.value      );
		
		
		System.out.println("Alphates value:"+dt.alphate    );
		
		
		System.out.println("Boolean value:"+dt.result);
		
		
		
		
		


	
	}

}
