package week1.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String input = "changeme";
		
		StringBuilder result = new StringBuilder(); 
	    for (int i = 0; i < input.length(); i++) { 
	        if (i % 2 != 0) { 
	            result.append(Character.toUpperCase(input.charAt(i))); 
	        } else { 
	            result.append(input.charAt(i)); 
	        } 
	    } 
	   

	   
	    System.out.println(result);
	
	}

}
