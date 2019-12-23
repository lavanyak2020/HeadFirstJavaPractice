package lavanya;

public class Employee{
	String empName;
	String empId;
	int mobileNo;
	int age;
	private int salary;
	packages(String empName,String empId,int mobileNo,int age){
		this.empName = empName;
		this.empId = empId;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	void setSalary(int salary){
		this.salary = salary;
	}
	int getSalary(){
		return salary;
	}
	
}