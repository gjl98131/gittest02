package gui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月15日 下午2:50:24
 */
public class BoderLayOutTest02 {

	public static void main(String[] args) {
	
		Frame frame = new Frame();
		
		frame.setLayout(new BorderLayout());
		
		Button West = new Button("West");
		Button East = new Button("East");
		Button North = new Button("North");
		Button South = new Button("South");
		Panel panel = new Panel();
		panel.setSize(100,100);
		panel.setLayout(new FlowLayout(1,5,10));
		
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		frame.add(West,"West");
		frame.add(East,"East");
		frame.add(South,"South");
		frame.add(North,"North");
		frame.add(panel,"Center");
		
		//给窗口添加监听，当点击窗口按钮时，退出程序
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.pack();
		frame.setVisible(true);
	}

}
