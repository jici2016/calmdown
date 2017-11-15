/** 
 * TODO
 * 2017年11月15日
 * 下午12:15:26
 * ming	
 */
/**
 * @author ming
 * 一般是使用套餐类型才是用这种方式
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
	缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
	何时使用：一些基本部件不会变，而其组合经常变化的时候。
 */
package pub.ningjinren.designpattern.creational.builder;