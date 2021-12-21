
public class Formen {

	public static void main(String[] args) {
		       System.out.println("Geben Sie eine Zahl ein.");
		       int anzahl = HumboldtHelper.readInt();
		   
		       System.out.println("\n1. Vertikale Linie: ");
		       for (int i = 0; i < anzahl; i++) {
		       System.out.println("x");
		      }
		     
		       String ergebnis = "";
		       System.out.println("\n2. Horizontale Linie: ");
		        for (int j = 0; j < anzahl; j++ ) {
		         ergebnis = ergebnis + "x ";
		        }
		        System.out.println(ergebnis);
		       
		       ergebnis = "";
		       System.out.println("\n3. Quadrat:");
		       for (int j = 0; j < anzahl; j++ )
		       {
		         for (int i = 0; i < anzahl; i++ )
		         {
		           ergebnis = ergebnis + "x ";
		         }
		          System.out.println(ergebnis);
		          ergebnis = "";
		        }
		   
		        ergebnis = "";
		        System.out.println("\n4. Rechteck:");
		        for (int j = 0; j < anzahl; j++ )
		       {
		         for (int i = 0; i < (anzahl * 2); i++ )
		         {
		           ergebnis = ergebnis + "x ";
		         }
		          System.out.println(ergebnis);
		          ergebnis = "";
		        }
		       
		        ergebnis = "";
		        System.out.println("\n5. Dreieck 1:");
		        for (int i = 1; i <= anzahl; i++) {
		            for (int j = 1; j <= i; j++) {
		               ergebnis = ergebnis + " x";
		            }
		            System.out.println(ergebnis);
		            ergebnis = "";
		        }
		       
		        System.out.println("\n6. Dreieck 2:");
		        for (int i = 1; i <= anzahl; i++) {
		            for (int j = anzahl; j >= i; j = j - 1) {
		               ergebnis = ergebnis + " x";
		            }
		            System.out.println(ergebnis);
		            ergebnis = "";
		        }
		   
		        System.out.println("\n7. Diagonale:");
		        for (int i = 1; i <= anzahl; i++) {
		            for (int j = 1; j <= i; j++) {
		               if(j == i) {
		            	   ergebnis = ergebnis + " x";
		               }
		               else {
		            	   ergebnis = ergebnis + "  ";
		               }
		            }
		            System.out.println(ergebnis);
		            ergebnis = "";
		        }
		        
		        System.out.println("\n8. Diagonale 2:");
		        for(int i = 1; i <= anzahl; i++) {
		        	for(int j = 1; j <= anzahl; j++) {
		        		if(i + j == anzahl + 1) {
		        			ergebnis = ergebnis + " x";
		        		} 
		        		else {
		        			ergebnis = ergebnis + "  ";
		        		}
		        	}
		        	System.out.println(ergebnis);
		        	ergebnis = "";
		        }
		        int a = (int)(anzahl / 2) + 1;
		        if(anzahl % 2 == 0) {
		        	System.out.println("\n8. Plus:");
		        	System.out.println("Geben Sie eine ungerade Zahl ein, um das Plus sehen zu können.\n");
		        }
		        else {
			        System.out.println("\n8. Plus:");

			        for(int i = 1; i <= anzahl; i++) 
			        {
			        	if(i == a)
			        	{
			        		for (int j = 0; j < anzahl; j++ ) 
			        		{
			   		         ergebnis = ergebnis + "x ";
			   		        }
			        	}
			        	else 
			        	{
			        		for (int j = 0; j <= anzahl ; j++ ) 
			        		{
			        			if(j == a) {
				   		         	ergebnis = ergebnis + "  x ";
				   		        }
			        			else {
			        				ergebnis = ergebnis + " ";
			        			}	
			        		}
			        	}
			        	System.out.println(ergebnis);
			        	ergebnis = "";
			        }
		        }
			        
			        System.out.println("\n9. Diagonales Kreuz:");
			        for (int i = 1; i <= anzahl; i++) {
			            for (int j = 1; j <= anzahl; j++) {
			               if(j == i || j + i == anzahl + 1) {
			            	   ergebnis = ergebnis + " x";
			               }
			               else {
			            	   ergebnis = ergebnis + "  ";
			               }
			            }
			            System.out.println(ergebnis);
			            ergebnis = "";
			        }

			        System.out.println("\n10. Union Jack");
			        for(int i = 1; i <= anzahl + 1; i++) {
			        	for(int j = 1; j <= anzahl * 2; j++) {
			        		if((j / 2) + 1 == i || (j / 2) + i == anzahl + 1 || i == a || i == a + 1 || j == anzahl || j == anzahl + 1) {
			        			ergebnis = ergebnis + "  ";
			        		}
			        		else {
			        			ergebnis = ergebnis + " x";
			        		}
			        	}
			        	System.out.println(ergebnis);
			        	ergebnis = "";
			        }
			        /*int k = 0;
			        
			        System.out.println("\n9. Raute");
			        for(int i = 1; i <= anzahl; i++)
			        {
			        	if(i < a) 
			        	{
				        	for(int j = 1; j <= anzahl; j++) 
				        	{
				        		if(j == a - k) {
				        			for(int g = 1; g <= a + k; g++) {
				        				ergebnis = ergebnis + "x ";
				        			}
				        		}
				        		else {
				        			ergebnis = ergebnis + "  ";
				        		}
				        	}
				        	k++;
			        	}
				        else if(i == a) 
				        {
				        	for (int j = 0; j < anzahl; j++ ) 
			        		{
			   		         ergebnis = ergebnis + "x ";
			   		        }
				        	k = anzahl - 1;
				        }
				        else if(i > a)
				        {
				        	for(int j = anzahl - 1; j >= 1; j--) 
				        	{
				        		if(j == a || j == a - k || j == a + k) {
				        			ergebnis = ergebnis + "x ";
				        		}
				        		else {
				        			ergebnis = ergebnis + "  ";
				        		}
				        	}
				        	k--;
				        }
			        	System.out.println(ergebnis);
			        	ergebnis = "";
			        }*/
			    
		        
	}
		        
}
