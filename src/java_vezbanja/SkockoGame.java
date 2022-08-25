package java_vezbanja;

import java.util.ArrayList;

public class SkockoGame {
	
	ArrayList<String> odigraniZnakovi = new ArrayList<String>();
	ArrayList<String> zadatiZnakovi = new ArrayList<String>();
	
	public int pokusaja;
	
	public String polje1;
	public String polje2;
	public String polje3;
	public String polje4;
	
	public String odigrano1;
	public String odigrano2;
	public String odigrano3;
	public String odigrano4;
	
	public void newGame ( String prvi, String drugi, String treci, String cetvrti ) {
		this.polje1 = prvi;
		this.polje2 = drugi;
		this.polje3 = treci;
		this.polje4 = cetvrti;
		
		this.pokusaja = 0;
		
		this.odigrano1 = "";
		this.odigrano2 = "";
		this.odigrano3 = "";
		this.odigrano4 = "";
			
	}
	public boolean isGameOver () {
		return this.pokusaja >= 6 ;
	}
	
	public boolean isWinner () {
		if ( this.polje1.equals(this.odigrano1) && this.polje2.equals(this.odigrano2) && this.polje3.equals(this.odigrano3)
				&& this.polje4.equals(this.odigrano4)) {
			return true;
		}
		return false;
	}
	
	public int pogodakaNaMestu () {
		int naMestu = 0;
		if ( this.polje1.equals(this.odigrano1) ) {
			naMestu += 1;
		}
		if ( this.polje2.equals(this.odigrano2) ) {
			naMestu += 1;
		}
		if ( this.polje3.equals(this.odigrano3) ) {
			naMestu += 1;
		}
		if ( this.polje4.equals(this.odigrano4) ) {
			naMestu += 1;
		}
		return naMestu;
	}
	
	public int pogodakaNisuNaMestu () {

		this.zadatiZnakovi.add(this.polje1);
		this.zadatiZnakovi.add(this.polje2);
		this.zadatiZnakovi.add(this.polje3);
		this.zadatiZnakovi.add(this.polje4);
		
		this.odigraniZnakovi.add(this.odigrano1);
		this.odigraniZnakovi.add(this.odigrano2);
		this.odigraniZnakovi.add(this.odigrano3);
		this.odigraniZnakovi.add(this.odigrano4);
		
		
		for ( int i = 0 ; i < this.zadatiZnakovi.size() ; i++) {
			if ( this.zadatiZnakovi.get(i).equals(this.odigraniZnakovi.get(i))) {
				this.zadatiZnakovi.remove(i);
				this.odigraniZnakovi.remove(i);
				i--;
			}
		}
		int count = 0;
		for ( int i = 0 ; i < this.zadatiZnakovi.size() ; i++) {
			for ( int j = 0 ; j < this.odigraniZnakovi.size() ; j++) {
				if (this.zadatiZnakovi.get(i).equals(this.odigraniZnakovi.get(j))) {
					count ++;
				}
			}
		}
		
		System.out.println(this.zadatiZnakovi);
		System.out.println(this.odigraniZnakovi);
		return count;
		
		
		
	
		
	}
	
	public void printTrazenaKombinacija () {
		System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " | " + this.polje4);
	}
	
	public void printOdigranaKombinacija () {
		System.out.println(this.odigrano1 + " | " + this.odigrano2 + " | " + this.odigrano3 + " | " + this.odigrano4);
	}
	
	

}
