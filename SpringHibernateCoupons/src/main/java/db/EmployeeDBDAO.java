package db;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Employee;


@Component
@Transactional
public class EmployeeDBDAO {

	@Autowired
	private SessionFactory getFactory;
	
	
	public void addEmployee(Employee emp) {
		getFactory.getCurrentSession().save(emp);
	}
	
	public void deleteEmployee(int id) {
		getFactory.getCurrentSession().delete(getOne(id));
	}
	
	public void updateEmployee(Employee emp) {
		getFactory.getCurrentSession().update(emp);
	}

	
	public Employee getOne(int id) {
		return getFactory.getCurrentSession().get(Employee.class, id);
	}
	
	public List<Employee>getAll(){
		TypedQuery<Employee>employees=getFactory.getCurrentSession().createQuery("from Employee",Employee.class);
		return employees.getResultList();
	}
	
	//public List<Employee>getAll()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
