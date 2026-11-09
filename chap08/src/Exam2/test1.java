package Exam2;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		List<String> capitals = new ArrayList<>();

        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("파리");
        capitals.add("마드리드");

        for (String capital : capitals) {
            System.out.print(capital + " ");
        }
        System.out.println();

        capitals.add("런던");

        java.util.Iterator<String> iterator = capitals.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        capitals.removeIf(s -> s.length() >= 3);

        for (String capital : capitals) {
            System.out.print(capital + " ");
        }
        System.out.println();
    }
}
