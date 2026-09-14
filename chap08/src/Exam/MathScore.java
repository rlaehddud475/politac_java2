package Exam;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;
	
	public MathScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ", " + score;
	}

	public int compareTo(MathScore m) {
		return Integer.compare(this.score, m.score);
	}
	

}
