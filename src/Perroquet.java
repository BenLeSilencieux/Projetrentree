
public class Perroquet extends Oiseau{

	public Perroquet(String unNom, String uneEspece) {
		super(unNom, uneEspece);
		// TODO Auto-generated constructor stub
	}
	
	public Perroquet(String unNom) {
		super(unNom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je parle.";
		return chaine;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Perroquet";
			
		return chaine;
	}
}
