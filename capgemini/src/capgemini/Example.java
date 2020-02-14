package capgemini;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,n,r,si;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a p value");
		p=in.nextFloat();
		System.out.println("enter a n value");
		n=in.nextFloat();
		System.out.println("enter a r value");
		r=in.nextFloat();
		si=(p*n*r)/100;
		System.out.println(si);

	}

}
