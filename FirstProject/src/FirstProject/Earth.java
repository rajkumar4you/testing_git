package FirstProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Earth {

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("src/FirstProject/Example.txt");
		Scanner sc = new Scanner(input);
		while(sc.hasNextLine()) {
			String s1 = sc.nextLine();
			System.out.println(s1);
			System.out.println("adding one more line");
			System.out.println("adding 2nd line");
		}
		sc.close();
	}

}
