package bean.scan.member;

import org.springframework.stereotype.Component;

import bean.scan.person.Person;

@Component("member")
public class Member implements Person {
	private String name = "Member�@Resource.Scan";
	private int age = 26;
	
	public Member(){}	
	
	public Member(String name, int age){
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
		return "맴버이름: " + name;
	}
} 