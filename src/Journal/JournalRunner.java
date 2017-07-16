package Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class JournalRunner {

	public static void main(String[] args) {
		File journal = new File("Journal");
		Scanner s = new Scanner(System.in);
		ReverseJournal RJ = new ReverseJournal(journal, s);
		try {
			RJ.addEntry();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR ERrOR ERROR");
		} catch (IOException e) {
			System.out.println("ERrOR ERROR ERrOR");
		}
		// try {
		// RJ.readEntry();
		// } catch (FileNotFoundException e) {
		// System.out.println("ERROR ERrOR ERROR");
		// }
	}
}
