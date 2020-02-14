package capgemini;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
String name;
String gender;
Scanner in=new Scanner(System.in);
name=in.nextLine();
age=in.nextInt();
gender=in.next();
switch(gender) {
case "male":
 if(age<18) {
	System.out.println("you are too young to play this game");
    }
   else if(age>30) {
	System.out.println("you are too old to play this game");
    }
   else {
	System.out.println("hello "+name+" welcome to pubg");
    }
 break;
case "female":
	if(age<16) {
		System.out.println("you are too young to play this game");
	}
	else if(age>32) {
		System.out.println("you are too old to play this game");
	}
	else {
		System.out.println("hello "+name+" welcome to pubg");
	}
	break;
	default:
	System.out.println("in-valid");
	}
	}
}


