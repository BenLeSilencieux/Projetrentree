import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class PanelAfficher extends JPanel implements ActionListener{
	JButton btnRechercher = new JButton("Rechercher");
	JPanel panelall=new JPanel();
	JPanel panelfin=new JPanel();
	String nomAnimal;
	String especeAnimal;
	String langageAnimal;
	String chaine;
	JTable afficherContenu;

	public PanelAfficher(){
		if(Fenetre.getMenagerie().getListe().size()==0){
			Object[][] data ={{"Aucun animal présent","",""}};
			String  columnNames[] = {"Nom", "Espece", "Buit émis"};
			afficherContenu = new JTable(data,columnNames);
		}
		else{
		Object[][] data = new Object[Fenetre.getMenagerie().getListe().size()][3];
		for(int i=0;i<Fenetre.getMenagerie().getListe().size();i++){
	    	data[i][0] =  Fenetre.getMenagerie().getListe().get(i).getNom();
	    	data[i][1] =  Fenetre.getMenagerie().getListe().get(i).getEspece();
	    	data[i][2] =  Fenetre.getMenagerie().getListe().get(i).parler();
	    }
		String  columnNames[] = {"Nom", "Espece", "Langage"};
		afficherContenu = new JTable(data,columnNames);
		}
		
		
		
		
		
		
		JScrollPane BarreDeroulement = new JScrollPane(afficherContenu,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		BarreDeroulement.setPreferredSize(new Dimension(500,110));
		
		JLabel presentation =new JLabel("Voici les animaux présent dans votre ménagerie :");
		
		panelall.setLayout(new BorderLayout());
		panelall.add(presentation, BorderLayout.NORTH); 
		panelall.add(BarreDeroulement, BorderLayout.CENTER); 
		
		
		this.revalidate();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		return panelall;
	}

	
}