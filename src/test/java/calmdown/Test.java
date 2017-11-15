package calmdown;

public class Test {
	public static void main(String[] args) {
		String a = "b";
		for(int i=0;i<960;i++){
			 a +=i;
			 System.out.println(i+","+a.length()+","+a);
		}
		System.out.println(a);
		//System.out.println(100*100/2+1);
		System.out.println();
	}
}
