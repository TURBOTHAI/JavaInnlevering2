package no.hvl.dat100.tabeller;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt; 

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int i:tabell) {
			System.out.print(i+" ");
		}

		// TODO

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String result = tilStreng(tabell);
		
		System.out.print("[");
		for (int i: tabell) {
			System.out.print(tabell[i]);
			if (i<tabell.length-1) {
				System.out.print(",");
				
			}
		System.out.print("]");
		}
		
		
		
		

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
