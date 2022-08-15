package Vezbanje;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ajde jos jedan kad sam dobio inspiraciju
//		Napisati program koji simulira navijanje alarma
//		Korisnik unosi sa tastature vreme koje zeli
//		unosi se sat - smatrajte da korisnik unosi od 0 do 23
//		Unosi se minut - smatrajte da korisnik unosi od 0 do 59
//		Program zatim ispisuje kada ce zvoniti alarm. Alarm zvoni narednih pola sata, na svakih 5min
//		Primer izvrsenja:
//		Unesite sat: 18
//		Unesite minut: 43
//		Alarm:
//		18:43
//		18:48
//		18:53
//		18:58
//		19:3
//		19:8
//		19:13
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj sati: ");
		int sati= s.nextInt();
		
		System.out.println("Unesite broj minuta: ");
		int minuti= s.nextInt();
		
		System.out.println("Alarm");
		System.out.println(sati + ":" + minuti);
		
		for( int i = 0 ; i<6 ; i++) {
			minuti+=5;
			if(minuti<=59) {
				System.out.println(sati + ":" + minuti);
			}else {
				sati+=1;
				minuti-=60;
				if(sati==24) {
					sati=0;
				}
				System.out.println(sati + ":" + minuti);
			}
		}
		
		

	}

}
