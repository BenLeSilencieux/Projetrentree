import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class APropos extends JPanel implements ActionListener{
	private JPanel panelall=new JPanel();
	private JPanel panelfin=new JPanel();
	private JLabel presentation =new JLabel(" Bienvenue dans la partie  'À propos'  du logiciel MyMenagerie.");
	private JLabel presentation2 =new JLabel(" Ce logiciel a été crée dans le cadre d'un projet scolaire par Mickaël Gandy et a pour but d'améliorer ses compétences en développement de logiciel.");
	private JLabel presentation3 =new JLabel(" Version du logiciel est actuellement : 1.0.2");

	public APropos(){;
		
		
		panelall.setLayout(new BorderLayout());
		panelall.add(presentation, BorderLayout.NORTH); 
		panelall.add(presentation2, BorderLayout.CENTER); 
		panelall.add(presentation3, BorderLayout.SOUTH); 
		
		JScrollPane BarreDeroulement = new JScrollPane(panelall,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		BarreDeroulement.setPreferredSize(new Dimension(500,110));
		
		panelfin.add(BarreDeroulement, BorderLayout.NORTH); 
		
		this.revalidate();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		return panelfin;
		
	}

	
}