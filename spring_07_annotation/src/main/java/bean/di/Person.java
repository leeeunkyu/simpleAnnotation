package bean.di;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		System.out.println("4.실행순서 person setName");
		this.name = name;
	}
	
	public void setAge(int age) {
		System.out.println("5.실행순서 person setAge");
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMessage(){
		return "고객정보: " + name;
	}
	
	public Person(){
		System.out.println("3.실행순서 person 생성 매개변수x");
	}	
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}	
	
} 