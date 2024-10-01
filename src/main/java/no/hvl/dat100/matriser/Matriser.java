package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i=0;i<matrise.length;i++) {
			for(int j=0;j<matrise[i].length;j++) {
				System.out.print(matrise[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	// b)
	public static void tilStreng(int[][] matrise) {

			for(int i=0 ; i<matrise.length; i++) {
			
				System.out.print(" ");
		
				for (int j=0; j<matrise.length; j++) {
			
					System.out.print(" ");
	
					System.out.print(matrise[i][j]);
			
					}
				System.out.print("\n");
			}
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
