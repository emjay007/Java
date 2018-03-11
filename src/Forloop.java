import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, average;
		int total=0;
		int i;
		
		Scanner sc= new Scanner(System.in);
		
		for(i=1; i<=10;i++)
		{
			x= sc.nextInt();
			total = total + x;
		}
		average = total/i;
		
		System.out.println("The average of the number is : " + average);
		
		sc.close();
	}

}
