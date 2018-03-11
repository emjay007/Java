import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, average;
		int total=0;
		int counter=0;
		
		Scanner sc = new Scanner(System.in);
		
		while (counter < 10){
			
			x= sc.nextInt();
			total= total + x;
			
			counter++ ;
			
		}
			
		average= total/10;
		
		System.out.println("The average of the number is : " + average);
		
		sc.close();
	}
	
	

}
