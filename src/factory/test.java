package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("fac1.xml"); 
		  A a=(A)context.getBean("a");  
		    a.msg();
	}
	
	  
	    
}
