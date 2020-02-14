package capgemini;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the percentage");
        per=in.nextInt();
        if(per>80 && per<=100) {
        	System.out.println("Grade-A");
        }
        else if(per<=80 && per>=60) {
        	System.out.println("Grade-B");
        }
        else if(per<0 || per>100) {
        	System.out.println("in-valid");
        }
        else {
        	System.out.println("Grade-F");
        }
        }
	}


