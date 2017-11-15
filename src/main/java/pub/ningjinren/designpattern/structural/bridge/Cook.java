package pub.ningjinren.designpattern.structural.bridge;

/**
 * 做菜接口，烹饪方式很多种（蒸，炒，炖，炸，烩。。。），菜的种类很多种（白菜，萝卜，土豆，西红柿。。。），然后菜谱不可能无限量的增加菜名。
 * 
 * @author ming
 *
 */
public interface Cook {
	/**
	 * 烹饪方式
	 */
	void cookway();
}
