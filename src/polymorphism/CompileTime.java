package polymorphism;

public class CompileTime {
	
	// Method overloading  
	int division(int a, int b)
	{
		return a/b;
	}
	
	float division(float a, float b)
	{
		return a/b;
	}

	public double division(double d, double e) {
		// TODO Auto-generated method stub
		return d/e;
	}
	
	public double division(double d, double e, double f) {
		// TODO Auto-generated method stub
		return d/e/f;
	}
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	String add(String s1, String s2)
	{
		return s1+s2;
	}
	
	void add(long a, long b)
	{
		System.out.println(a+b);
	}
	
}
