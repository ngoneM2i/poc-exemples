package hello;

public class Article {
	
	//Variables d'instance
	private String titre;
	private double prix;
	
	//Constructeur
	public Article(String titre, double prix) {
		this.titre = titre;
		this.prix = prix;
	}
	
	//Accesseurs
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
}

