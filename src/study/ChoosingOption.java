package study;
import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?" );
		JOptionPane.showConfirmDialog(null,"You^ve chosen: " +(option==JOptionPane.YES_OPTION?"Yes" : "NO"));
		System.exit(0);
	}

}
