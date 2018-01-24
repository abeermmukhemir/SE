package add2;
import javax.swing.JOptionPane;
public class add2 {

	public static void main(String[] args) {
	String num1 , num2;
	int n1 , n2 , sum;
	num1=JOptionPane.showInputDialog("enter the first number");
	num2=JOptionPane.showInputDialog("enter the second number");
    n1=Integer.parseInt(num1);
    n2=Integer.parseInt(num2);
    sum=n1+n2;
    JOptionPane.showMessageDialog(null, "the sumation is "+sum,"RESULT",JOptionPane.PLAIN_MESSAGE);
	System.exit(0);;
	}

}
