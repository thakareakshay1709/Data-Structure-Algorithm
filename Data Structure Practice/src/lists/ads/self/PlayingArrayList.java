package lists.ads.self;

import java.util.ArrayList;
import java.util.List;

public class PlayingArrayList {
	
	public static void main (String[] arg)
	{
		List<EmployeeList> employees = new ArrayList<EmployeeList>();
		employees.add(new EmployeeList("Akshay", "Thakare", 001));
		System.out.println(employees);
		
	}

}
