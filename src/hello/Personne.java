package hello;

public class Personne {
	//variables d'instance , intance fileds ou champs
	private String prenom;
	private String nom;
	private int age;
	
	
	public Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public String getFullName() {
		return prenom + " " + nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		prenom = this.prenom;
		
	}

	public String getNom() {
		return nom;
		
	}

	public void setNom(String nom) {
		nom = this.nom;
		
	}

	public int getAge() {
		return age;
		
	}

	public void setAge(int age) {
		age = this.age;
		
	}

}
