import java.util.Scanner;

public class Factorialrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, fact;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		number = sc.nextInt();
		
		fact = factorial(number);
		
		System.out.println("Factorial of the number " +number+ " is " +fact);
				
		sc.close();
		}
		
	
	
	
	
	static int factorial(int n){
			
			if(n==0|| n==1){
				
				return 1;
			}
			
			else return (n*factorial(n-1));
				
				
		}
	


}
