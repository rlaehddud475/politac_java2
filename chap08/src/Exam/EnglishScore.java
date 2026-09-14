package Exam;

import java.util.Collection;
import java.util.Collections;

public class EnglishScore implements Comparable<EnglishScore > {
	String name;
	int score;
	public EnglishScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return name + ", " + score;
    }



	public int compareTo(EnglishScore e) {
		
		return Integer.compare(this.score, e.score);
	
	}
	public static <T extends Comparable<T>> T findBest(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T best = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(best) > 0) {
                best = a[i];
            }
        }
        
        return best;
    }
	
	public static <T> T findScore(T[] a, String name) {
        if (a == null || name == null) {
            return null;
        }
        
        for (T item : a) {
      
            if (item != null && item.toString().contains(name)) {
                return item;
            }
        }
        return null;
    }
	public static void main(String[] args) {
		MathScore[] ma = {
				new MathScore("김삿갓", 80),
				new MathScore("장영실", 98),
				new MathScore("홍길동", 70)
			};
		String name = "김삿갓";
//		String name = null;
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77),new EnglishScore("장영실", 88),new EnglishScore("홍길동", 99)};
		System.out.println("영어 최고 점수 : "+findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));
		
		System.out.println("영어 점수 : "+findScore(ea,name));
		System.out.println("수학 점수 : " + findScore(ma,name));
	}
}
