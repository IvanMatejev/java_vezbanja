package Vezbanje;

import java.util.Scanner;

public class pojacivacZvuka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. (za veabanje) Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”.
//		Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75. 
//		Pojacaj - akcije koja povecava jacinu zvuka za 10 
//		smanji - akcija koja smajnjuje jacinu zvuka za 10. 
//		Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//		Na kraju programa odstampati jacinu zvuka.
//
//		Primer izvrsenja:
//		Unesite akciju: pojacaj (iz 75 u 85)
//		Unesite akciju: pojacaj ( iz 85 u 95)
//		Unesite akciju: pojacaj (iz 95 u 100)
//		Unesite akciju: smanji (iz 100 u 90)
//		Unesite akciju: smanji (iz 90 u 80)
//		Unesite akciju: play
//		Jacina zvuka je 80.

		Scanner s = new Scanner(System.in);
		
		int inicijalnaJacina = 75;
		boolean isEnd = false;
		
		while( isEnd == false ) {
			System.out.println("Unesite akciju: ");
			String akcija = s.next();
			if( akcija.equals("pojacaj")) {
				inicijalnaJacina += 10;
				if( inicijalnaJacina > 100) {
					inicijalnaJacina = 100;
				}
				System.out.println(inicijalnaJacina);
			}else if ( akcija.equals( "smanji" )) {
				inicijalnaJacina -= 10;
				if( inicijalnaJacina < 0 ) {
					inicijalnaJacina = 0;
				}
				System.out.println(inicijalnaJacina);
			}else if( akcija.equals( "play" )){
				System.out.println("Jacina zvuka je " + inicijalnaJacina );
				isEnd = true;
			}else {
				System.out.println("Pogresna akcija, pokusajte ponovo!");
			}
		}
		
	}

}
