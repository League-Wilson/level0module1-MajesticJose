package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String HieusPower = "Starve";
String HelensPower = "eat";
String JamiesPower ="sleep";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String NameAnswer = JOptionPane.showInputDialog(null, "Enter your name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(NameAnswer.equalsIgnoreCase("Hieu")){
	JOptionPane.showMessageDialog(null, HieusPower);
}
 if(NameAnswer.equalsIgnoreCase("Helen")){
	 JOptionPane.showMessageDialog(null, HelensPower);
 }
 if(NameAnswer.equalsIgnoreCase("Jamies")){
	 JOptionPane.showMessageDialog(null, JamiesPower);
 }
}
}