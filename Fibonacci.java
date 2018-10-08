package com.array;

public class Fibonacci {

	public static void main(String[] args) {
	
		// calcul de la suite de Fibonacci à partir de l'indice 5
		
		int index = 5;
		
		while (true){
			System.out.println(fibonacci(index));
			index++;
			
		}

	}
		public static long fibonacci(int i) {
		
		
			if (i==0) return 0;
			if (i<=2) return 1;
			
			long fibterm = fibonacci(i-1) + fibonacci (i-2);
			return fibterm ;
			
			
			
	
		}



		
	}


