
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=60;
		
		if (age>60){
			
			System.out.println("You are old");
		}
		else{
			
			System.out.println("You are young");
			
			if(age>=45)
			{
				System.out.println("You are in your 40's");
			}
			
			else{
				System.out.println("Never Mind");
			}
		}

	}

}
