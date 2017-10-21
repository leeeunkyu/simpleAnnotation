package bean.scan.person;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	@Qualifier("member")
	private Person person;	
	
//	@Resource(name="user")
//	private Person person;	
	
//	@Autowired
//	private Person person;	
	
//	@Autowired
//	@Qualifier("user")
//	private Person person;	
	
//	@Resource(name="member")
//	private Person person;	
	
	public PersonServiceImpl() {}
	
	public PersonServiceImpl(Person person) {			
		this.person = person;		
	}
	
	public void write(Person p) {		
		this.person = p;
	}	
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
}