package study;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Untitled4 {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<String>();
		car.add("Ab");
		car.add(0, "Bc");
		Collections.sort(car);
		
		for(int i = 0; i < car.size();i++) {
			System.out.println(car.get(i));
		}
		Collections.sort(car,Collections.reverseOrder());
		for(String i : car) {
			System.out.println(i);
		}
		Iterator<String> it = car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
