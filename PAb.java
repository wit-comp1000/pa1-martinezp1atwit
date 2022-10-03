package PAa;

import java.util.Scanner;

public class PAb {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
        System.out.print("Enter number of inches: ");
        int inches = in.nextInt();
        int yards = inches / 36;
        inches %= 36;
        int feet = inches / 12;
        inches %= 12;
        System.out.printf(%d %d %d,yards,feet,inches);

}
}
