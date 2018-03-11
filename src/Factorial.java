import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, fact=1, i;
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		
		for(i=1; i<=n;i++){
			
			fact= fact*i;
		}
		
		System.out.println("The Factorial of the number is " +fact);
		sc.close();
	}

}
