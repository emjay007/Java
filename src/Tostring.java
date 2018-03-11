
public class Tostring {

	private int date;
	
	private int month;
	
	private int year;
	
	
	public Tostring (int d, int m, int y){
		
		date =d;
		month =m;
		year= y;
		
		System.out.printf("This is my construstor %s\n" , this);
		
	}
	
	public String toString(){
		return String.format("%d/%d/%d" , date , month , year);
	}
	
}
