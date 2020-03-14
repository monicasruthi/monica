package com.hibernate.mypack;  
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
         //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
           // Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();//meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Employee e1=new Employee();    
            e1.setId(10);    
            e1.setFirstName("sruthi");    
            e1.setLastName("moni");    
         
       session.save(e1);  
       t.rollback();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  