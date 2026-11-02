package chap11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "사과", "키위", "포도", "수박" ,"망고"};
		List<String> list=Arrays.asList(fruits);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
