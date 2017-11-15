package pub.ningjinren.designpattern.structural.filter;

import java.util.List;

public class SexCriteria extends PersonCriteria {

	private String sexCriteria;
	//过滤什么类型的性别
	public SexCriteria(String sex) {
		// TODO Auto-generated constructor stub
		sexCriteria = sex;
	}
	
	@Override
	List<Person> critera(List<Person> p) {
		for (Person person : p) {
			if(person.getSex().equals(sexCriteria)) {
				this.getPersons().add(person);
			}
		}
		return this.getPersons();
	}

}
