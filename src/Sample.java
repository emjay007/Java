import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , fact;
		
	System.out.println("Enter the number");
		
	Scanner sc = new Scanner(System.in);
	
	n= sc.nextInt();
	
	
	fact= factorial(n);
	
	System.out.print("Factorial of " +n+ " is "+fact);
	
	sc.close();
	
	
	
		
	}
	
	static int factorial(int n)
	{
		
		if(n==0||n==1){
			
			return 1;
		}
			else return (n*(factorial(n-1)));
			
		}
		
			
		
	}
	


