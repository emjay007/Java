
import java.util.EnumSet;

public class Enumcaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Enum people : Enum.values())
		
		System.out.printf("%s\t%s\t%s\n" , people, people.getDesc(), people.getAge());
		
		System.out.println("And now for Enum Range");
		
		for(Enum people : EnumSet.range(Enum.Manoj, Enum.Neeraj))
			
			System.out.printf("%s\t%s\t%s\n" , people, people.getDesc(), people.getAge());
	}

}
