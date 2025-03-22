package Lab02;
import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int s = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(s < MAX_NUMBER_ORDERED) {
			itemOrdered[s] = disc;
			s++;
			System.out.println("The disc has been added: " + disc.getTitle());
		}else {
			System.out.println("The cart is already full");
		}
		
	}
	public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean f = false;
		for(int i = 0 ; i < s ;i++) {
			if(itemOrdered[i] == disc) {
				f = true;
				for(int j = i;j < s - 1; j++) {
					itemOrdered[j] = itemOrdered[j + 1];
				}
				itemOrdered[s - 1] = null;
				s--;
				System.out.println("The disc has been removed: " + disc.getTitle());
	            break;
			}
		}
		if(!f) {
			System.out.println("Item not found");
		}
	}
	public double totalCost() {
		 double sum = 0;
	        for (int i = 0; i < s; i++) {
	            sum += itemOrdered[i].getCost();
	        }
	     return sum;
	}
	public static void main(String[] args) {
		

	}

}
