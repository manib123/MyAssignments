package week1.day2;

public class Library {
	public void addBook(String bookTitle) {
		System.out.println("Book added successfully: " +bookTitle);

	}
	
	public void issueBook()
	{
System.out.println("Book issued succesfully");

	}
	

	
	public static void main(String[] args) {
		
		
		Library lm=new Library();
		
		

		
		lm.issueBook();
	 
		lm.addBook("Selenium");
}
}
