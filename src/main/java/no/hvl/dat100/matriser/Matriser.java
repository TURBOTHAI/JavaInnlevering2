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
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean svar = false;
		
		if(mat1.length == mat2.length) {
			
		for(int i=0 ; i<mat1.length; i++) {
			
			if(mat1[i].length == mat2[i].length) {
			
			for (int j=0; j<mat1[i].length; j++) {
			
				if(mat1[i][j] == mat2[i][j]) {
					svar = true;
				}
				
			}
		}
	 }
	}
			return svar;
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
