package study;
import java.util.Scanner;
public class BankAccount {
	static boolean debit(double balance) {
		if(balance < 0) return true;
		else return false;
	}
	static void credit(double balance) {
		System.out.println("Balance: " + balance);
	}
	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.println("Enter name:");
		String owner = g.nextLine();
		System.out.println("Enter balance:");
		double balance = g.nextDouble();
		if(debit(balance) == true) System.out.println("You are broke");
		else {
			System.out.println("Owner: " + owner);
			credit(balance);
		}
		

	}

}
