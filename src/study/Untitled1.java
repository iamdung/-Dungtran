package study;

class Un2{
	static void ifcan() {
		System.out.println("The car can run");
	}
	static void speed(int ms) {
		System.out.println(ms);
	}
}

class Untitled1 {
	public String name;
	public int n;
	public int d = 100;
	public int sum(int x, int y) {
		 int a = x + y;
		return a;
	}
	public void callNum(int n) {
		this.n = n;
	}
	void printD() {
		System.out.println(n);
	}
	static int sus(int x) {
		return 2*x;
	}
	static double myNum(double a, double b) {
		return a*b;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public static void main(String[] args) {
		Un2 h = new Un2();
		Untitled1 s = new Untitled1();
		Untitled1 s1 = new Untitled1();
		int t = s.sum(2,3);
		s.setName("John");
		double y = myNum(4.1,5.4);
		System.out.println(t);
		s.callNum(12);
		s.printD();
		s1.d = 1000;
		System.out.println(s.getName());
		System.out.println(s1.d);
		System.out.println(y);
		System.out.println(sus(4));	
		System.out.println(s.d);
		h.ifcan();
		h.speed(200);
		}
}
