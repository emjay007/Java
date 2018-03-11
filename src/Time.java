
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setTime(23,56,25);
		
		System.out.println(twelve());
		
		System.out.println(regular());
	}
		static int h;
		static int m;
		static int s;
		
		public static void setTime(int a, int b, int c ){
			
			h = ((a>=0 && a <24 )? a : 0);
			m = ((b>=0 && c <60 )? b : 0);
			s = ((c>=0 && c <60 )? c : 0);
		
	}
	
		public static String twelve(){
			
			return String.format("%02d:%02d:%02d" , h, m , s);
		}

		
		public static String regular(){
			
			return String.format("%02d:%02d:%02d %s", ((h==0 || h<12)? h : h%12) ,m ,s , ((h<12)? "AM" : "PM"));
		}
	
	}

