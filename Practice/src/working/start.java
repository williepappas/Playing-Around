package working;

import java.util.Scanner;

public class start {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Do you want to write to or view your schedule? Type view to see your schedule and open to write to your schedule.");
		String s = x.nextLine();
		if(s.equalsIgnoreCase("open")) {
			readfile r = new readfile();
			r.openFile();
			r.addFile();
			r.closeFile();
		} else if (s.equalsIgnoreCase("view")) {
			viewfile z = new viewfile();
			z.openFile();
		} else {
			System.out.println("Error");
		}
			
	}
}
