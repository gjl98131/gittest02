package com.offcn.gui03;

import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午3:04:11
 */
public class JcomboBoxTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JComboBox jComboBox = new JComboBox();
		//可以添加object 对象的顶级父类 
		jComboBox.addItem("--请选择--");
		jComboBox.addItem("身份证");
		jComboBox.addItem("结婚证");
		jComboBox.addItem("离婚证");

		jPanel.add(jComboBox);
		
		frame.add(jPanel);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}

}
