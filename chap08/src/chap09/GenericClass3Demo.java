package chap09;

import Generic.Cup;

public class GenericClass3Demo {

	public static void main(String[] args) {
		Cup<Beer> c = new Cup<Beer>();
		c.setBeverage(new Beer());
		Beer beer = c.getBeverage();

	}

}
