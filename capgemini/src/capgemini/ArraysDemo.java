package capgemini;
import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int []a=new int[5];
		int i,j;
			System.out.println("enter a no:");
			for(i=0;i<5;i++) {
			a[i]=in.nextInt();
		}
	for(i=0;i<5;i++) {
	for(j=i+1;j<5;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
		}
	}
	}
		System.out.println("after sorting");
		for(int k:a) {
			System.out.println(k);
		}
		//for(i=0;i<5;i++){
		//System.out.println(a[i]);
	//}
	
	}

}
