import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create dwarfs ArrayList
		ArrayList<String> dwarfs = new ArrayList<String>();
		
		//Populate dwarfs ArrayList
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		//Print dwarfs ArrayList
		System.out.println("Disney Dwarfs:");
		for (String dwarf:dwarfs) {
			System.out.println(dwarf);
		}
		
		//Create dwarves ArrayList
		ArrayList<String> dwarves = new ArrayList<String>();
		
		//Populate dwarves ArrayList
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("F�li");
		dwarves.add("K�li");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("�in");
		dwarves.add("Gl�in");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		//Print dwarves ArrayList
		System.out.println("\nTolkien Dwarves:");
		for (String dwarf : dwarves) {
			System.out.println(dwarf);
		}
		
	}
}
