package pub.ningjinren.designpattern.structural.filter;

import java.util.List;

public class OrCriteria extends PersonCriteria{
    PersonCriteria p1 ,p2;
	public OrCriteria(PersonCriteria p1,PersonCriteria p2) {
		// TODO Auto-generated constructor stub
		this.p1 = p1 ;
		this.p2 = p2 ;
	}
	
	@Override
	List<Person> critera(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person>first = p1.critera(persons);
		List<Person>second = p2.critera(persons);
		for (Person person : first) {
			if(!second.contains(person)) {
				second.add(person);
			}
		}
		return second;
	}

}
