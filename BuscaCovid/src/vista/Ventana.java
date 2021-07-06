
package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Título juego");
		setLocationRelativeTo(null);
		iniciarComponentes();
		setResizable(false);
	}
	
	private void  iniciarComponentes() {
		
		JPanel panel=new JPanel();
		panel.setLayout(null); 
		this.getContentPane().add(panel);
		panel.setBackground(Color.BLACK);
		JLabel nombre = new JLabel();
		panel.add(nombre);
		
		nombre.setText("Busca Covid");
		nombre.setBounds(310,40, 300, 50);
		nombre.setForeground(Color.WHITE);
		//nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setFont(new Font ("verdana",Font.PLAIN,25 ));
	//	JLabel pnjprofe = new JLabel (new ImageIcon("archivoprofe.jpg"));
	
		
		
		
	}

}   
