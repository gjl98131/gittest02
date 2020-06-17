package com.offcn.gui03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 上午10:14:28
 * 
 * 可以是普通文本，也可以是html标签
 */
public class Jlabeltest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("普通标签");
		
		JLabel jLabel2 = new JLabel();
		
		jLabel2.setText("调用了setText的标签");
		
		ImageIcon imageIcon = new ImageIcon("d:\\money.jpg");
		
		JLabel jLabel3 = new JLabel("开始理财",imageIcon , JLabel.CENTER);
		
		jPanel.add(jLabel);
		jPanel.add(jLabel2);
		jPanel.add(jLabel3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(200,200,600,300);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
