import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, c=0, temp, r;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check");
		
		n= sc.nextInt();
		
		temp=n;
		
		while(n>0){
			
		r= n%10;
		c= c+ (r*r*r);
		n=n/10;
		}
		
		if (c==temp){
			
			System.out.println(temp +" is Armstrong");
		}

		else{
			System.out.println(temp +" is Not Armstrong");
		}
		
		sc.close();
}

}
