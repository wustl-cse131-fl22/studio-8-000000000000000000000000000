package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is24;

/**
 * 
 * @param hour
 * @param minute
 * @param is24
 */
	public Time(int hour, int minute, boolean is24) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.is24 = is24;
	}
	
	

	
	@Override
public String toString() {
	if (is24) {
		return hour+":"+minute;
	}
	else {
		if(hour<12) {
			return hour+":"+minute+ "am";

		}
		else if(hour==12) {
			return hour+":"+minute+ "pm";

		}
		else if(hour==0) {
			return 12+":"+minute+ "am";

		}
		else {
			return hour-12+":"+minute+ "pm";
		}
	}
}


	

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}




	public static void main(String[] args) {
 
    	
    }

}