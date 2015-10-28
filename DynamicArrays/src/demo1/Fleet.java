/**
 * not sure if ArrayList already has some sort of print method
 */
 
//another git test this one with ssh

package demo1;

import java.util.ArrayList;

public class Fleet extends ArrayList{
	
	public void printFleet() {
		for (int i = 0; i < this.size(); i++) {
			System.out.println("Car " + (i + 1) + ": ");
			((Car) this.get(i)).printCar();
			System.out.println();
		}
	}
}
