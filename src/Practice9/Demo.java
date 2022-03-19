package Practice9;

import java.security.PublicKey;

public class Demo {
	public static void main(String[] args) {
		// Chuỗi thành số
		// String str = "123";

		// Cách 1
		// int numInt = Integer.parseInt(str);
		// float numFloat = Float.parseDouble(str);
		// double numDouble = Double.parseDouble(str);

		// Cách 2
		// int numInt = Interger.valueOf(str);
		// float numFloat = Float.valueOf(str);
		// double numDouble = Double.valueOf(str);

		// Số thành Chuỗi
		int numInt = 123;
		
		//Cách 1
		//String str = ""+numInt;
		
		//Cách 2
		//String str = String.valueOf(numInt);
		
		//Cách 3
		//String str = Integer.toString(numInt);
		//System.uot.println(str);
		
		//WeekDay d = WeekDay.TUESDAY;
		//System.out.println(d);
		
		for (WeekDay d : WeekDay.values()) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println("--------------------");
		WeekDay d1 = WeekDay.getWeekDayByValue(6);
		System.out.println(d1);
	
		

	}



}
