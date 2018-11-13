public class Clock{
	

	public static void main (String[] args){
		int theHour = 11;
		int theMin =0;
		int theSec = 40;
		Clock c = new Clock(theHour, theMin, theSec);
		System.out.println("Clock is: " + c );

		c.setHour(5);
		System.out.println("Clock is: " + c );

		c.setHour(2800);
		System.out.println("Clock is: " + c );

		System.out.println("Clock is: " + c.getHour());
	}

	public Clock(int hour, int minutes, int seconds){
		this.hour = hour;
		this.min= minutes;
		sec = seconds;
	}

	public void setHour(int newHour){
		if (newHour >=0 && newHour<=23)
			hour = newHour;
	}

	public int getHour(){
		return hour;
	}

	int hour;
	int min;
	int sec;

	public String toString(){
		return hour + " : " + min + " : " + sec;
	}
}