package bean.di;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class PersonServiceImpl implements PersonService {
	
	@Resource(name="person")
	private Person person;

	public Person getPerson() {
		System.out.println("9.실행순서 get 호출");
		return person;
	}
	
	public void write(Person p) {		
		this.person = p;
	}	

	public PersonServiceImpl() {
		System.out.println("2.실행순서 PersonServiceImpl 생성자 호출");
	}
	
	public PersonServiceImpl(Person person) {	
		System.out.println("PersonServiceImpl 매개변수가 있는 생성자 호출");
		this.person = person;		
	}
	
}

/*@Required
public void setPerson(Person person) {
	System.out.println("6.실행순서 PersonServiceImpl set 호출");
	this.person = person;
}*/
/* @Autowired 
 * -- <property name="person" ref="person" /> 
 */
//private Person person;
//@Autowired
////@Qualifier("person2")
//public void setPerson(Person person) {
//	this.person = person;
//}
//
/* @Resource 
 * -- (name="person")
 * -- (name="user")
 */
//private Person person;
/*	@Resource(name="person")
public void setPerson(Person person) {
	System.out.println("실행순서 PersonServiceImpl set 호출");
	this.person = person;
}

*/