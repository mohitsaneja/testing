import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Main {
   public static void main(String[] args) {
	Resource r=new ClassPathResource("NewFile.xml");
	BeanFactory b=new XmlBeanFactory(r);
	Product P=(Product)b.getBean("Global");
	// Product bean get instantiated  by BeanFactory
	P.d();
}
}
/*
 * developed by Rod Johnson in 2003. Spring framework makes the easy development
 * of JavaEE application.
 * 
 * Spring is a lightweight framework. It can be thought of as a framework of
 * frameworks because it provides support to various frameworks such as Struts,
 * Hibernate, Tapestry, EJB, JSF etc. The framework, in broader sense, can be
 * defined as a structure where we find solution of the various technical
 * problems. The Spring framework comprises several modules such as IOC, AOP,
 * DAO, Context, ORM, WEB MVC etc.
 */ 
