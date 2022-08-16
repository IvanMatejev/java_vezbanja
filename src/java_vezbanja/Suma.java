package java_vezbanja;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Evo jednog za vezbanje:
//			Napisati metodu za sumiranje dva broja. Metoda prima dva broja, racuna sumu i vraca sracunatu vrednost.
//			U glavnom programu iskoristiti metodu za sumiranje za racunanje sledece formule
//			a = proizvoljno
//			b = proizvoljno
//			c = proizvoljno
//			x = 10 + a + b + c
//			U glavnom programu gde god vam je potrebno da izvrsite operaciju + vi izvrsite to preko metode za sumiranje
//			Hint u threadu, pa ko hoce moze da pogleda (edited) 
//		Najlakse da se sabiranje zameni metodom je da razbijete formulu na
//		x = 10 + a
//		x = x + b
//		x = x + c (edited) 
		int a = 10;
		int b = 5;
		int c = 12;
		
		int x = 0;
		x = suma(10, a);
		x = suma(x, b);
		x= suma(x, c);
		
		System.out.println(x);

	}
	
	public static int suma ( int a , int b ) {
		return a + b;
	}

}
