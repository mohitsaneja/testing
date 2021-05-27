package MapInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
	   public static void main(String[] args) {
			Resource r=new ClassPathResource("map.xml");
			BeanFactory b=new XmlBeanFactory(r);
			Question q=(Question)b.getBean("a");
			q.display();
					
		}
}
