package com.offcn.gui03;



import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午2:31:19
 */
public class JcheckboxTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("常见的编程语言:");
		
		JCheckBox jCheckBox = new JCheckBox("C");
		
		JCheckBox jCheckBox2 = new JCheckBox("c#");
		
		JCheckBox jCheckBox3 = new JCheckBox("pyhton");
		
		JCheckBox jCheckBox4 = new JCheckBox("php");
		
		JCheckBox jCheckBox5 = new JCheckBox("java",true);
		
		JCheckBox jCheckBox6 = new JCheckBox("go");	
		
		jPanel.add(jLabel);
		
		jPanel.add(jCheckBox);
		jPanel.add(jCheckBox2);
		jPanel.add(jCheckBox3);
		jPanel.add(jCheckBox4);
		jPanel.add(jCheckBox5);
		jPanel.add(jCheckBox6);
		
		frame.add(jPanel);
		
		frame.setSize(400, 100);
		
		frame.setVisible(true);
	

	}

}
