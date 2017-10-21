package bean.di;
 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 

	public static void main(String[] args) {
		System.out.println("1.xml 파일 리딩");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationDi.xml");
		System.out.println("7.객체 생성전");
		PersonServiceImpl service = context.getBean("personServiceImpl", PersonServiceImpl.class);	
		System.out.println("8.객체 생성후");
		System.out.println(service.getPerson().getName());
	}
}
