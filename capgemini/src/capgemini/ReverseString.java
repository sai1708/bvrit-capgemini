package capgemini;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s;
		System.out.println("enter a string : ");
		s=in.nextLine();
		int len=s.length();
		StringBuffer s2=new StringBuffer(s);
		for(int i=0, j=len-1; i<len; i++,j--) {
			s2.setCharAt(i,s.charAt(j));
		}
		System.out.println("reverse is " +s2);

	}

}
