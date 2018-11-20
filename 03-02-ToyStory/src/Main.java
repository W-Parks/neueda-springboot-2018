import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toy woody = new Toy("Woody", "Tom", "Hanks");
		Toy buzz = new Toy("Buzz Lightyear", "Tim", "Allen");
		Toy slinky = new Toy("Slinky Dog", "Jim", "Varney");
		Toy hamm = new Toy("Hamm", "John", "Ratzenberger");
		Toy rex = new Toy("Rex", "Wallace", "Shawn");
		Toy potato = new Toy("Mr. Potato Head", "Don", "Rickles");
		
		ArrayList<Toy> toys = new ArrayList<Toy>();
		toys.add(woody);
		toys.add(buzz);
		toys.add(slinky);
		toys.add(hamm);
		toys.add(rex);
		toys.add(potato);

		for(Toy toy:toys) {
			System.out.println(toy.getCharName() + " - " + toy.getFirstName() + " " + toy.getLastName());
		}
		
	}

}
