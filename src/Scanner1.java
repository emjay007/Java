import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO A22.5uto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double x, y, sum;
		
		System.out.println("Enter the first number :");
		
		x= sc.nextDouble();
		
		System.out.println("Enter the second number :");
		
		y= sc.nextDouble();
		
		sum= x+y;
		sc.close();
		
		System.out.println("Sum of both numbers is : " +sum);
		
	}

}
