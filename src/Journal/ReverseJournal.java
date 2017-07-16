package Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseJournal {

	File journal = new File("Journal");
	Scanner s = new Scanner(System.in);
	PrintWriter out;

	ReverseJournal(File journal, Scanner s) {
		this.journal = journal;
		this.s = s;
	}

	void addEntry() throws IOException {
		out = new PrintWriter(new FileWriter(journal, true));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		out.println(encrypt(dtf.format(now)));
		String input = s.nextLine();
		while (!input.equals("end")) {
			if (input.equals("read")) {
				readEntry();
			}
			out.println(encrypt(input));
			input = s.nextLine();
		}
		out.close();
	}

	/**
	 *
	 * @throws FileNotFoundException
	 */
	void readEntry() throws FileNotFoundException {
		Scanner scoop = new Scanner(journal);
		while (scoop.hasNextLine()) {
			String scan = scoop.nextLine();
			System.out.println(decrypt(scan));
		}
		scoop.close();
	}

	/**
	 *
	 * @param in
	 */
	String encrypt(String in) {
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : in.toCharArray()) {
			chars.add(c);
		}
		String sti = "";
		for (char car : chars) {
			sti += (car += 37);
		}
		return sti;
	}

	/**
	 *
	 * @param in
	 * @return
	 */
	String decrypt(String in) {
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : in.toCharArray()) {
			chars.add(c);
		}
		String sto = "";
		for (char car : chars) {
			sto += (car -= 37);
		}

		return sto;
	}

}
