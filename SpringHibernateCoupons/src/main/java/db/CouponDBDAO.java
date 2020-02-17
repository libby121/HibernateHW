package db;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Category;
import beans.Coupon;

@Component
@Transactional
public class CouponDBDAO {

	@Autowired
	private SessionFactory getFactory;

	public void addCoupon(Coupon coupon) {
		getFactory.getCurrentSession().save(coupon);
	}
	
	public void updateCoupon(Coupon coupon) {
		getFactory.getCurrentSession().update(coupon);
	}
	
	public void deleteCoupon(int id) {
		getFactory.getCurrentSession().delete(getOne(id));
		
	}
	
	public Coupon getOne(int id) {
		return getFactory.getCurrentSession().get(Coupon.class, id);
	}
	
	public List<Coupon>getAll(){
		TypedQuery<Coupon>coups= getFactory.getCurrentSession().createQuery("from Coupon",Coupon.class);
		return coups.getResultList();
	}
	public List<Coupon>getAll(Category category){
		TypedQuery<Coupon>coups= getFactory.getCurrentSession().createQuery("select c from Coupon c where c.category=:ca",Coupon.class);
		coups.setParameter("ca", category);
		return coups.getResultList();
	}
	public List<Coupon>getAll(double maxPrice){
		TypedQuery<Coupon>coups= getFactory.getCurrentSession().createQuery("select c from Coupon c where price<=:p",Coupon.class);
		coups.setParameter("p", maxPrice);
		return coups.getResultList();
	}
	
	
	}


	

