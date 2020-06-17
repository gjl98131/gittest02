package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午2:00:38
 */
public class PaintTest02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("奥运五环");
		
		frame.setSize(300, 200);

		frame.add(new DrawPanel02());
		
		frame.setVisible(true);
	}

}
class DrawPanel02 extends Panel {
	
	
	int w = 80;
	int h = 80;
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		
		g.drawOval(10, 10, w, h);
		g.setColor(Color.blue);
		
		g.drawOval(80, 10, w, h);
		g.setColor(Color.orange);
		
		g.drawOval(150, 10, w, h);
		g.setColor(Color.yellow);
		
		g.drawOval(50, 70, w, h);
		g.setColor(Color.green);
		
		g.drawOval(120, 70, w, h);
		
		
	}
	
}
