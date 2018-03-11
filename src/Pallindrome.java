import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int n, sum=0, temp,r;

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number you want to check");

 n= sc.nextInt();
 
 temp=n;
 
 while (n>0){
 
 r =n% 10;
 
 sum = (sum*10)+r;
 
 n= n/10;
 
 }
 
 if (temp==sum){
	 
	 System.out.println(temp+" is pallindrome");
	 
	 
 }
 
 else{
	 
	 System.out.println(temp+" is not pallindrome");
 }
 
 
 sc.close();
		
	}
	

}
