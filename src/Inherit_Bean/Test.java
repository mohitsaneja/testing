package Inherit_Bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Dependent_Object.Question;

public class Test {
   public static void main(String[] args) {
	   Resource r=new ClassPathResource("Inherit.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Employee q=(Employee)b.getBean("e2");
		q.display();
}
}
