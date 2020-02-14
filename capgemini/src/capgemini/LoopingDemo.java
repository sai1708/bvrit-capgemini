package capgemini;

import java.util.Scanner;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		System.out.println("enter a no.");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
