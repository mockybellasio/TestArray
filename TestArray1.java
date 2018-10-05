package fr.operateurs.console;

public class TestArray1 {

	public static void main(String[] args) {
		
	
                    int i;
		
		int[]array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
      
		for ( i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		
	}
	
	
	//tableau inversé 
	
	for( i = 0; i < array.length / 2; i++)
	  {
	      int temp = array[i];
	      array[i] = array[array.length - i - 1];
	      array[array.length - i - 1] = temp;}
	
     System.out.println("tableau inversé");
       for ( i=0; i<array.length;i++){
	    System.out.println(array[i]);
}
	
				
				
	// valeur minimale et valeur maximale
				
			       int valMax = 0;
					int valMin = 0;
					for( i = 0; i < array.length; i++){
		         if(array[i] < valMax)
		        	 valMax= array[i];
		           
		        	 System.out.println("\nValeur minimale = "+ valMax);
		         if(array[i] > valMin)
		        	 valMin= array[i];
		         
		           System.out.println("\nValeur maximale = "+ valMin);	
				
			}
				
		}
		
		
	}


	