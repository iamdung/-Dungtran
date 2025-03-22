package study;
import java.util.Arrays;
import java.util.Scanner;
public class Lab65 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = x.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }        
        Arrays.sort(arr);
        int sum = 0;
        for (int num = 0; num < arr.length;num++) {
            sum += arr[num];
        }
        double avg = (double) sum / n;       
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(avg);
    }
}