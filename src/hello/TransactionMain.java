package hello;

public class TransactionMain {

	public static void main(String[] args) {
		// Une transaction a deux variables d'instance:
		// - type: String ("debit" ou "credit")
		// - amount: double (toujours positifs)
		//Cr�er 4 transactions:
		//d�bit: 10, cr�dit: 20, d�bit:30, cr�dit: 15
		
		Transaction t1 = new Transaction("debit", 20);
		//t1.setType("debit");
		//t1.setAmount(20);
		
		System.out.println(t1.getType());
		
		Transaction t2 = new Transaction("debit", 20);
		//t2.setType("debit");
		//t2.setAmount(20);
		
		Transaction t3 = new Transaction("debit", 20);
		//t3.setType("debit");
		//t3.setAmount(20);
		
		Transaction t4 = new Transaction("debit", 15);
		//t4.setType("debit");
		//t4.setAmount(15);
		
		Transaction[] transactions = new Transaction[4];
		transactions[0] = t1;
		transactions[1] = t2;
		transactions[2] = t3;
		transactions[3] = t4;
		
		// exercice calculer le total des transactions
		double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i].getType().equals("debit")) {
				total -= transactions[i].getAmount();
			} else if (transactions[i].getType().equals("credit")) {
				total += transactions[i].getAmount();
			} else {
				System.out.println("type de transaction inconnu - g�rer l'erreur plus proprement");
			}
				
		}
	}

}
