package lists.ads.self;

/**
 * Created class to store employees details into arraylist
 * @author akshaythakare
 *
 */
public class EmployeeList {

	private String firstName,lastName;
	private int empId;

	public EmployeeList(String firstName, String lastName, int empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employees{ "+getFirstName()+", "+getLastName()+", "+getEmpId()+"}";
	}
	
}
