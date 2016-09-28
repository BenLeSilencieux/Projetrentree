
public class Pigeon extends Oiseau{

	public Pigeon(String unNom, String uneEspece) {
		super(unNom, uneEspece);
		// TODO Auto-generated constructor stub
	}

	public Pigeon(String unNom) {
		super(unNom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je piaille.";
		return chaine;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Pigeon";
			
		return chaine;
	}
}
