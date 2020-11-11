package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean writeStatus;
		String collection = samling.toString();
		File f = new File(mappe + "/" + filnavn);
		try {
			PrintWriter skriver = new PrintWriter(f);
			skriver.print(collection);
			writeStatus = true;
			skriver.close();
		} catch (FileNotFoundException e) {
			writeStatus = false;
		}

		return writeStatus;

	}

}
