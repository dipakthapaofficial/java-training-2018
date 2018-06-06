package org.learn.HalftonJavaTraning2018.assignment;



public class CountNoOfVowel {

	public static void main(String[] args) {
		
		
		String str="bibek";
		System.out.println(CountVowel(str));
	
		
		

	}
	static boolean isVowel(char ch)
	{
		ch=Character.toUpperCase(ch);
		return(ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='v');
	}
	
	static int CountVowel(String str)
	{
		int count=0,i;
		for( i=0;i<str.length();i++)
			if(isVowel(str.charAt(i)))
				System.out.println(str.charAt(i));
				++count;
		
		
			return count;
			
			
	}
}
