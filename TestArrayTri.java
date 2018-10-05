package fr.operateurs.console;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
    
		
	    for (int entier : array) {
		
	      System.out.println("nombre: " + entier);
	   }

	 
	         Arrays.sort(array);

	  
	     System.out.println("Tableau trié\n");
	   

	   String trie = "valeur";
	   for (int trie1 : array) {
		   System.out.println("nombre: " + trie1);  
	   }
	}     
		

		
	}


