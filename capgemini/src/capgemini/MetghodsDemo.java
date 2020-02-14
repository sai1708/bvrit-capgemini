package capgemini;

import java.util.Scanner;

public class MetghodsDemo {
	
public	float add(float a,float b) {
		return a+b;
	}
public	float subtract(float a,float b) {
		return a-b;
	}
public	float mul(float a,float b) {
		return a*b;
	}
public	float divide(float a,float b) {
		return a/b;
	}
public float average(float a,float b) {
	return (a+b)/2;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetghodsDemo md=new MetghodsDemo();
		Scanner in=new Scanner(System.in);
		float x,y,result=0;
		System.out.println("enter two numbers");
		x=in.nextFloat();
		y=in.nextFloat();
		System.out.println("choose operation:" +"\n\t 1-> add "
		                                       +"\n\t 2-> sub"
				                               +"\n\t 3->mul"
		                                       +"\n\t 4->div"
				                               +"\n\t 5->average");
		int op=in.nextInt();
	switch(op) {
	case 1:
		result=md.add(x,y);
		break;
	case 2:
		result=md.subtract(x,y);
		break;
	case 3:
		result=md.mul(x,y);
		break;
	case 4:
		result=md.divide(x,y);
		break;
	case 5:
		result=md.average(x, y);
		break;
	default:
			System.out.println("invalid");
		}
		System.out.println("result        "
				+ "" +result);
}
}
