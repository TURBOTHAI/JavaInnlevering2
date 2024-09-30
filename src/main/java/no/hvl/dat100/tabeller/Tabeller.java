package no.hvl.dat100.tabeller;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt; 

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int i:tabell) {
			//System.out.print(i+" ");
		}

		// TODO

	}

	// b)
	public static String tilStreng(int[] tabell) {
		if (tabell==null && tabell.length==0) {
			return "[]";
		}
	
		
		String result ="[";
	
		for (int i=0; i<tabell.length;i++) {
			result= result + Integer.toString(tabell[i]);
			if (i<tabell.length-1) {
			result+=",";
			}
		
		}
		result+="]";
		//System.out.print(result);
		return result;
		
	}
	

	// c)
	public static int summer(int[] tabell) {
		int sum =0;
		for(int i =0;i<tabell.length;i++) {
			sum=sum+tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean test= false;
		for (int i =0;i<tabell.length; i++) {
			if (tabell[i]==tall) {
				test=true;
				break;
				
			}
		}
		//System.out.println(test);
		return test;
		
	

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser( int[] tabell) {
		int[] nyTabell=new int[tabell.length];
		for(int i=tabell.length-1;i>=0;i--) {
			nyTabell[tabell.length-1-i]=tabell[i];
			//System.out.print(nyTabell[i]);
			
			
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int[]nyTabell=new int[tabell.length];
		boolean sortert=true;
		int k =1;
		int temp=0;
		while(sortert && k<tabell.length) {
			if(tabell[k-1]<= tabell[k]) {
				k++;
			}else {
				sortert=false;
			}
		}
		
		if(!sortert) {
			System.out.println("listen må være sortert");
	
		for (int i =0; i<tabell.length-1;i++) {
			for(int j=i+1;j<tabell.length;j++) {
				if(tabell[j]<tabell[i])
					temp=tabell[i];
					tabell[i]=tabell[j];
					tabell[j]=temp;
					
			}
		 }
		}
		return sortert;
	  }  		
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
