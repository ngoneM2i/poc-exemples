package hello;

public class TransactionMain {

	public static void main(String[] args) {
		// Une transaction a deux variables d'instance:
		// - type: String ("debit" ou "credit")
		// - amount: double (toujours positifs)
		//Créer 4 transactions:
		//débit: 10, crédit: 20, débit:30, crédit: 15
		
		Transaction t1 = new Transaction();
		t1.type = "debit";
		t1.amount = 10;
		
		Transaction t2 = new Transaction();
		t2.type = "crédit";
		t2.amount = 20;
		
		Transaction t3 = new Transaction();
		t3.type = "debit";
		t3.amount = 30;
		
		Transaction t4 = new Transaction();
		t4.type = "crédit";
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
				System.out.println("type de transaction inconnu - gérer l'erreur plus proprement");
			}
				
		}
	}

}
