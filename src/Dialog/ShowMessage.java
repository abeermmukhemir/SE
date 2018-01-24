package Dialog;
import javax.swing.JOptionPane;
public class ShowMessage {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null,"welcome to JAVA");
JOptionPane.showMessageDialog(null,"WELCOME","Plain Message",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,"WELCOME","Information Message",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,"WELCOME","Warning Message",JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null,"WELCOME","Error Message",JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null,"WELCOME","Question Message",JOptionPane.QUESTION_MESSAGE);

String name=JOptionPane.showInputDialog("what is your name?");
String message=String.format("WELCOME, %s TO JAVA", name);
JOptionPane.showMessageDialog(null, message);
System.exit(0);
	}

}
