package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private double salary;
	
	@Column
	private int yearsAtWork;
	
	@ManyToOne
	private Company comp; 
	
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

	public int getYearsAtWork() {
		return yearsAtWork;
	}

	public void setYearsAtWork(int yearsAtWork) {
		this.yearsAtWork = yearsAtWork;
	}

	public Company getCompany() {
		return comp;
	}

	public void setCompany(Company company) {
		this.comp = company;
	}

	public int getId() {
		return id;
	}

	public Employee(String name, double salary, int yearsAtWork, Company company) {
		super();
		this.name = name;
		this.salary = salary;
		this.yearsAtWork = yearsAtWork;
		this.comp = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", yearsAtWork=" + yearsAtWork + "]";
	}

	public Employee() {
		super();
	}
	
	
	
	
}
