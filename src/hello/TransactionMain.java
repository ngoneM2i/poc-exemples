package hello;

public class TransactionMain {

	public static void main(String[] args) {
		// Une transaction a deux variables d'instance:
		// - type: String ("debit" ou "credit")
		// - amount: double (toujours positifs)
		//Cr�er 4 transactions:
		//d�bit: 10, cr�dit: 20, d�bit:30, cr�dit: 15
		
		Transaction t1 = new Transaction();
		t1.type = "debit";
		t1.amount = 10;
		
		Transaction t2 = new Transaction();
		t2.type = "cr�dit";
		t2.amount = 20;
		
		Transaction t3 = new Transaction();
		t3.type = "debit";
		t3.amount = 30;
		
		Transaction t4 = new Transaction();
		t4.type = "cr�dit";
		t4.amount = 15;
		
		Transaction[] transactions = new Transaction[4];
		transactions[0] = t1;
		transactions[1] = t2;
		transactions[2] = t3;
		transactions[3] = t4;
		
		// exercice calculer le total des transactions
		double total = 0;
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i].type.equals("debit")) {
				total -= transactions[i].amount;
			} else if (transactions[i].type.equals("credit")) {
				total += transactions[i].amount;
			} else {
				System.out.println("type de transaction inconnu - g�rer l'erreur plus proprement");
			}
				
		}
	}

}
