package chap15;

import javax.swing.*;


public class JFram4Demo extends JFrame{
JFram4Demo() {
	setTitle("안녕, 스윙!");
	JPanel p = new JPanel();
	JLabel l=new JLabel("안녕, 스윙!");
	JButton b = new JButton("버튼");
	p.add(l);
	p.add(b);
	add(p);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,100);
//	pack();
	setVisible(true);
}
public static void main(String[] args) {
	new JFram4Demo();
}
}
