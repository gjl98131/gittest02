package com.offcn.gui02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午4:36:28
 */
public class BoderlayOutTEST {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		jFrame.setLayout(new BorderLayout());
		
		JButton jButton1 = new JButton("EAST");
		JButton jButton2 = new JButton("WEST");
		JButton jButton3 = new JButton("CENTER");
		JButton jButton4 = new JButton("NORTH");
		JButton jButton5 = new JButton("SOUTH");
		
		jFrame.add(jButton1,new BorderLayout().EAST);
		jFrame.add(jButton2,new BorderLayout().WEST);
		jFrame.add(jButton3,new BorderLayout().CENTER);
		jFrame.add(jButton4,new BorderLayout().NORTH);
		jFrame.add(jButton5,new BorderLayout().SOUTH);
		
		jFrame.setSize(300, 200);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.setVisible(true);
		

	}

}
