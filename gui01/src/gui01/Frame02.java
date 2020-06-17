package gui01;

import java.awt.Color;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月15日 上午10:41:07
 * 创建多个frame窗口
 */
public class Frame02 {

	public static void main(String[] args) {
		
		new Myframe(100, 100, 200, 200, Color.BLACK);
		new Myframe(300, 100, 200, 200, Color.red);
		new Myframe(100, 300, 200, 200, Color.green);
		new Myframe(300, 300, 200, 200, Color.blue);
		
		
	}
}

/*myfram就继承了Frame的特性
 * 包括frame中的方法、属性
 * */
class Myframe extends Frame{
	
	//设置Myframe的构造方法，将需要的参数都封装进来 在创建这个对象时构造方法执行。
	public Myframe(int x,int y,int width, int height,Color c) {
		setLocation(x, y);
		setSize(width, height);
		setBackground(c);
		setVisible(true);
	}
	
}