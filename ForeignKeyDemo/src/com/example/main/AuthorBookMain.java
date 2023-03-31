package com.example.main;

import com.example.bean.Author;
import com.example.bean.Book;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class AuthorBookMain {

	public static void main(String[] args) {
		
		//SSR is used to map the config file and execute it 
				StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				//Meta data in the config file should be executed	
				Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
				//read session factory in the xml
				SessionFactory sf=md.getSessionFactoryBuilder().build();
				//to perform crud operation we need to define an object
				Session session=sf.openSession();
				//used to save the crud operation result on the table
				Transaction tran=session.beginTransaction();
				Author au=new Author();
//				//au.setId(2);
//				au.setName("rahul");
//				au.setEmail("r"
//						+ "@c.c");
//				session.save(au);
//				//from above the author details are in the table
//				
//				Book book=new Book();
//				book.setBid(102);
//				book.setTitle("C++");
//				book.setAuthor(au);
//				session.save(book);
				
//
//Query q=session.createQuery("select au.name from Author au,Book book where au.id=book.id and book.bid=101");
//				String authorname= (String) q.uniqueResult();
//				System.out.println(authorname);

				Query q=session.createQuery("from Author author,Book book");
				List<Object[]> list= q.list();
				for(Object[] liste:list) {
				Author author=(Author) liste[0];
				Book book=(Book) liste[1];
				System.out.println(author.getId()+author.getName()+author.getEmail());
				System.out.println(book.getBid()+" "+book.getTitle()+" "+book.getAuthor().getName());


				
				tran.commit();
				session.close();
				sf.close();

	}

}
}

