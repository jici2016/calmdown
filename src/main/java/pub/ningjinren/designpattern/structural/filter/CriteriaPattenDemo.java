package pub.ningjinren.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPattenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		Person p1 = new Person("NuoNuo", 1, "F");
		Person p2 = new Person("MingMing", 27, "M");
		Person p3 = new Person("HongHong", 27, "F");
		Person p4 = new Person("RuiRui", 50, "F");
		Person p5 = new Person("DongDong", 51, "M");
		persons.add(p1);persons.add(p2);
		persons.add(p3); persons.add(p4);
		persons.add(p5);
		System.out.println("----元数据----");
		System.out.println(persons);
		AgeCriteria age = new AgeCriteria();
		System.out.println("----过滤出来18岁以上的----");
		System.out.println(age.critera(persons));
		System.out.println("----过滤出来男性----");
		SexCriteria sex = new SexCriteria("M");
		System.out.println(sex.critera(persons));
		
		System.out.println("----过滤出来18岁以上 并且是 女性----");
		AndCriteria and = new AndCriteria(new AgeCriteria(), new SexCriteria("F"));
		System.out.println(and.critera(persons));
		
		System.out.println("----过滤出来18岁以上  或者是 女性----");
		OrCriteria or = new OrCriteria(new AgeCriteria(), new SexCriteria("F"));
		System.out.println(or.critera(persons));
		
		
		
		
	}

}
