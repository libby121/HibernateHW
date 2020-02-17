package beans;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Coupon {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private double price;
	@ManyToOne
	private Company company;
	@Column
	private Category category;
	
	
	
	public Coupon(String title, String description, double price, Company company, Category category) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.company = company;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public Coupon(int id, String title, String description, double price, Company company, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.company = company;
		this.category = category;
	}
	public Coupon() {
		super();
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", company=" + company.getId() +company.getName()+" ]";
	}
	
	
}
