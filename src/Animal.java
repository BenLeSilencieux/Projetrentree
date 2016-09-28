public abstract class Animal { 

	//Attributs privés 
	private String espece; 
	private String nom; 
	
	
	//Constructeur
	public Animal(String unNom){ 
		this.nom = unNom;
	} 
	
	public Animal (String unNom, String uneEspece){ 
	
	this.nom = unNom; 
	this.espece = uneEspece; 

	}
	public Animal(){
		
	}
	//Accesseurs
	public String getNom(){ 
	return nom; 
	} 
	
	public void setNom(String unNom){ 
	this.nom = unNom; 
	} 
	
	public String getEspece() { 
	return espece; 
	} 
	
	public void setEspece(String unEspece) { 
	this.espece = unEspece; 
	} 
	
	public abstract String toString();
	

	public abstract String parler();
	
}