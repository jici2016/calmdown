package pub.ningjinren.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ceo = new Employee("大拿", 50000, "董事长");
		Employee zjl = new Employee("刘大脑袋", 30000, "总经理");
		Employee bgszr = new Employee("李四", 20000, "办公室主任");
		Employee cjzr = new Employee("冯六", 10000, "车间主任");
		Employee bscfzr = new Employee("赵四", 10000, "办事处负责人");
		ceo.add(zjl);
		zjl.add(bgszr).add(cjzr).add(bscfzr);
		List<Employee>list = new ArrayList<Employee>();
		list.add(ceo);list.add(zjl);list.add(bgszr);list.add(cjzr);
		list.add(bscfzr);
		System.out.println(list);
	}

}
