package pack1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class laptopdriver {
	public static void main(String[] args) {
		ClassPathResource c=new ClassPathResource("cfg.xml");
		XmlBeanFactory bean=new XmlBeanFactory(c);
		Laptop l=(Laptop) bean.getBean("laptop");
		System.out.println(l);
		
	}
}
