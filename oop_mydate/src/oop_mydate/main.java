package oop_mydate;

public class main {
public static void main(String[] args) {
	MyDate md = new MyDate(4, 2, 2200);
	MyDate md1 = new MyDate(4, 2, 2200);
	MyDate md2 = new MyDate(5, 22, 2020);
	md.printday();
	md.printmonth();
	md.printyear();
	md.printday_month_year();
	System.out.println(md.getDay());
	md.setDay(34); // hàm chỉ dùng để thay đổi biến ko dùng để in ra kết quả đc
	System.out.println(md.getDay());
	System.out.println(md.toString());
	System.out.println("md so sánh với md1 "+md.equals(md1));
	System.out.println("md1 so sánh với md2 "+md1.equals(md2));
	
}
}
