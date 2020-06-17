package gui01;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月15日 下午3:13:26
 */
public class test011 {

	public static void main(String[] args) {
	
		
		Frame frame = new Frame();
		
		frame.setSize(300, 200);
		
		frame.setTitle("huihua");

		frame.add(new MypanelDrew());
		frame.setVisible(true);
	}
	
}
class MypanelDrew extends Panel {
	
	int w = 80;
	int h = 80;
	
	@Override
		public void paint(Graphics g) {
			
			g.setColor(Color.blue);
			
			g.drawOval(10, 10, w, h);
			g.setColor(Color.red);
			
			g.drawOval(80, 10, w, h);
			g.setColor(Color.green);
			
			g.drawOval(150, 10, w, h);
			g.setColor(Color.orange);
			
			g.drawOval(50, 70, w, h);
			g.setColor(Color.pink);
			
			g.drawOval(120, 70, w, h);
		
		}	
	
		
	}
	
	
	


