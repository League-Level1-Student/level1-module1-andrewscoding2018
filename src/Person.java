
public class Person {
	private String name;
	private String superpower;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSuper(String superpower) {
		this.superpower = superpower;
	}

	public String getSuper() {
		return superpower;
	}
	public String toString()
	{
	return getName() + " has mad "+ getSuper() + " skills.";
	}
}
