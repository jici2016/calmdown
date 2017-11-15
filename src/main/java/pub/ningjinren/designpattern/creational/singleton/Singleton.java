package pub.ningjinren.designpattern.creational.singleton;

//1.懒汉模式：延迟加载，线程不安全
public class Singleton {

	private Singleton(){}
	private static Singleton instance = null;
	public static Singleton getInstance(){
	 	if(instance == null){
	 		instance = new Singleton();
	 	}
	 	return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(Singleton5.Instance);;
	}
}

//懒汉模式2 延迟加载 线程安全，但是执行效率低
class Singleton2{
	private Singleton2(){};
	private static Singleton2 instance = null;
	public synchronized Singleton2 getInstance(){
		if(instance == null){
	 		instance = new Singleton2();
	 	}
	 	return instance;
	}
}

//饿汉模式1  初始化即加载，线程安全，容易产生垃圾，执行效率高
class Singleton3{
	private Singleton3(){};
	private static Singleton3 instance = new Singleton3();
	public synchronized Singleton3 getInstance(){
	 	return instance;
	}
} 

//双层检验锁DCL(double checked locking) 延迟加载，线程安全，但是书写复杂
class DCLSingleton{
	private static DCLSingleton instance = null;
	private DCLSingleton(){};
	public static DCLSingleton getInstance(){
		if(instance == null){
			synchronized (DCLSingleton.class) {
				if (instance == null) {
					instance = new DCLSingleton();
				}
			}
		}
		return instance;
	}
}
//登记式/静态内部类 ：延迟加载 ，线程安全，效率高
class Singleton4{
	private   Singleton4() {
	}
	private static class Holder{
		public static final Singleton4 instance = new Singleton4();
	}
	public static final Singleton4 getInstance(){
		return Holder.instance;
	}
}
//枚举方式实现 ：
 enum Singleton5{
	Instance;
	 public void doSth(){
		 
	 }
}