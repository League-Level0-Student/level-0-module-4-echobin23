package extra;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;

public class Testscores {
	public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What was your test score");
double score =	Double.parseDouble(answer);
	if(score== 100.0) {
		JOptionPane.showMessageDialog(null, "Woah you must have studied hard for that test");
		}
	else if(score== 90.5) {
		JOptionPane.showMessageDialog(null, "Great score you must have studied");
	}
	else if(score==80.0) {
		JOptionPane.showMessageDialog(null, "good job thats pretty good");
	}
	else {
		JOptionPane.showMessageDialog(null, "it's alright try doing better next time");
	}
	}
}
