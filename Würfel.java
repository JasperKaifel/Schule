
public class W�rfel {

	public static void main(String[] args) {
		int weiter = 0;
		double genauigkeit = 0;
		int wertZurSch�tzung = 0;
		do {
			System.out.println("Wie oft soll gew�rfelt werden?");
			int eingabe = HumboldtHelper.readInt();
			do {
				System.out.println("Wie genau soll die Augenzahl gesch�tzt werden? 1 = ungenau, 2 = genau, 3 = unfehlbar");
				genauigkeit = HumboldtHelper.readInt();
				if(genauigkeit != 1 && genauigkeit != 2 && genauigkeit != 3) {
					System.out.println("Geben Sie eine der 3 Zahlen ein.");
				}
			}while(genauigkeit != 1 && genauigkeit != 2 && genauigkeit != 3);
			
			if(genauigkeit == 1) {
				wertZurSch�tzung = 10;
			}
			else if(genauigkeit == 2) {
				wertZurSch�tzung = 100;
			}
			else {
				wertZurSch�tzung = 10000;
			}
			
			int [] array = new int[eingabe];;
			int anzahl = 0;
			int insgesamterwartung = 0;
			for(int j = 0; j < wertZurSch�tzung; j++) {
				for(int i = 0; i < eingabe; i++) {
					double zufall = 0;
					do {
					zufall = Math.random() * 7;
					}while(zufall < 1 || zufall == 7);
					int zufallszahl = (int) zufall;
					anzahl = anzahl + zufallszahl;
				}
				insgesamterwartung = insgesamterwartung + anzahl;
				anzahl = 0;			
			}
			System.out.println("Der gesch�tzte Erwartungswert der erw�rfelten Augen betr�gt " + (insgesamterwartung / wertZurSch�tzung));
			System.out.println("Der berechnete Erwartungswert der erw�rfelten Augen betr�gt " + eingabe * 3.5);
			for(int i = 0; i < eingabe; i++) {
				double zufall = 0;
				do {
				zufall = Math.random() * 7;
				}while(zufall < 1 || zufall == 7);
				int zufallszahl = (int) zufall;
				array[i] = zufallszahl;
				anzahl = anzahl + zufallszahl;
			}
			System.out.println("Der Betrag der erw�rfelten Augenzahlen betr�gt: " + anzahl);
			System.out.println("Diese Zahlen wurden gew�rfelt: ");
			for(int i = 0; i < eingabe; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("\nWie oft soll gew�rfelt werden?");
			weiter = HumboldtHelper.readInt();
		}while(weiter != 0);
	}

}
