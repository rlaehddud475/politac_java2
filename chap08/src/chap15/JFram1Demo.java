package chap15;

import javax.swing.JFrame;

class MyFram extends JFrame{
	MyFram(){
		setTitle("안녕, 스윙!");
		setSize(300,100);
		setVisible(true);
	}
}
public class JFram1Demo {
public static void main(String[] args) {
	new MyFram();
}
}
