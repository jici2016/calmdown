package pub.ningjinren.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private float salary;
	//职位
	private String title;
	
	public Employee(String name, float salary, String title) {
		super();
		this.name = name;
		this.salary = salary;
		this.title = title;
		xiashu = new ArrayList<Employee>();
	}
	
	public Employee add(Employee e) {
		xiashu.add(e);
		return this;
	}
	
	//下属
	private List<Employee> xiashu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public List<Employee> getXiashu() {
		return xiashu;
	}
	public void setXiashu(List<Employee> xiashu) {
		this.xiashu = xiashu;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", title=" +title+ "]";
	}
	
}
