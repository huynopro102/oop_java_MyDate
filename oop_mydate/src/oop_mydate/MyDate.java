package oop_mydate;

import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// tao 1 constructor
	public MyDate(int d,int m,int y) {
		this.day=d;
		this.month=m;
		this.year=y;
	}
	// tao ham in ra day
	public void printday() {
		System.out.println("day : "+this.day);
	}
	public void printmonth() {
		System.out.println("month :"+this.month);
	}
	public void printyear() {
		System.out.println("year :"+this.year);
	}
	public void printday_month_year(){
		System.out.println("day : "+this.day+" month : "+this.month+" year ; "+this.year);
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day=day;
	}
	@Override
	public String toString() {
		return "đây là kiểu dữ liệu ng đùng"+this.day;
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
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	// object là tất cả các đối tượng đại diện trong java và object này có tên obj
	// this là cái lớp đang đứng
	
	
	
	
}