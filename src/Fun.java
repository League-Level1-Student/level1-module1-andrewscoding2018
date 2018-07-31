import javax.swing.JOptionPane;

public class Fun {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Give me a number.");
		int ad = Integer.parseInt(a);
		String b = JOptionPane.showInputDialog("Give me another number.");
		int bd = Integer.parseInt(b);
		String c = JOptionPane.showInputDialog("Give me another number.");
		int cd = Integer.parseInt(c);
		String d = JOptionPane.showInputDialog("Give me another number.");
		int dd = Integer.parseInt(d);
		String e = JOptionPane.showInputDialog("Give me another number.");
		int ed = Integer.parseInt(e);
		String f = JOptionPane.showInputDialog("Give me another number.");
		int fd = Integer.parseInt(f);
		String g = JOptionPane.showInputDialog("Give me another number.");
		int gd = Integer.parseInt(g);
		String h = JOptionPane.showInputDialog("Give me another number.");
		int hd = Integer.parseInt(h);

		if (ad < bd || ad < cd || ad < dd || ad < ed || ad < fd || ad < gd || ad < hd) {
			System.out.println("The lowest number is " + ad + ".");
		} else if (bd < ad || bd < cd || bd < dd || bd < ed || bd < fd || bd < gd || bd < hd) {
			System.out.println("The lowest number is " + bd + ".");
		} else if (cd < ad || cd < bd || cd < dd || cd < ed || cd < fd || cd < gd || cd < hd) {
			System.out.println("The lowest number is " + cd + ".");
		} else if (dd < bd || dd < cd || dd < ad || dd < ed || dd < fd || dd < gd || dd < hd) {
			System.out.println("The lowest number is " + dd + ".");
		} else if (ed < bd || ed < cd || ed < ad || ed < ad || ed < fd || ed < gd || ed < hd) {
			System.out.println("The lowest number is " + ed + ".");
		} else if (fd < bd || fd < cd || fd < dd || fd < ed || fd < ad || fd < gd || fd < hd) {
			System.out.println("The lowest number is " + fd + ".");
		} else if (gd < bd || gd < cd || gd < dd || gd < ed || gd < fd || gd < ad || gd < hd) {
			System.out.println("The lowest number is " + gd + ".");
		} else if (hd < bd || hd < cd || hd < dd || hd < ed || hd < fd || hd < gd || hd < ad) {
			System.out.println("The lowest number is " + hd + ".");
		}

	}
}
