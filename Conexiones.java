import javax.swing.*;
import java.awt.event.*;
/**
*Genera la interfaz para capturar las conexiones de cada uno de los nodos
*@author Axel Canales Pedro Castro
*/

public class Conexiones implements ActionListener{


	JFrame ventanaPrincipal;
	JPanel panelPrincipal;
	JTable tabla;
	JLabel etiquetas[];
	java.awt.GridLayout grilla;
	JTextField textos[];

	public Conexiones(String nodos[]){
		int size = nodos.length;
		


		ventanaPrincipal = new JFrame();
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new java.awt.GridLayout(size+1,2,1,10));
		Grafo.setNodos(nodos);
		generarLabels(nodos);
		//tabla = new JTable(12,12);
		ventanaPrincipal.setSize(1024,500);
		//panelPrincipal.add(tabla);
		JButton btnGenerar = new JButton("Generar grafo");
		btnGenerar.addActionListener(this);
		panelPrincipal.add(btnGenerar);
		ventanaPrincipal.setContentPane(panelPrincipal);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	private void generarLabels(String nodos[]){
		int size = nodos.length;
		etiquetas = new JLabel[size];
		textos = new JTextField[size];

		for(int i = 0; i<nodos.length; i++){
			etiquetas[i] = new JLabel(nodos[i]);
			textos[i] = new JTextField(200);
			panelPrincipal.add(etiquetas[i]);
			panelPrincipal.add(textos[i]);
		}

	}

	public void actionPerformed(ActionEvent e){
		for(int i=0; i<textos.length; i++){
			Grafo.setConexiones(Grafo.getVertice(etiquetas[i].getText()), textos[i].getText());
		}
	}

}