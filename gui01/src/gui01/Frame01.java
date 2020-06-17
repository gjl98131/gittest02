package gui01;

import java.awt.Color;
import java.awt.Frame;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月15日 上午10:00:56
 */
public class Frame01 {

	public static void main(String[] args) {
		
		
		Frame f = new Frame("我的第一个frame");//在这里创建一个窗口对象，窗口存在内存中。
		
		f.setLocation(100, 100);//设置窗口的位置
		
		f.setBackground(Color.BLUE);//设置窗口的背景颜色
		
		f.setSize(200, 200);//给窗口设置大小,参数1 宽  参数2  高  都是整数
		
		f.setResizable(false);//设置窗口的大小不可变
		
		f.setVisible(true);//设置窗口的可见性，写在最后面
		
		
		
	}
				
}
