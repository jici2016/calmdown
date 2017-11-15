package pub.ningjinren.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonCriteria {
	private List<Person> persons;
	public PersonCriteria() {
		persons = new ArrayList<Person>();
	}
	abstract List<Person> critera(List<Person> persons);

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}
