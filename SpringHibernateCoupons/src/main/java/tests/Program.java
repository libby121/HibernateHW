package tests;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Category;
import beans.Company;
import beans.Coupon;
import beans.Employee;
import configs.SpringConfig;
import db.CompanyDBDAO;
import db.CouponDBDAO;
import db.EmployeeDBDAO;

public class Program {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)) {
			CompanyDBDAO compDBD = ctx.getBean(CompanyDBDAO.class);
			CouponDBDAO coupDBD = ctx.getBean(CouponDBDAO.class);
			EmployeeDBDAO empDBD=ctx.getBean(EmployeeDBDAO.class);
			
			//System.out.println("test");

			for (Coupon c : coupDBD.getAll(Category.values()[2])) {
				//System.out.println("test");
				System.out.println(c);
			}
			
//			Employee e= empDBD.getOne(1);
//			e.setName("yael");
//			empDBD.updateEmployee(e);
			
//			for (Employee e : empDBD.getAll()) {
//				System.out.println(e);
//			}
//			
//			System.out.println(empDBD.getOne(1));
			//empDBD.deleteEmployee(2);
//			empDBD.addEmployee(new Employee("ezra", 10000.9, 2, compDBD.getOne(1)));
//			empDBD.addEmployee(new Employee("ezra", 10000.9, 2, compDBD.getOne(2)));
//			empDBD.addEmployee(new Employee("ezra", 10000.9, 2, compDBD.getOne(2)));
//			empDBD.addEmployee(new Employee("ezra", 10000.9, 2, compDBD.getOne(2)));
//			empDBD.addEmployee(new Employee("ezra", 10000.9, 2, compDBD.getOne(4)));
			// Company c=
//			System.out.println(compDBD.getOne(1).getCoupons().size());
//
//			Coupon cou = new Coupon("family breakfast", "breakfast newr the sea", 320.4, compDBD.getOne(1),
//					Category.food);
//			compDBD.getOne(1).getCoupons().add(cou);//adding a coupon to company in java list! add->list method
//			coupDBD.addCoupon(cou);//adding to sql list!addCoupon->DBD sql method
//			compDBD.updateCompany(compDBD.getOne(1));//and then updating!
//			
//			System.out.println(compDBD.getOne(1).getCoupons().size());
			// for (Coupon co :compDBD.getOne(1).getCoupons()) {
			// System.out.println(co);}

			// }compDBD.getOne(1).getCoupons();
			// System.out.println(coupDBD.getOne(3));

			// Coupon c= coupDBD.getOne(1);
			// c.setPrice(123.8);
			//
			// coupDBD.updateCoupon(c);

			// for (Coupon c : coupDBD.getAll()) {
			// System.out.println(c);

			// for (Coupon c : coupDBD.getAll(150)) {
			// System.out.println(c);
			// }
		
//		 coupDBD.addCoupon(new Coupon("cloths", "red skirt", 345.8, compDBD.getOne(1),
//		 Category.cloths));//how to make it a string in sql?
//		 coupDBD.addCoupon(new Coupon("spa", "couple's spa", 456.9, compDBD.getOne(2),
//		 Category.spa));//how to make it a string in sql?
//		 coupDBD.addCoupon(new Coupon("cloths", "blue baby coat", 89.4,
//		 compDBD.getOne(1), Category.cloths));//how to make it a string in sql?
//		 coupDBD.addCoupon(new Coupon("family breakfast", "breakfast newr the sea",
//		 320.4, compDBD.getOne(3), Category.food));//how to make it a string in sql?
//		 coupDBD.addCoupon(new Coupon("cloths", "red trousers", 3243.2,
//		 compDBD.getOne(1), Category.cloths));//how to make it a string in sql?

		// coupDBD.deleteCoupon(2);
//		 compDBD.addCompany(new Company("company","company@com"));
//		 compDBD.addCompany(new Company("company2","company2@com"));
//		 compDBD.addCompany(new Company("company3","company3@com"));
//		 compDBD.addCompany(new Company("company4","company4@com"));
//		 compDBD.addCompany(new Company("company5","company5@com"));

		// compDBD.deleteCompany(5);

		// Company c=compDBD.getOne(4);
		// c.setName("Bestcompany4");
		// compDBD.updateCompany(c);

		// System.out.println(compDBD.getOne(4));
		// System.out.println(compDBD.getByEmail("company@com"));

		// for (Company c : compDBD.getAll()) {
		// System.out.println(c);
	}
}}
