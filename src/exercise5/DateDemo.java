package exercise5;

import java.util.Date;
public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.printf("%s %tB %<te %<tY", "Due Date:", date);
	}

}
