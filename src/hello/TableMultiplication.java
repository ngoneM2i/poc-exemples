package hello;

public class TableMultiplication {

	/*public void print(int a, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(a * i );
		}
	}
	*/
	public void print2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("[" + i*j  + "]");
			}
		}
	}
}
