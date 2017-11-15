package pub.ningjinren.designpattern.structural.filter;

import java.util.List;

public class AgeCriteria extends PersonCriteria {

	@Override
	List<Person> critera(List<Person> p) {
		for (Person person : p) {
			if(person.getAge()>18) {
				this.getPersons().add(person);
			}
		}
		return this.getPersons();
	}

}
