
public class Addstring {
	
	private String name;
	
	Tostring bdy;
	
	
	public Addstring(String n, Tostring g ){
		
		name= n;
		
		bdy=g;
		
				
				
	}
	
	public String toString(){
		
		return String.format("My name is %s and my birthday is on %s", name, bdy);
	}
	
	
	

}
