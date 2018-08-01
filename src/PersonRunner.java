
public class PersonRunner {
public static void main(String[] args) {
	Person a = new Person();
	Person b = new Person();
	Person c = new Person();
	a.setSuper("flying");
	b.setSuper("mountain biking");
	c.setSuper("drinking");
	a.setName("NotAidan");
	b.setName("Magnus");
	c.setName("Axel");
	System.out.println(c.toString());
}
}
