package study;
import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = x.nextDouble();
		System.out.println("Enter b: ");
		double b = x.nextDouble();
		System.out.println("Enter c: ");
		double c = x.nextDouble();
		double del = b*b - 4*a*c;
		if(del < 0) {
			System.out.println("No sol");
		}else if(del == 0) {
			double d = -b/(2*a);
			System.out.println(d);
		}else if(del > 0) {
			double x1 = (-b - Math.sqrt(del))/(2*a);
			double x2 = (-b + Math.sqrt(del))/(2*a);
			System.out.println(x1);
			System.out.println(x2);
		}else if(a == 0) {
			if(b == 0 && c != 0) {
				System.out.println("No sol");
			}else if(b == 0 && c == 0) {
				System.out.println("Infinite sol");
			}else if(b != 0) {
				double d = -c/b;
				System.out.println(d);
			}
		}
	}

}
