
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf p = new Smurf("Papa Smurf");
		System.out.print(p.getName());
		System.out.println(p.getHatColor());
		System.out.println(p.isGirlOrBoy());
		Smurf s = new Smurf("Smurfette");
		System.out.print(s.getName());
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());
	}
}
