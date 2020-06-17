package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午4:14:30
 */
public class clickTest {

	static int click;
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		
		frame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton("点击一下");
		JLabel jLabel = new JLabel();
		jLabel.setText("");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			jLabel.setText("点击了"+(++click)+"下");
				
			}
		});
		
		
		
		
		
		frame.add(jButton,BorderLayout.NORTH);
		
		frame.add(jLabel,BorderLayout.SOUTH);
		
		frame.setSize(300, 100);
	
		
		frame.setVisible(true);

	}

}
