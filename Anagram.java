package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()==text2.length())
		{
			
			
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		char[]value1 = text1.toCharArray();
		char[]value2 = text2.toCharArray();
		
		  Arrays.sort(value1);  
          Arrays.sort(value2);  
          
		boolean status = Arrays.equals(value1,value2);
		
		if (status) {
			
		
		System.out.println("The given strings are Anagram");
		}
		
		else {
			System.out.println("The given strings are not Anagram");
		}
	}

}
