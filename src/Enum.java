
public enum Enum {
	
	Manoj("Good" , "24"),
	Neeraj("Nice", "24" ),
	Anoop("Excellent" , "26");
	
	private final String desc;
	
	private final String age;
	
	Enum (String description, String year){
		
		desc= description;
		age= year;
		 
		
	}
	
	public String getDesc(){
		
		return desc;
	}
	
	public String getAge(){
		
		return age;
	}

}
