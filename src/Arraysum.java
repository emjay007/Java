
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,3,4,5,6,7,8,9};
		int sum= 0;		
		for(int i=0; i<array.length; i++){ 
			
			sum=sum + array[i];
		}
		

		System.out.println("The sum of Array is " + sum);
		
	}

}
