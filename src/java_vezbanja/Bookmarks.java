package java_vezbanja;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookmarks {

	public static void main(String[] args) {
//		Napisati program koji simulira iscrtavanje bookmarkova u Google Chrome-u prilikom resajzovanja aplikacije. (Pogledaj video)
//		Koliko ce se bookmarkova iscrtati zavisi od sirine pretrazivaca.
//		Sirina jednog bookmarka je broj karaktera u nazivu bookmarka.
//		Izmedju svaka dva bookmarka postoji razmak od 5 karaktera.
//		Sirina svih bookmarkova ne sme da predje sirinu pretrazivaca, racunajuci i razmake izmedju bookmarkova
//		Niz bookmarkova na pocetku programa definisati fiksno (ne unosi ih korisnik) a zatim iscrtati bookmarkove na stranici u zavisnosti od sirine 
//		pretrazivaca.
//		Primer izvrsenja 1:
//		Unesite sirinu pretrazivaca:100
//		Apps     YouTube     Google     Gmail     Miro | Online Whiteboard for Visual Collaboration     
//		Primer izvrsenja 2:
//		Unesite sirinu pretrazivaca:90
//		Apps     YouTube     Google     Gmail     
//		Primer izvrsenja 3:
//		Unesite sirinu pretrazivaca:800
//		Apps     YouTube     Google     Gmail     Miro | Online Whiteboard for Visual Collaboration     Confluence     JIRA     Bitbucket    
//		Google Calendar     Timesheet     Google Drive     IX CIKLUS       
//		Niz koriscen za ovaj demo je
		        ArrayList<String> bookmarks = new ArrayList<String>();
		        Scanner s = new Scanner(System.in);
		        bookmarks.add("Apps");
		        bookmarks.add("YouTube");
		        bookmarks.add("Google");
		        bookmarks.add("Gmail");
		        bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
		        bookmarks.add("Confluence");
		        bookmarks.add("JIRA");
		        bookmarks.add("Bitbucket");
		        bookmarks.add("Google Calendar");
		        bookmarks.add("Timesheet");
		        bookmarks.add("Google Drive");
		        bookmarks.add("IX CIKLUS");
		        int count = 0 ;
		        System.out.println("Unesite sirinu pretrazivaca: ");
		        int sirinaPretrazivaca = s.nextInt();
		        for( int i = 0 ; i < bookmarks.size(); i++ ) {
		        	String bookmark = bookmarks.get(i);
		        	count += bookmark.length();
		        	count += 5;
		        	if ( count <= sirinaPretrazivaca ) {
		        		System.out.print( bookmarks.get(i) + "     ");
		        	}
		        	
		        }
		        

	}

}
