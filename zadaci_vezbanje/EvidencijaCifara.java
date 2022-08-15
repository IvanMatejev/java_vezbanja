package Vezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji vodi evidenciju koliko puta je korisnik uneo svaku cifru od 0 do 5. Korisnik unosi N brojeva.
//		Program u sebi ima niz duzine 6 koji sluzi za evidenciju unetih cifara. Na kraju programa odstapmati evidenciju.
//		Primer izvrsenja:
//		Unesite N: 6
//		Unesite broj: 1
//		Unesite broj: 1
//		Unesite broj: 0
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 7
//		Evidencija:
//		0 se javila 1 puta
//		1 se javila 3 puta
//		2 se javila 0 puta
//		3 se javila 0 puta
//		4 se javila 0 puta
//		5 se javila 1 ptua (edited) 
		
		ArrayList<Integer> uneteCifre = new ArrayList<Integer>();
		ArrayList<Integer> brojac = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		for ( int i = 0; i < 6 ; i++ ) {
			brojac.add(0);
		}
		for ( int i = 0 ; i < n ; i++) {
			System.out.println("Unesite broj: ");
			int broj = s.nextInt();
			uneteCifre.add(broj);
		}
		for( int i = 0 ; i < brojac.size(); i++ ) {
			for( int j = 0 ; j < uneteCifre.size() ; j++ ) {
				if ( i == uneteCifre.get(j) ) {
					brojac.set(i, brojac.get(i) + 1);
				}
			}
		}
		for ( int i = 0 ; i < brojac.size() ; i++) {
			System.out.println(i + " se javila " + brojac.get(i) + " puta");
		}
	}

}
