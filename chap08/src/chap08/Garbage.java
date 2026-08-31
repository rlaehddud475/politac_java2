package chap08;

class Garbage {
	public int no;
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 수거\n", no);
		
	}
	protected void finallize() {
		System.out.printf("Garbage(%d) 수거\n", no);
		
	}
}
