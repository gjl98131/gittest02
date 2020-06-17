package com.offcn.gui02;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午4:07:49
 */
public class Jframetest {

	public static void main(String[] args) {
	
		JFrame jFrame = new JFrame("人生第一次");
		
		JLabel jLabel = new JLabel("test jframe");
		
//		jFrame.add(jLabel);
		
		jFrame.setSize(200, 200);
		
		Container cP = jFrame.getContentPane();
		
		cP.add(jLabel);
		
		jFrame.setVisible(true);

	}

}
