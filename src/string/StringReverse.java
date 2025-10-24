package string;

public class StringReverse {

	
	public static void main(String[] args)
	{
		// Madam--> Madam--> Pallindrome
		//Madam--M-->0, a-->1, d-->2, a-->3, m-->4
		String str="Hello world";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
//			System.out.print(str.charAt(i));
			// concatenation
			rev= rev+str.charAt(i);
		}
		System.out.print(rev);
		
		// Equality--> check first.equals(second)
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a palindrome");
		}
		
		String vowel="aeiou";
		int count=0;
		for(int i=0; i<str.length()-1; i++)
		{
			String ch="";
			ch=ch+str.charAt(i);
			if(vowel.contains(ch))
			{
				count++;
			}
		
		}
		System.out.println(count);
	}
	
}
