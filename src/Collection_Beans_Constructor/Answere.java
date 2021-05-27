package Collection_Beans_Constructor;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class Answere {
  public static void main(String[] args) {
	  Resource r=new ClassPathResource("Question_Answere.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Question P=(Question)b.getBean("a");
		P.display();
}
}
