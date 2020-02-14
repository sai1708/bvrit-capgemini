package capgemini;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,j;for(i=1;i<=50;i++) {
	   if(i%3==0 && i%5==0) {
		   System.out.println("abc xyz");
	   }
        else if(i%3==0) {
		   System.out.print("abc ");
	   }
	   else if(i%5==0) {
		   System.out.print("xyz ");
	   }
	   else {
		   System.out.print(i +" " );
	   }
   }
	}

}
