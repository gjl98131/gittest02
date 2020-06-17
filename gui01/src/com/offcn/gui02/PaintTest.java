package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午1:43:13
 */
public class PaintTest {

	public static void main(String[] args) {
		
		
		Frame frame = new Frame();
		
		frame.setSize(300, 300);
		
		frame.add(new DrawPanel());	
		
		frame.setVisible(true);

	}

}
//设置一个画板，继承面板对象，所有的component对象都有 paint方法
class DrawPanel extends Panel{
	//所有的绘画方法都封装在 g 对象中
	@Override
	public void paint(Graphics g) {
		//将画笔设置颜色
		g.setColor(Color.RED);
		//画一个实心椭圆
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.blue);
		//画一个实心矩形
		g.fillRect(100, 150, 100, 100);
		
		Color color = g.getColor();
		
		System.out.println(color);
	}
	
}
