package JAVA_Only;

public class Variable8 {

	int x=50;
	static int y=300;
		
	public static void main(String[] args) {

		Variable8 v8 =new Variable8();
		
		
		System.out.println("Variable Eight");
		int m=5;
		System.out.println(m);
		System.out.println(y);
		System.out.println("Global Variable with Object :- "+v8.x);
		
		aMethod();
		

	}
	
	public static void aMethod()
	{
		System.out.println("This is A Mehtod");
	}

}
