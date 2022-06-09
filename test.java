// Program for print addition of two value using return type
public class test {
	public void method1()   // non- parameterized method 
	{
		System.out.println("This is non paramatrized method");
		test t2 = new test();            // calling parameterized method within non parameterized method 
		t2.addition(10, 20);
		
	}
	public int addition(int a ,int b)   // Parameterized method
	{
		int add = a + b ;
		System.out.println("Addition  is "+ add);
	    
		return add ;   
		
	}
	public int multiply(int num, int a , int b )
	{ 

		int sum = addition(a,b );
		int finalresult = sum*num;
	    System.out.println("Multplication is : "+finalresult);
		return finalresult ; 
		
	}
	
	public static void main(String arg[])
	{
		System.out.println("Start");
		test t = new test(); 
		t.method1(); // method calling by creating object (non-P)
		test t3 = new test();
	    t3.multiply(10, 10 ,10 );
	    System.out.println("End");
		
		
	}
	
	
	

}
