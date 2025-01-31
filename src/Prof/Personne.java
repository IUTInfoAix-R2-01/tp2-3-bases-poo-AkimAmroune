package Prof;

public class Personne {
	String nom;
	String prenom;
	
	public Personne(String nom, String prenom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public Personne(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		if (this.nom == null) {
			return "Personne [prenom=" + prenom + "]";
		}
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
