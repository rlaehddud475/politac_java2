package chap09;

import Object.Cup;

public class GenericClass1Demo {

	public static void main(String[] args) {
		Cup c=new Cup();
		c.setBeverge(new Beer());
		Beer b1 = (Beer) c.getBeverge();
		c.setBeverge(new Boricha());
		b1 = (Beer) c.getBeverge();
	}

}
