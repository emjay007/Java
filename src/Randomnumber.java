import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r= new Random();
		int number;
		
		for(int i=0;i<=11;i++)
		{
			number= 1+r.nextInt(6);
			System.out.println(number);
		}
		
	}

}
