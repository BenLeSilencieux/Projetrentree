
public class Lezard extends Reptile{

	public Lezard(String unNom, String uneEspece) {
		super(unNom, uneEspece);
		// TODO Auto-generated constructor stub
	}
	
	public Lezard(String unNom) {
		super(unNom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je siffle.";
		return chaine;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Lezard";
			
		return chaine;
	}
}
