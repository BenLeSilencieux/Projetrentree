import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelSupprimer extends JPanel implements ActionListener{
	private JLabel lbl2= new JLabel(" Choisissez l'espèce et le nom de l'animal à supprimer.");
	private JTextField jtfNomSupprimer= new JTextField(10);
	private JLabel resultatSuppression = new JLabel ();
	private String espece;
	private JButton btnSupprimer = new JButton("Supprimer");
	private JPanel panelall=new JPanel();
	private JComboBox listeEspece;

	public PanelSupprimer(){

		Object[] espece = new Object[]{"Chat", "Tigre", "Pigeon", "Perroquet", "Lézard", "Tortue"};
		listeEspece = new JComboBox(espece);
		btnSupprimer.addActionListener(new ActionSupprimer());

		JPanel panelEspeceSupp = new JPanel();
		panelEspeceSupp.setLayout(new FlowLayout());
		panelEspeceSupp.add(listeEspece);
		panelEspeceSupp.add(jtfNomSupprimer);
		panelEspeceSupp.add(btnSupprimer);
		
		
		panelall.setLayout(new BorderLayout());
		panelall.add(lbl2, BorderLayout.NORTH);
		panelall.add(panelEspeceSupp, BorderLayout.CENTER);
		panelall.add(resultatSuppression, BorderLayout.SOUTH);	

		this.revalidate();
	
	}
	
	public class ActionSupprimer implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			espece = (String) listeEspece.getSelectedItem();
			if(jtfNomSupprimer.getText().isEmpty()){
				resultatSuppression.setText("Vous n'avez pas entrez le nom de l'animal à supprimer.");
			}
			else{
				if(espece=="Chat"){
					resultatSuppression.removeAll();
					resultatSuppression.setText((Fenetre.getMenagerie().supprimerAnimal(new Chat(jtfNomSupprimer.getText(), espece))));	
				}
				else{
					if(espece=="Tigre"){
						resultatSuppression.removeAll();
						resultatSuppression.setText(Fenetre.getMenagerie().supprimerAnimal(new Tigre(jtfNomSupprimer.getText(), espece)));
					}
					else{
						if(espece=="Perroquet"){
							resultatSuppression.removeAll();
							resultatSuppression.setText(Fenetre.getMenagerie().supprimerAnimal(new Perroquet(jtfNomSupprimer.getText(), espece)));
						}
						else{
							if(espece=="Pigeon"){
								resultatSuppression.removeAll();
								resultatSuppression.setText(Fenetre.getMenagerie().supprimerAnimal(new Pigeon(jtfNomSupprimer.getText(), espece)));
							}
							else{
								if(espece=="Lézard"){
									resultatSuppression.removeAll();
									resultatSuppression.setText(Fenetre.getMenagerie().supprimerAnimal(new Lezard(jtfNomSupprimer.getText(), espece)));
									}
								else{
									if(espece=="Tortue"){
										resultatSuppression.removeAll();
										resultatSuppression.setText(Fenetre.getMenagerie().supprimerAnimal(new Tortue(jtfNomSupprimer.getText(), espece)));
									}								
								}
							}
						}
					}
				}
			}
		}
	}				

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		return panelall;
		
	}
	

	
}