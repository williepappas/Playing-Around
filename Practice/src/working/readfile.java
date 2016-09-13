package working;

import java.io.*;
import java.util.*;
import java.lang.*;
public class readfile {
	private Formatter g;
	
	public void openFile() {
		try {
			g = new Formatter("chinese.txt");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
	
	public void addFile() {
		System.out.println("What do you want to add to the file?");
		Scanner job = new Scanner(System.in);
		g.format(job.nextLine() + "\n");
		g.format(job.nextLine());
	}
	
	public void closeFile() {
		g.close();
	}
	
}