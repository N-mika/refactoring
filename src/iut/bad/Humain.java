package iut.bad;

public class Humain {
	public String nom;
	public String prenom;
	public int age;
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public void details() {
	    System.out.println("Nom: " + nom);
	    System.out.println("Prénom: " + prenom);
	    System.out.println("Âge: " + age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void ami(Humain ami, int dureeAmitie) {
	    System.out.println(this.nom + " est ami avec " + ami.nom + " depuis " + dureeAmitie + " jours.");
	}

	public void manger() {
	    System.out.println("Je mange.");
	}

	public void boire() {
	    System.out.println("Je bois.");
	}

}
