package hello;

public class PersonneMain {

	public static void main(String[] args) {
		Personne p1 = new Personne("Bob", "L'éponge", 18);
		
		//p1.setPrenom("Bob");
		System.out.println(p1.getPrenom());
		
		//p1.setNom("L'éponge");
		System.out.println(p1.getNom());
		
		//p1.setAge(18);
		System.out.println(p1.getAge());
		
	}

}
