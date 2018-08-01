import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Binary implements ActionListener {
	JButton button;
	JTextField answer;

	public static void main(String[] args) {
		Binary b = new Binary();
		b.createUI();
	}

	public void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		answer = new JTextField(20);
		panel.add(answer);
		button = new JButton("Convert");
		button.addActionListener(this);
		panel.add(button);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(button)) {
			convert(answer.getText());
		}

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

}
