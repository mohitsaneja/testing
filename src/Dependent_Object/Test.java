package Dependent_Object;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
   public static void main(String[] args) {
	Resource r=new ClassPathResource("Dependent.xml");
	BeanFactory b=new XmlBeanFactory(r);
	Question q=(Question)b.getBean("question");
	q.display();
			
}
}
