package in.Hussain.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.entity.com.User;

public class App 
{
    public static void main( String[] args )
    {
//    	User user1 = new User();
//    	user1.setName("Noor");
//    	user1.setEmail("Noor@gmail,com");
//    	user1.setPssword("Noor");
//    	user1.setGender("male");
//    	user1.setCity("kotri");
    	
//    	User user2 = new User();
//    	user2.setName("Hussain");
//    	user2.setEmail("Hussain@gmail,com");
//    	user2.setPssword("HUssain");
//    	user2.setGender("male");
//    	user2.setCity("Hyd");
    	
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("/in/confiq/hibernate.cfg.xml");
    	
    	SessionFactory sessionfactory = cfg.buildSessionFactory();
    	Session session = sessionfactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	//------Insert Operation-----//
//    	
//    	try {
//    		session.save(user2);
//    		transaction.commit();
//    		System.out.println("User DEtails Added Succcesfully");
//    	}catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    		System.out.println("User not Inserted due to some error ");
//    	}
    
    	//-----Select OP---//
//    	try {
//    		User user =  session.get(User.class, 1l);
//`			if(user != null) {
//	System.out.println(user.getId());
//	System.out.println(user.getName());
//	System.out.println(user.getEmail());
//	System.out.println(user.getPssword());
//	System.out.println(user.getGender());
//	System.out.println(user.getCity());
//}else {
//	System.out.println("");
//}
//    	}catch( Exception e) {
//    		e.printStackTrace();
//    	}
    	
    	//------Update Operation-----//
 	
//    	try {
//    		User user = session.get(User.class, 2l);
//    		user.setCity("nawb");
//    		
//    		session.saveOrUpdate(user);
//    		transaction.commit();
//    		System.out.println("User DEtails Updated Succcesfully");
//    	}catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    		System.out.println("User not Updated due to some error ");
//    	}
    	
       	//------Update Operation-----//
     	
    	try {
    		User user = new User();
    		user.setId(2l);
    		
    		session.delete(user);
    		transaction.commit();
    		System.out.println("User DEtails Deleted Succcesfully");
    	}catch(Exception e) {
    		transaction.rollback();
    		e.printStackTrace();
    		System.out.println("User not Deleted due to some error ");
    	}
    		
    }
}
