package AutoWiring;

import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test {
  public static void main(String[] args) {
	//Resource r= new ClassPathResource("auto.xml");
	  ApplicationContext context=new ClassPathXmlApplicationContext("auto.xml"); 
	  A a=context.getBean("a",A.class);  
	    a.display();
	
}
}
