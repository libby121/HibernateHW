package db;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Company;

@Component
@Transactional
public class CompanyDBDAO {

	@Autowired
	private SessionFactory getFactory;
	
	public void addCompany(Company company) {
		getFactory.getCurrentSession().save(company);
	
}
	
	
	public void deleteCompany(int id) {
		getFactory.getCurrentSession().delete(getOne(id));
	}
	
	public void updateCompany(Company company) {
		getFactory.getCurrentSession().update(company);
	}
	
	
	public Company getOne(int id) {
		return getFactory.getCurrentSession().get(Company.class, id);
	}
	
	public List<Company>getAll(){
		TypedQuery<Company>compaQuer=getFactory.getCurrentSession().createQuery("from Company", Company.class);
	return	compaQuer.getResultList();
	}
	

public List<Company>getByEmail(String email){
	TypedQuery<Company>bymail=getFactory.getCurrentSession().createQuery("select a from Company a where a.email=:e", Company.class);
	bymail.setParameter("e", email);
	return bymail.getResultList();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}