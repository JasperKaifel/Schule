public class Zahlensortierer2 {

	public static void main(String[] args) {
			
		System.out.println("Wie viele Zahlen?");
		int anzahl = HumboldtHelper.readInt();
		int [] zahlen = new int [anzahl];
		
		int temp = 0;
		
		System.out.println("Geben Sie die Zahlen ein: ");
		
		do
		{
		zahlen[temp] = HumboldtHelper.readInt();
		temp = temp + 1;
		}while(temp < anzahl);
		
		temp = 0;
		
	//deklariert variable i = 0; wenn i kleiner als die Länge des Arrays ist wiederholt sich die Schleife, nach jedem Durchlauf erhöht sich i um 1	
		for(int i = 0; i < zahlen.length; i++) 
		{
	/*deklariert variable j = 1, wenn j kleiner als die Länge des Arrays ist wiederholt sich die Schleife, nach jedem Durchlauf erhöht sich j um 1
	wenn die j >= die Länge des Arrays ist, wiederholt sich die Schleife darüber, somit wird j wieder 1 und der Prozess beginnt von vorn
	Durch die untere Schleife kommt bei dem ersten Durchlauf der oberen Schleife die größte Zahl nacht hinten, weshalb es überflüssig wäre im zweiten Durchlauf wieder 
	die letzte Zahl mit der vorletzten zu vergleichen, weshalb nach jedem Durchlauf der oberen Schleife die Anzahl der Versuche der unteren Schleife kleiner wird. */
			for(int j = 1; j < zahlen.length - i; j++)
			{
				if(zahlen[j] < zahlen[j-1]) 
				{
				temp = zahlen[j-1];
				zahlen[j - 1] = zahlen[j];
				zahlen[j] = temp;
				}
			}
		
		}
		
		for(int i = 0; i < zahlen.length; i++)
		{
			System.out.println(zahlen[i]);
		}
			
		
	}

}
