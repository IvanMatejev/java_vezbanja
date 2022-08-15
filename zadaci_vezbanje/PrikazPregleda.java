package Vezbanje;

import java.util.Scanner;

public class PrikazPregleda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji tacan broj pregleda ispisuje u kracem formatu
//		do 1000 pregleda ispisuje se tacan broj. Npr: 265 views
//		Od 1k do 1m ispisuje se sa sufiksom K. Nor ako je tacan broj pregleda 361518 ispisuje se 361K views
//		Preko 1m ispisuje se sa sufiksom M. Npr: ako je tacan broj 27151528 ispisuje se 27M views
//		Korisnik sa tastature unosi tacan broj pregleda koje program ispisuje u kracem zapisu (edited) 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj pregleda: ");
		int brojPregleda = s.nextInt();
		
		if(brojPregleda < 1000) {
			System.out.println(brojPregleda);
		}else if(brojPregleda >= 1000 && brojPregleda < 1000000){
			System.out.println(brojPregleda/1000 + "K views");
		}else if( brojPregleda >= 1000000) {
			System.out.println( brojPregleda / 1000000 + "M views");
		}

	}

}
