
public class Static {
	
	private String firstname;
	
	private String lastname;
	
	private static int members;
	
	Static(String fname, String lname)
	{
		
		firstname = fname;
		lastname= lname;
		members++;
		
		System.out.printf("Total New Members including %s\t %s is\t %d\n", firstname, lastname, members);
		
	}
	
	

}
