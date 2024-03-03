package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) { 
		ApplicationContext c=new ClassPathXmlApplicationContext("cfg2.xml");
		//Mobile mobile=c.getBean("m1");
	}

}
