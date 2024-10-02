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
	 public static String tilStreng(int[][] matrise) {
	    	
	        String tabell = ""; 


	        for (int i = 0; i < matrise.length; i++) {
	            
	            for (int j = 0; j < matrise[i].length; j++) {
	            	
	                tabell += matrise[i][j]+ " "; 
	            }
	            	tabell += "\n"; 
	        	}

	        	return tabell; 
	    	}
		
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
int[][] nyMatrise = new int[matrise.length][];
		
		for(int i=0 ; i<matrise.length; i++) {
			
			nyMatrise[i] = new int[matrise[i].length];
			
			for (int j=0; j<matrise[i].length; j++) {
			
				nyMatrise[i][j] = matrise[i][j]*2;
				
			}
	
	} return nyMatrise;
	
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
