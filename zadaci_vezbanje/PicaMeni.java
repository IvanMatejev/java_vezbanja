package Vezbanje;

import java.util.ArrayList;

public class PicaMeni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program za potrebe 2x2 pasta bara. Potrebe programa su da stampamo meni.
//		Program u sebi ima dva niza podataka:
//		Prvi niz je niz pasti koje pasta bar nudi
//		Drugi niz je niz cena
//		Proizvod iz prvog niza je uskladjen sa cenom iz drugog niza po poziciji, sto znaci da pasta sa pozicije 0 je sa cenom sa pozicije 0...
//		pasta za pozicije 2 je sa cenom sa pozicije 2...
//		Nizovi su proizvoljni.
//		Primer izvrsenja:
//		AGLIO E OLIO..................................320 rsd
//		FUNGHI..................................320 rsd
//		PESTO..................................310 rsd
//		NAPOLITANA..................................280 rsd
//		ARRABBIATA..................................300 rsd (edited) 
		
		ArrayList<String> pice = new ArrayList<String>();
		ArrayList<String> cena = new ArrayList<String>();
		
		pice.add("AGLIO E OLIO");
		pice.add("FUNGHI");
		pice.add("NAPOLITANA");
		pice.add("PESTO");
		
		cena.add("320 rsd");
		cena.add("300 rsd");
		cena.add("350 rsd");
		cena.add("280 rsd");
		
		for ( int i = 0 ; i < pice.size(); i++ ) {
			System.out.println(pice.get(i) + ".............." + cena.get(i));
		}

	}

}
