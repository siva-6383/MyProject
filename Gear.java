package inheritance;

import java.util.Scanner;

public class Gear {
	public void calc(int gear) {
		if(gear>0 && gear<=1) {
			System.out.println("your speed limit is 25 km/hr");
		}
		else if(gear>1 && gear<=2) {
			System.out.println("your speed limit is 50 km/hr");
		}
		else if(gear>2 && gear<=3) {
			System.out.println("your speed limit is 75 km/hr");
		}
		else if(gear>3 && gear<=4) {
			System.out.println("your speed limit is 100 km/hr");
		}
		else {
			System.out.println("you speed level 4 gears");
		}
	}

}

