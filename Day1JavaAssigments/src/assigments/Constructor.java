package assigments;

public class Constructor {
	int a;
	String name ;
	float f1;
	

	Constructor(int m,String flow) 
	{
	a=m;
	name=flow;
	
	}


	Constructor(int k,float f2) {
	a =k;
	f1=f2;
		
	}



	public Constructor() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		Constructor ref=new Constructor();
		System.out.println(ref.a);
		System.out.println(ref.name);
		
		Constructor ref1=new Constructor(10," Preethi");
		System.out.println(ref1.a);
		System.out.println(ref1.name);
		
		Constructor ref2=new Constructor(20," Pratish");
		
		
		
			}
		
}
