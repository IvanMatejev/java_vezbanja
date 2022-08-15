package Vezbanje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak (For petlja)
//		Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
//		ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//		tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi
//		da unese kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje
//		sumu za trazenu kolonu.
//		Primer izvrsenja:
//		3,1,8,0,1,
//		1,5,7,9,6,
//		3,1,6,5,1,
//		4,5,8,1,7,
//		1,3,2,8,0,
//		Unesite kolonu za sumiranje: 2
//		Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)
		
		Random random = new Random();
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int suma = 0;
		
		for( int  i = 0; i < 25 ; i++) {
			int x = random.nextInt(9);
			brojevi.add(x);
			System.out.print( x + ", ");
			if( brojevi.size() % 5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println("Unesite kolonu za sumiranje: ");
		int kolona = s.nextInt();
		if ( kolona > 0 && kolona < 6 ) {
			for( int i = kolona - 1 ; i < brojevi.size() ; i = i + 5 ) {
				suma += brojevi.get(i);
			}
			System.out.println("Suma je " + suma );
		}else {
			System.out.println("Zadata kolona ne postoji!");
		}
		
		

	}

}
