package iut.bad;

public class Femme extends Humain{

	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	    Homme homme = new Homme("Jean", "Dupont", 30);
	    Femme femme = new Femme("Marie", "Dupont", 28);
	    
	    homme.ami(femme, 30);
	}

}
