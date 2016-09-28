
public class Tigre extends Felin{

	public Tigre(String unNom, String uneEspece) {
		super(unNom, uneEspece);
	}

	public Tigre(String unNom) {
		// TODO Auto-generated constructor stub
		super(unNom);
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je Rugis.";
		return chaine;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Tigre";
			
		return chaine;
	}
}