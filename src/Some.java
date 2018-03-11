
public class Some {

	private int hour, minute, second;
	
	
	public Some(){
		
		this(0,0,0);
	}
	
public Some(int h){
		
		this(h,0,0);
}
public Some(int h, int m){
	
	this(h,m,0);

}

public Some(int h, int m, int s){
	
	setTime(h,m,s);
	
}

public void setTime(int h, int m, int s){
	
	setHour(h);
	setMinute(m);
	setSeconds(s);
	
}

public void setHour(int h){
	
	hour= ((h<24)? h : 0);
}

public void setMinute(int m){
	
	minute= ((m<60)? m : 0);

}
public void setSeconds(int s){
	
	second= ((s<60)? s : 0);


}


public int getHour(){
	
	return hour;
	
	
}

public int getMinute(){
	
	return minute;
	
	
}

public int getSeconds(){
	
	return second;
	
	
}

public String Time(){
	
	return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSeconds());
}


}