package study;
import java.util.Scanner;
public class Ex226 {
	static void first_degree_equation() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = x.nextDouble();
		System.out.println("Enter b: ");
		double b = x.nextDouble();
		double c = (a != 0) ? (-b/a) : Double.NaN;
		System.out.println("Result: " + c);
	}
	static void first_degree_equation_2_variables() {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a11: ");
		double a11 = x.nextDouble();
		System.out.println("Enter a12: ");
		double a12 = x.nextDouble();
		System.out.println("Enter a21: ");
		double a21 = x.nextDouble();
		System.out.println("Enter a22: ");
		double a22 = x.nextDouble();
		System.out.println("Enter b1: ");
		double b1 = x.nextDouble();
		System.out.println("Enter b2: ");
		double b2 = x.nextDouble();
		double del = a11*a22 - a21*a12;
		double del1 = b1*a22 - b2*a12;
		double del2 = a11*b2 - a21*b1;
		if(del != 0) {
			double x1 = del1/del;
			double x2 = del2/del;
			System.out.println(x1);
		    System.out.println(x2);	
		}else if(del1 != 0 || del2 != 0) {
			System.out.println("No sol");
		}else if(del1 == 0 && del2 == 0) {
			System.out.println("Infinite sol");
		}
	}
	static void second_degree_equation() {
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
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the choice: ");
		int x = a.nextInt();
		if(x == 1) first_degree_equation();
		else if(x == 2) first_degree_equation_2_variables();
		else if(x == 3) second_degree_equation();
	}
		

}
