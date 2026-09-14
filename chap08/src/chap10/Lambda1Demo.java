package chap10;

import java.util.Arrays;
ty

public class Lambda1Demo {

	public static void main(String[] args) {
		String[] s = {"로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다"};
		Arrays.sort(s, (first,  second)->first.length()-second.length());
		for(String ss : s)
			System.out.println(ss);
	}

}
