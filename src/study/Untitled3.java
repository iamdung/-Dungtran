package study;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Untitled3 {

	public static void main(String[] args) {
		LocalDate o = LocalDate.now(); 
		LocalTime x = LocalTime.now();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string,integer,real number and float number:");
		String n = obj.nextLine();
		int a = obj.nextInt();
		double b = obj.nextDouble();
		float c = obj.nextFloat();
		System.out.println("The string is " + n);
		System.out.println("The integer is " + a);
		System.out.println("The real number is " + b);
		System.out.println("The float number is " + c);
		System.out.println(o);
		System.out.println(x);
	}

}
