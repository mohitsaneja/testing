package dep_woutList;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;


public class test {
  public static void main(String[] args) {
	Resource r= new ClassPathResource("woutlist.xml");
	BeanFactory b=new XmlBeanFactory(r);
	question q=(question)b.getBean("e");
	q.display();
	
}
}
