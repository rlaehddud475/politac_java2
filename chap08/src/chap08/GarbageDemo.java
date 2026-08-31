package chap08;

import java.util.Iterator;

public class GarbageDemo {

	public static void main(String[] args) {
	 for (int i=0; i<3; i++) {
new Garbage(i);
		System.gc();
	}

	}

}
