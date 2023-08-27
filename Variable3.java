package JAVA_Only;

public class Variable3 {

	int data =50; //Global variable
	static int f=5; //static variable
	
	// pre defined main method 
	
	public static void main(String[] args) {
		System.out.println("Variable three");
		int n=5; //local variable
		Variable3 v3=new Variable3();
		System.out.println("N :-"+n);
		System.out.println("K :- "+k); // directly call static variable
		System.out.println("F :- "+f); // directly call static variable
		System.out.println("Data :- "+v3.data); // directly call static variable
	
		v3.a();
		
	
	
	}
	static int k=7;
	public void a()
	{
		int a=20;
		System.out.println(a);
	}
	

}
