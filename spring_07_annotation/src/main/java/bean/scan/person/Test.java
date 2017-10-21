package bean.scan.person;
 

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationScan.xml");
		PersonServiceImpl service = context.getBean("personServiceImpl", PersonServiceImpl.class);	
		System.out.println(service.getPerson());
		System.out.println(service.getPerson().getName());
	}
}
