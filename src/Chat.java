
public class Chat extends Felin{

	public Chat(String unNom, String uneEspece) {
		super(unNom, uneEspece);
		// TODO Auto-generated constructor stub
	}
	
	public Chat(String unNom) {
		// TODO Auto-generated constructor stub
		super(unNom);
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		String chaine="Je Miaule.";
		return chaine;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String chaine = "";
		chaine += " \nNom : "+ this.getNom();
		chaine += " \nEspece : Chat";
		
		return chaine;
	}

}