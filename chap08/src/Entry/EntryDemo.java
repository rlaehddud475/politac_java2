package Entry;

public class EntryDemo {

	public static void main(String[] args) {
		Entry<String, Integer> entry1 = new Entry<>("김선달", 20);
        Entry<String, String> entry2 = new Entry<>("기타", "등등");

        System.out.println(entry1.getKey() + " " + entry1.getValue());
        System.out.println(entry2.getKey() + " " + entry2.getValue());
	}

}
