package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	
	
	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}

	public static void main(String [] george) {
		Date date = new Date(1,1,1,false);
		Time time = new Time(1,1,false);
		Date date2 = new Date(1,1,1,false);
		Time time2 = new Time(1,1,false);
		
		Appointment now = new Appointment(date, time);
		Appointment later = new Appointment(date2, time2);

		System.out.println(now.equals(later));
	}
}
