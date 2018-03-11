import java.util.Random;

public class Arraycounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		int x[] = new int [7];
		
		for(int i=1; i<=1000; i++)
		{
			++x[1+r.nextInt(6)]; //this increments the occurrence of each random number 
			
		}
		
		System.out.println("Face\tCount");
		
		for(int j=1;j<=6;j++){
			
			System.out.println(j + "\t" + x[j]);
			
		}

	}

}
