import java.util.Scanner;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Methods x = new Methods("Jessi");
		// Methods b = new Methods();
	/*	System.out.print("Enter your name : ");
		String b = sc.nextLine();
		x.myMessage(b);
		
		System.out.print("Enter the name of first girlfriend : ");
		String name = sc.nextLine();
		x.assignName(name); */
		x.finalfunction();
		
		sc.close();
		
	}

}
