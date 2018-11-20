
public class Toy {

	private String charName;
	private String firstName;
	private String lastName;

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Toy() {
		super();
	}

	public Toy(String charName, String firstName, String lastName) {
		super();
		this.charName = charName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
