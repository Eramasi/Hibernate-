package com.Hibernate.Demo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		//Employee e = null;

		
		
		Ename ename=new Ename();
		
		ename.setFname("Eramasi");
		ename.setLname("Chakravarthy");
		ename.setSurname("Chowdary");
		
		Employee e=new Employee();
		e.setEid(101);
		e.setEname(ename);
		e.setEsalary(65000);
		
		
		Configuration con = new Configuration().addAnnotatedClass(Employee.class);
		con.configure("hibernate.cfg3.xml");

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

	    session.save(e);

		//e = (Employee) session.get(Employee.class, 102);

		tx.commit();

		System.out.println(e);

	}
}
