package study;
import java.util.Scanner;

public class Lab64 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int y = 0;
        int m = 0;
        int a = 0;
        while (m == 0) {
            System.out.print("Enter month : ");
            String m1 = x.nextLine();
            if (m1.equalsIgnoreCase("January") || m1.equalsIgnoreCase("Jan") || m1.equals("1")) m = 1;
            else if (m1.equalsIgnoreCase("February") || m1.equalsIgnoreCase("Feb") || m1.equals("2")) m = 2;
            else if (m1.equalsIgnoreCase("March") || m1.equalsIgnoreCase("Mar") || m1.equals("3")) m = 3;
            else if (m1.equalsIgnoreCase("April") || m1.equalsIgnoreCase("Apr") || m1.equals("4")) m = 4;
            else if (m1.equalsIgnoreCase("May") || m1.equals("5")) m = 5;
            else if (m1.equalsIgnoreCase("June") || m1.equalsIgnoreCase("Jun") || m1.equals("6")) m = 6;
            else if (m1.equalsIgnoreCase("July") || m1.equalsIgnoreCase("Jul") || m1.equals("7")) m = 7;
            else if (m1.equalsIgnoreCase("August") || m1.equalsIgnoreCase("Aug") || m1.equals("8")) m = 8;
            else if (m1.equalsIgnoreCase("September") || m1.equalsIgnoreCase("Sep") || m1.equals("9")) m = 9;
            else if (m1.equalsIgnoreCase("October") || m1.equalsIgnoreCase("Oct") || m1.equals("10")) m = 10;
            else if (m1.equalsIgnoreCase("November") || m1.equalsIgnoreCase("Nov") || m1.equals("11")) m = 11;
            else if (m1.equalsIgnoreCase("December") || m1.equalsIgnoreCase("Dec") || m1.equals("12")) m = 12;
            else {
                System.out.println("Invalid month");
            }
        }        
        while(a == 0) {
            System.out.print("Enter year: ");           
            y = x.nextInt();
            a = 1;
            if(y <= 0) {
            	a = 0;
            	System.out.println("Invalid year");
            }
        }
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 4: case 6: case 9: case 11:
            	System.out.println("30");
                break;
            case 2:
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                	System.out.println("29");
                } else {
                	System.out.println("28");
                }
                break;
        }
    }
}