package study;
import java.util.HashMap;
public class Untitled5 {

	public static void main(String[] args) {
		HashMap<String, String> cap = new HashMap<String, String>();
		cap.put("England", "London");
		cap.put("Germany","Berlin");
		cap.remove("England");
		System.out.println(cap);
	}

}
