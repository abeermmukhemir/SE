package add;
import java.util.Scanner;
public class addition{
	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		int n1;
		int n2;
		int sum;
		System.out.print("enter first number");
		n1=input.nextInt();
		System.out.print("enter second number");
		n2=input.nextInt();
		sum=n1+n2;
		System.out.printf("sum is %d",sum);
		
	}
}
