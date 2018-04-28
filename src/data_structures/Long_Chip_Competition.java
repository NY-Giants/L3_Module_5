package data_structures;
import java.util.ArrayList;
import java.util.Random;

public class Long_Chip_Competition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	public static void main(String[] args) {
		Long_Chip_Competition LCC = new Long_Chip_Competition();
		LCC.initializeBeatles();
	}
	
	private void initializeBeatles() {
	
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
		
		double longestchiplength = 0;
		String savebeatlename = "";
		
		for(int j = 0; j < theBeatles.size(); j++) {
			
		for(int i = 0; i < theBeatles.get(j).getChips().size(); i++) {
			if(theBeatles.get(j).getChips().get(i).getLength() > longestchiplength) {
				longestchiplength = theBeatles.get(j).getChips().get(i).getLength();
				savebeatlename = theBeatles.get(j).getName();
			}
			
		}
		}
		System.out.println(savebeatlename + " has the longest chip with a length of " + longestchiplength);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}