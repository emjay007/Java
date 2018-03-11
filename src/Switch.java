import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		
		age= sc.nextInt();
		
		switch(age)
		{ 
		case 1 :
			System.out.println("You are a baby");
		break;
		
		case 4:
			System.out.println("You can Walk");
			break;
			
		default :
			
			System.out.println("You lie out of criteria");
			break;
		
		}

		sc.close();
	}

}
