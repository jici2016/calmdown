package pub.ningjinren.designpattern.structural.filter;

import java.util.List;

public class AndCriteria extends PersonCriteria{
    PersonCriteria p1 ,p2;
	public AndCriteria(PersonCriteria p1,PersonCriteria p2) {
		// TODO Auto-generated constructor stub
		this.p1 = p1 ;
		this.p2 = p2 ;
	}
	
	@Override
	List<Person> critera(List<Person> persons) {
		// TODO Auto-generated method stub
		
		return p2.critera(p1.critera(persons));
	}

}
