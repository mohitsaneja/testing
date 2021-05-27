package Injection_Map;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
  public static void main(String[] args) {
	Resource r=new ClassPathResource("InjectionMap.xml");
	BeanFactory b=new XmlBeanFactory(r);
	Question q=(Question)b.getBean("a1");
	q.display();
}
}
