package bean.scan.person;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer implements Person {
	
	private String name = "Customer 스캔@Resource.Scan";
	private int age = 26;
	
	public Customer(){}	
	
	public Customer(String name, int age){
		this.name = name;
		this.age = age;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMessage(){
		return "scan패키지 : " + name;
	}
} 