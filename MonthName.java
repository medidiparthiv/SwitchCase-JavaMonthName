import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.print("Enter a Number between 1 and 12 : ");
	    int a = x.nextInt();
	    
	    switch(a){
	        case(1):
	            System.out.println("The First Month of the Year is January");
	            break;
	        case(2):
	            System.out.println("The Second Month of the Year is February");
	            break;
	        case(3):
	            System.out.println("The Third Month of the Year is March");
	            break;
	        case(4):
	            System.out.println("The Fourth Month of the Year is April");
	            break;
	        case(5):
	            System.out.println("The Fifth Month of the Year is May");
	            break;
	        case(6):
	            System.out.println("The Sixth Month of the Year is June");
	            break;
	        case(7):
	            System.out.println("The Seventh Month of the Year is July");
	            break;
	        case(8):
	            System.out.println("The Eighth Month of the Year is August");
	            break;
	        case(9):
	            System.out.println("The Ninth Month of the Year is September");
	            break;
	        case(10):
	            System.out.println("The Tenth Month of the Year is October");
	            break;
	        case(11):
	            System.out.println("The Eleventh Month of the Year is November");
	            break;
	        case(12):
	            System.out.println("The Twelfth Month of the Year is December");
	            break;
	    }
	}
}
