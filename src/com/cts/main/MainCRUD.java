package com.cts.main;

import org.hibernate.SessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.cts.bean.Student_Detail;

public class MainCRUD {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
	/*	Transaction t = session.beginTransaction();
		Student_Detail sd = new Student_Detail();
		sd.setId(50);
		sd.setStudent_name("Vidhya1");
		sd.setDept("ECE");
		sd.setYear(2019);
		session.persist(sd);
		t.commit();
		System.out.println("1 Record Inserted Successfully!!!");
		
		//update
		Transaction t1 = session.beginTransaction();
		Student_Detail sd1 = new Student_Detail();
		sd1.setId(55);
		sd1.setStudent_name("Vimala");
		sd1.setDept("EEE");
		sd1.setYear(2011);
		session.update(sd1);
		t1.commit();
		System.out.println("updated");*/
		
		
		//delete 
		Transaction t = session.beginTransaction();
		Student_Detail sd = (Student_Detail)session.load(Student_Detail.class, 56);
		sd.getStudent_name();
		sd.getDept();
		sd.getId();
		sd.getYear();
		session.delete(sd);
		t.commit();
		System.out.println("success");
		session.close();
		factory.close();
	}
}
