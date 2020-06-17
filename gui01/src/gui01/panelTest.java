package gui01;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月15日 上午11:03:12
 */
public class panelTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Test Panel");
		
		frame.setLayout(null);//给窗口设置一个布局模式
		
		Panel panel = new Panel();
		
		frame.setBounds(100,100,300,300);//同时设置窗口的位置还有大小,此时的位置是位于原点
		
		frame.setVisible(true);
		
		panel.setBounds(50, 50, 100, 100);//此时的位置是根据窗口来说的.同时设置面板位置和大小
		
		frame.setBackground(Color.red);
		
		panel.setBackground(Color.blue);//设置面板的背景颜色
		
		frame.add(panel);//将面板添加进窗口
		
	}
	
}
