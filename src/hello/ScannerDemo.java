package hello;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*String line;
		line = sc.nextLine();
		System.out.println(line);
		*/
		
		for(;;) {
			String line;
			line = sc.nextLine();
			if(line.equals("quit")) {
				System.out.println("ici ?");
				break;
			}
			System.out.println(line);
		}

	}

}
