package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int year;
	private int month;
	private int day;
	private boolean isHd;
	
	
	/**
	 * 
	 * @param year 
	 * @param month 
	 * @param day its a day
	 * @param isHd = is holiday 
	 */
    public Date(int year, int month, int day, boolean isHd) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.isHd = isHd;
	}
    
    



	@Override
	public String toString() {
		return month +"/"+ day+"/"+ year+"{is it a holdiadya} \n" +isHd;
	}





	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}





	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();
		Date a = new Date(2000,1,1,false);
		Date b = new Date(1,1,1,false);
		Date c = new Date(1,1,1,false);
		Date d = new Date(1,1,1,false);
		Date e = new Date(1,1,1,false);
		Date f = new Date(1,1,1,false);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(a);
		
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(a);
		System.out.println(set);
    }
	

}
