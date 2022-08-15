package java_vezbanja;

import java.util.Scanner;

public class Makao {

	public static void main(String[] args) {
//		(bez nizova)
//		Napisati program koji simulira ponasanje igre Makao.
//		Korisnik na pocetku programa unosi koja je prva karta na stolu. Svaka karta ima 2 informacije, ima broj i znak.
//		Karta moze da ima:
//		broj = 2,3,4,5,6,7,8,9,10,A,J,Q,K
//		znak = s (za srce), k (za kocku), l (za list), d (za detelinu)
//		Nakon toga korisnik unosi sledecu kartu koja se igra sve dok se ne unese nevalidan potez. Igranje poteza se uvek odnosi na poslednju odigranu 
//		kartu.
//		Potez je validan ukoliko se odigrana karta i karta koja je na stolu poslednja, slazu po znaku ili po broju
//		Napomena: Smatrati da korisnik unosi broj i znak karte u dozvoljenom opsegu
//		Unesite znak karte na stolu: s
//		Unesite broj karte na stolu: 5
//		Poslednja karta na stolu je sad: 5 s
//		Sledeci potez
//		Unesite znak:d
//		Unesite broj:5
//		Potez je validan
//		Poslednja karta na stolu je sad: 5 d
//		Sledeci potez
//		Unesite znak:d
//		Unesite broj:J
//		Potez je validan
//		Poslednja karta na stolu je sad: J d
//		Sledeci potez
//		Unesite znak:s
//		Unesite broj:3
//		Nevalidan potez. Kraj igre.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite znak karte na stolu: ");
		String znakSto = s.next();
		System.out.println("Unesite broj karte na stolu: ");
		String brojSto = s.next();
		
		
		boolean isEnd = false;
		while( isEnd == false ) {
			System.out.println("Poslednja karta na stolu je: " + brojSto + " " + znakSto);
			System.out.println("Sledeci potez: ");
			System.out.print("Unesite znak:");
			String noviZnak = s.next();
			System.out.println();
			System.out.print("Unesite broj:");
			String noviBroj = s.next();
			System.out.println();
			if( brojSto.equals(noviBroj) || znakSto.equals(noviZnak)) {
				System.out.println("Potez je validan!");
				znakSto = noviZnak;
				brojSto = noviBroj;
			}else {
				System.out.println("Nevalidan potez. Kraj igre.");
				isEnd = true;
			}
		}

	}

}
