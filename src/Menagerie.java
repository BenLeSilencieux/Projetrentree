import java.util.ArrayList;

public class Menagerie {
	

	//attribut
	
	private ArrayList<Animal> listeAnimaux;
	
	//constructeur
	public Menagerie() {
		
		this.listeAnimaux = new ArrayList<Animal>();
	
	}
	
	//methode
	
	public ArrayList<Animal> getListe(){
		return listeAnimaux;
	}
	
	public String supprimerAnimal(Animal unAnimal){
		int i=0;
		String chaine=" ";
		boolean verification = false;
		while(i<this.listeAnimaux.size() && verification==false){
			
			if(unAnimal.getNom().equals(this.listeAnimaux.get(i).getNom()) && unAnimal.getEspece().equals(this.listeAnimaux.get(i).getEspece())){
				verification=true;
			}
			else{
				i=i+1;
			}
		}

		if(verification==true){
			this.listeAnimaux.remove(i);
			chaine="L'animal a été supprimé.";
		}
		else{
			chaine="L'animal que vous voulez supprimer n'existe pas/plus.";
		}
		return chaine;
	}
	
	public String rechercheAnimal(Animal unAnimal){
		int i=0;
		String chaine=" ";
		boolean verification = false;
		while(i<this.listeAnimaux.size() && verification==false){
			
			if(unAnimal.getNom().equals(this.listeAnimaux.get(i).getNom()) && unAnimal.getEspece().equals(this.listeAnimaux.get(i).getEspece())){
				verification=true;
			}
			else{
				i=i+1;
			}
		}

		if(verification==true){
			chaine="L'animal a été trouvé à la place "+(i+1)+".";
		}
		else{
			chaine="L'animal que vous recherchez est introuvable.";
		}
		return chaine;
	}
	

	public String arriver(Animal unAnimal){
		int i=0;
		String chaine ="";
		boolean verification = false;
		while(i<this.listeAnimaux.size() && verification==false){
			
			if(unAnimal.getNom().equals(this.listeAnimaux.get(i).getNom()) && unAnimal.getEspece().equals(this.listeAnimaux.get(i).getEspece())){
				verification=true;
			}
			else{
				i=i+1;
			}
		}

		if(verification==true){
			chaine="L'animal n'a pas été ajouté car il existe déjà.";
		}
		else{
			this.listeAnimaux.add(unAnimal);
			chaine="L'animal a bien été ajouté.";
		}
		return chaine;
	
	}
	
	public void partir(Animal unAnimal){
		this.listeAnimaux.remove(unAnimal);
	}
	
	
	public String presenter(){
		String chaine=" ";
		if(this.listeAnimaux.size()==0){
			chaine="La ménagerie ne possède aucun animal.";
		}
		else{
			for(int i=0;i<this.listeAnimaux.size();i++){
				chaine+="\nJe me présente :"+this.listeAnimaux.get(i).toString()+"\n";
				chaine+=this.listeAnimaux.get(i).parler()+"\n";
			}
		}
		return chaine;
	}
}