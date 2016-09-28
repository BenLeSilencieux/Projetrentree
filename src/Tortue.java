
public class Tortue extends Reptile{

	public Tortue(String unNom, String uneEspece) {
		super(unNom, uneEspece);
		// TODO Auto-generated constructor stub
	}
	
	public Tortue(String unNom) {
		super(unNom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je ne fais pas de bruit.";
		return chaine;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Tortue";
			
		return chaine;
	}
}
