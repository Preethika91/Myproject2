package assigments;

public class Constructor1 {
	
	/**
	 * primitive data types
	 */
	int a;
	String name;
	float c;
	boolean k;
	char m;
	double d;
	
	

	public Constructor1(int n, String allow) {
		this.a = n;
		this.name = allow;
		System.out.println(a);
		System.out.println(name);

	}
	private Constructor1(float s,boolean b) {
		this.c=s;
		this.k=b;
		System.out.println(s);
		System.out.println(b);
		
		
	}
	Constructor1(char h,double l ) {
		this.d=l;
		this.m=h;
		System.out.println(l);
		System.out.println(h);
		
		

	}
	
	
	/**
	 * wrapper classes example first letter capital in primitive data types
	 * @param s
	 * @param b
	 */
	protected Constructor1(String s,String b ) {
		this.c= Float.valueOf(s);
		
		this.k=Boolean.valueOf(b);
		System.out.println(s);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Constructor1 ref = new Constructor1(45,"allow");
		Constructor1 ref1 = new Constructor1(10.f,true);
		Constructor1 ref2= new Constructor1('A',12.2);
		
		
		
		
		

	}

}
