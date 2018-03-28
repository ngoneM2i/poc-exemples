package hello;

public class Operator {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		
		//Attention à la division entiere dans java il tronque le resultats
		System.out.println(40 / 3);
		System.out.println(1 / 3);

		//Il faut plutot faire 
		System.out.println(40 / 3.0);
		System.out.println(1.0 * 1 / 3);
		System.out.println(1 + 2 * 3);
		System.out.println(1 + 2 * 3);
		
		//modulo : reste de la division entiere
		// a % b => a = q * b + r
		//4 % 2 => 4 = q * 2 + r => r = 0
		//10 % 3 => 10 = q * 3 + r => r = 1
		
		// ça sert à quoi le modulo?
		// a % b == 0 veut dire que a est divisible par b
		
		//a % 2 == 0
		System.out.println(4 % 2);
		int i = 42;
		int a = 0;
		a  = i++; // attention à la post incrementation
		System.out.println(a);
		System.out.println(i);
		
		i += 10; // i = i + 10; // a ?= v <=> a = a ? v
		
		//operateur booleans
		System.out.println(5 == 3);
		System.out.println(5 == '5');
		char c = 'a';
		char d = ++c;
		System.out.println(d);
		System.out.println(5 == 3);
		System.out.println(5 != 3);
		System.out.println(5 > 3);
		System.out.println(5 <= 3);
		System.out.println(5 < 3);
		
		

	}

}
