public class Employee {

	private int emp_id;
	private String emp_name;
	private String emp_depart;
	private double emp_salary;
	private double emp_pouns;
	private boolean resedent;
	private static int empsObj;
	
	
	public  void name( Employee e ) {
		e.setEmpsObj(5555);
		
	}
	public  int na(  ) {
	return empsObj;
		
	}
	
	public static int getEmpsObj() {
		return empsObj;
	}

	public void setEmpsObj(int empsObj) {
		this.empsObj = empsObj;
	}

	
	

	public Employee() {
	
		emp_id=0;
		emp_name = "No name";
		emp_depart = "No Dep";
		emp_salary = 0;
		emp_pouns = 0;
		resedent = false;
empsObj++;

	}

	public Employee( int id, String name, String depart) {
		 emp_id = id;
		 emp_name=name;
		 emp_depart=depart;
	
	}
	
	
	public Employee( int id, String name, String depart, double salary, double pouns, boolean res) {
		 this(id,name,depart);
		 emp_salary=salary;
		 emp_pouns =pouns;
		 resedent=res;
		 System.out.println("hi ...");
	}
	
	
	
	
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_depart() {
		return emp_depart;
	}

	public void setEmp_depart(String emp_depart) {
		this.emp_depart = emp_depart;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public double getEmp_pouns() {
		return emp_pouns;
	}

	public void setEmp_pouns(double emp_pouns) {
		this.emp_pouns = emp_pouns;
	}

	public boolean isResedent() {
		return resedent;
	}

	public void setResedent(boolean resedent) {
		this.resedent = resedent;
	}

}
