public class Employee {
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	public Employee() {
		super();
		address=new Address();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
public Employee(Integer empId, String name, double salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
public static void main(String[] args) {
	System.out.println("hello");
}}