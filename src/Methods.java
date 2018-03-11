
public class Methods {

	public void myMessage(String name){
		System.out.println("Hello " + name );
	}
	
	private String girlName;
	
	public void assignName(String name)
	{
		girlName= name;
	}
	public Methods(String p){
		girlName=p;
	}
	
	public String myFunction()
	{
		return girlName;
	}
	
	public void finalfunction()
	{
		System.out.printf("My girfriend name is %s", myFunction());
	}
}
