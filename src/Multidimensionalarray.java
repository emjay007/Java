
public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][]={{2,4,5,6,3},{5,6,7,8,9}};
		int y[][]={{13,5,6},{8,6,34},{54,6,7}};
		
	System.out.print("The first array is" + "\n");
	
	display(x);
	
System.out.println();
	System.out.print("The second array is" + "\n");
	
	display(y);
	
	}
		
		public static void display(int c[][]){
			
			for(int i=0; i<c.length; i++){
				
				for(int j=0; j<c[i].length;j++){
					
					System.out.print(c[i][j] + "\t");
					
				}
				
				System.out.println();
			}
			
		}
			
		

	}


