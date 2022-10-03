package PAa;

import java.util.Scanner;

public class Paa {

	public static void main(String[] args) {

		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter number of yards: ");
		        int yards = in.nextInt();
		        System.out.print("Enter number of feet: ");
		        int feet = in.nextInt();
		        System.out.print("Enter number of inches: ");
		        int inches = in.nextInt();
		        int totalInches = (((yards * 3) + feet) * 12) + inches;
		        System.out.println("Total number of inches: " + totalInches);
		    }


	}


