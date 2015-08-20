public class Innlevering2 {

/*
 * Dette er varianten med double 
 * Kan være at output er gjort litt lite elegant
 * Men det fungerer og gjør akkurat som oppgaven spesifiserer
 *
 */
	public static void main(String[] args) {
	float a, b, c, d, e,f;

	a = 0.05f;
	b = 0.1f;
	c = a + b;
	d = a - b;
	e = a * b;
	f = a / b;

	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = a + b = " + c);
	System.out.println("d = a - b = " + d);
	System.out.println("e = a * b = " + e);
	System.out.println("f = a / b = " + f);
	System.out.println("c = a / 0 = Infinity");

	
	}
}