import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	checkprime(3);
		checkprime(45);
		checkprime(1); */
		
		checkprime();
	}

	static void checkprime(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check");
		
		int n= sc.nextInt();
		
	int m;
	
	int i;
	
	int flag =0;
	
	m=n/2;
	
	
	if(n==0||n==1){
		
		System.out.println(n + " is not a prime number");
	}
	
	else{
		
		for(i=2; i<=m;i++){
			
			if(n%i==0){
				
				System.out.println(n + " is not a prime number");
				
				flag=1;
				
				break;
				
			}
			}
			
			
		if (flag==0) {
				
				System.out.println(n + " is a prime number");	
			}
		}
	
	sc.close();
	}
			
	
		
	
	
	}
