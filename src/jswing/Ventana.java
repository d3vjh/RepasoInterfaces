package jswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	JPanel panel;

	public Ventana() {

		// Tamaño
		this.setSize(600, 500);

		// que hace al darle a la x
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// establece un título
		this.setTitle("Esto no es una ventana");

		// La posición por defecto es (0,0) que es la izq de la pantalla,
		// this.setLocation(int a, int b);

		// Para que salga centrado
		this.setLocationRelativeTo(null);

		// para que no se pueda redimensionar
		// this.setResizable(false);

		// Establecer el tamaño minimo, es importante crear un objeto de tipo Dimension
		// e importar la correspondiente libreria
		this.setMinimumSize(new Dimension(200, 200));

		// Primero se obtiene el contendo de la ventana, y luego se establece el color
		// this.getContentPane().setBackground(Color.BLUE);

		iniciarComponentes();

	}

	private void iniciarComponentes() {

		crearPaneles();
		// crearEtiquetas();
		// crearBotones();
		// crearRadioBotones();
		// crearBotonesdeActivacion();
		crearCajasdeTexto();

	}

	private void crearPaneles() {

		panel = new JPanel();
		panel.setBackground(Color.WHITE);

		panel.setLayout(null);

		// Agregamos el panel a la ventana
		this.getContentPane().add(panel);

	}

	private void crearEtiquetas() {

		JLabel etiqueta = new JLabel();
		// Para establecer posicion y tamaño
		etiqueta.setBounds(0, 0, 600, 100);

		// Para establecer el texto
		etiqueta.setText("Rink and Morty");

		// Para establecer la alineación horizontal del texto
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

		// Para establecer el color de la etiqueta
		etiqueta.setForeground(Color.BLACK);

		// para descativar las restricciones que vienen por defecto, y asi cambiar el
		// color del fondo
		etiqueta.setOpaque(true);

		// Para establecer el color del fondo
		etiqueta.setBackground(Color.GREEN);

		// Para establecer una nueva fuente
		etiqueta.setFont(new Font("uroob", Font.BOLD, 55));

		// -Etiqueta con Imagen
		JLabel etiquetaImg = new JLabel();
		ImageIcon imagen = new ImageIcon("./img/Rick.jpg");
		etiquetaImg.setBounds(0, 150, 600, 300);
		etiquetaImg.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImg.getWidth(),
				etiquetaImg.getHeight(), Image.SCALE_SMOOTH)));

		panel.add(etiqueta);
		panel.add(etiquetaImg);

	}

	private void crearBotones() {

		// Botón de texto
		JButton btn1 = new JButton();
		btn1.setBounds(150, 100, 100, 40);

		// Establecemos un texto
		btn1.setText("Hey!");

		// Establecemos el encendido del boton
		btn1.setEnabled(true);

		// Podemos jugar con Alt + "letra"
		btn1.setMnemonic('x');

		// Establecemos el color de la letra del botón
		btn1.setForeground(Color.BLUE);

		btn1.setFont(new Font("Cooper Black", 1, 20));
		panel.add(btn1);

		// Boton de imagen
		JButton btn2 = new JButton();
		btn2.setBounds(150, 250, 100, 40);
		ImageIcon imagen2 = new ImageIcon("./img/clic.png");
		btn2.setIcon(new ImageIcon(
				imagen2.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_SMOOTH)));
		btn2.setBackground(Color.CYAN);

		panel.add(btn2);

		// Boton con bordes
		JButton btn3 = new JButton();
		btn3.setBounds(150, 350, 150, 60);

		// Para colocar el borde, color, tamaño del borde, redondeado
		btn3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true));

		panel.add(btn3);

	}

	private void crearRadioBotones() {

		JRadioButton rbtn = new JRadioButton("Opción 1", true);
		rbtn.setBounds(50, 100, 100, 50);
		panel.add(rbtn);

		JRadioButton rbtn2 = new JRadioButton("Opción 2", false);
		rbtn2.setBounds(50, 150, 100, 50);
		panel.add(rbtn2);

		JRadioButton rbtn3 = new JRadioButton("Opción 3", false);
		rbtn3.setBounds(50, 200, 100, 50);
		panel.add(rbtn3);

		// Esto hace que en el grupo, solo se pueda seleccionar uno
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbtn);
		grupo.add(rbtn2);
		grupo.add(rbtn3);

	}

	private void crearBotonesdeActivacion() {

		JToggleButton tbtn1 = new JToggleButton();
		tbtn1.setText("Opción 1");
		tbtn1.setBounds(50, 100, 100, 50);
		tbtn1.setSelected(true);
		panel.add(tbtn1);

		JToggleButton tbtn2 = new JToggleButton();
		tbtn2.setText("Opción 2");
		tbtn2.setBounds(50, 170, 100, 50);
		panel.add(tbtn2);

		JToggleButton tbtn3 = new JToggleButton();
		tbtn3.setText("Opción 3");
		tbtn3.setBounds(50, 240, 100, 50);
		panel.add(tbtn3);

		ButtonGroup grupoToggle = new ButtonGroup();
		grupoToggle.add(tbtn1);
		grupoToggle.add(tbtn2);
		grupoToggle.add(tbtn3);

	}

	private void crearCajasdeTexto() {

		JTextField txt1 = new JTextField();
		txt1.setBounds(50, 50, 100, 30);
		txt1.setText("NOOOOOOOO!!!!!");
		System.out.println("Esto es lo que hay en la caja"+txt1.getText());
		
		panel.add(txt1);

	}

}