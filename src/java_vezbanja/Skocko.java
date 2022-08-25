package java_vezbanja;

import java.util.Scanner;

public class Skocko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		SkockoGame slagalica = new SkockoGame();
		
		slagalica.newGame("L", "T", "L", "S");
		
		
		while ( slagalica.isGameOver() == false) {
			System.out.println("Unesite znak: ");
			String znak1 = s.next();
			System.out.println("Unesite znak: ");
			String znak2 = s.next();
			System.out.println("Unesite znak: ");
			String znak3 = s.next();
			System.out.println("Unesite znak: ");
			String znak4 = s.next();
			
			slagalica.odigrano1 = znak1;
			slagalica.odigrano2 = znak2;
			slagalica.odigrano3 = znak3;
			slagalica.odigrano4 = znak4;
			
			System.out.println("Odigrana kombinacija: ");
			slagalica.printOdigranaKombinacija();
			System.out.print(slagalica.pogodakaNaMestu() + " na mestu | " + slagalica.pogodakaNisuNaMestu() + " nisu na mestu");
			System.out.println();
			
			if ( slagalica.isWinner() == true ) {
				System.out.println("Trazena kombinacija: ");
				slagalica.printTrazenaKombinacija();
				System.out.println("Cestitamo!!! Pogodili ste trazenu kombinaciju!");
				slagalica.pokusaja = 6;
			}
			slagalica.pokusaja++;
			if ( slagalica.pokusaja == 6 ) {
				System.out.println("Zao nam je. Nemate vise pokusaja");
			}
		}
		
		

	}

}
