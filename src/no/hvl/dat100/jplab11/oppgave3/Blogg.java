package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {

		innleggtabell = new Innlegg[20];

		nesteledig = 0;
	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];

		nesteledig = 0;
	}

	public int getAntall() {

		return this.nesteledig;
	}

	public Innlegg[] getSamling() {

		return this.innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;

		while (pos < this.nesteledig && !funnet) {

			if (this.innleggtabell[pos].erLik(innlegg)) {
				
				return pos;
			
			} else {
				pos++;  
			}
		} return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
	 boolean finnes = false;
	 int pos = 0;
	 
	 while (pos < this.nesteledig && !finnes) {
		
		 if (this.innleggtabell[pos].erLik(innlegg)) {
			 
			 finnes = true;
		 } else {
			 pos++;
		 }
	 } return finnes;
	}

	public boolean ledigPlass() {
		
		if (innleggtabell.length > nesteledig) {
			
			return true;
		} else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;

		if (ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}
	}
	

	public String toString() {
		
		String str = nesteledig + "\n";

		for (int i = 0; i < nesteledig; i++) {
			str += innleggtabell[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}