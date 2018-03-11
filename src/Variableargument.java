
public class Variableargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(average(1,4,5,3,7));
		
	}
	public static int average(int...x){
		int total=0;
		
		for(int i:x)
			
			total+=i;
		return total/x.length ;
		
		
	}
	
}

