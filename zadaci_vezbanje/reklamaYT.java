package Vezbanje;

import java.util.Scanner;

public class reklamaYT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Napisati program za potrebe jutjuba koji odredjuje kada ce se pokrenuti reklame. 
//		Duzinu videa kao i vreme prve reklame unosi korisnik a zatim se na svakih 30s startuje nova reklama.
//		Primer izvrsenja:
//		Duzina videa (minut): 2
//		Duzina videa (sekund): 40
//		Prva reklama (minut): 0
//		Prva reklama (sekund): 15
//		Reklame:
//		0:15
//		0:45
//		1:15
//		1:45
//		2:15 (edited) 
//		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Duzina videa (minut): ");
		int duzinaMinuti = s.nextInt();
		
		System.out.println("Duzina videa (sekund): ");
		int duzinaSekunde = s.nextInt();
		
		System.out.println("Prva reklama (minut): ");
		int prvaReklamaMinut = s.nextInt();
		
		System.out.println("Prva reklama (sekund): ");
		int prvaReklamaSekund = s.nextInt();
		
		System.out.println("Reklame: ");
		System.out.println(prvaReklamaMinut + ":" + prvaReklamaSekund);
		
		int ukupnaDuzinaSekunde= duzinaMinuti*60 + duzinaSekunde;
		int prvaReklamaUSekundama= prvaReklamaMinut*60 + prvaReklamaSekund;
		int duzinaOdPrveReklame= ukupnaDuzinaSekunde - prvaReklamaUSekundama;
		
		for(int i = 0; i < duzinaOdPrveReklame/30 ; i++) {
			prvaReklamaSekund+=30;
			if(prvaReklamaSekund <= 59) {
				System.out.println(prvaReklamaMinut + ":" + prvaReklamaSekund);
			}else {
				prvaReklamaMinut += 1;
				prvaReklamaSekund -= 60;
				System.out.println(prvaReklamaMinut + ":" + prvaReklamaSekund);
			}	
		}
		
	}

}
