package bean.scan.person;

import org.springframework.stereotype.Component;

@Component("user")
public class User implements Person {
	private String name = "Use@Resource.Scan";
	private int age = 26;
	
	public User(){}	
	
	public User(String name, int age){
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
		return "유저이름 : " + name;
	}
} 