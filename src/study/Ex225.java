package study;
import java.util.Scanner;
public class Ex225 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = x.nextDouble();
		System.out.println("Enter b: ");
		double b = x.nextDouble();
		double sum = a + b;
		double dif = a - b;
		double prd = a * b;
		double quo = (b != 0) ? (a/b) : Double.NaN;
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + dif);
		System.out.println("Product = " + prd);
		System.out.println("Quotient = " + quo);
	}

}
