package beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id//PK
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@OneToMany(mappedBy="company", fetch=FetchType.EAGER)//does join automatically. 
	//coupons are in another table, get company->brings his coupons 
	private List<Coupon>coupons;
	 
	@OneToMany(mappedBy="comp")
	private List<Employee>employees;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Coupon> getCoupons() {
		return coupons;
	}
	
	public int getId() {
		return id;
	}
	public Company() {
		super();
	}
	public Company(int id, String name, String email, List<Coupon> coupons) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.coupons = coupons;
	}
	public Company(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email + ", coupons=" + coupons + "]";
	}
	
	
}
