package jswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

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
		this.getContentPane().setBackground(Color.CYAN);

		iniciarComponentes();

	}

	private void iniciarComponentes() {

		crearPaneles();
		// crearEtiquetas();
		// crearBotones();
		// crearRadioBotones();
		// crearBotonesdeActivacion();
		// crearCajasdeTexto();
		// crearAreasdeTexto();
		// crearCasillas();
		// crearListasDespegables();
		 crearContraseña();
		//crearTablas();
		

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
		System.out.println("Esto es lo que hay en la caja" + txt1.getText());

		panel.add(txt1);

	}

	private void crearAreasdeTexto() {

		JTextArea txtA1 = new JTextArea();
		txtA1.setBounds(20, 20, 300, 200);
		txtA1.setText("NOOOOOOOO!!!!!");
		System.out.println("Esto es lo que hay en la caja" + txtA1.getText());

		panel.add(txtA1);

		JScrollPane barrasDesplz = new JScrollPane(txtA1);

		// Es importante que tenga el mismo posicionamiento
		barrasDesplz.setBounds(20, 20, 300, 200);

		// se aprecian solo cuando se necesiten
		barrasDesplz.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		barrasDesplz.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		panel.add(barrasDesplz);

	}

	private void crearCasillas() {

		JCheckBox cbx1 = new JCheckBox("Leche", true);
		cbx1.setBounds(20, 20, 100, 40);

		JCheckBox cbx2 = new JCheckBox("Galletas");
		cbx2.setBounds(20, 60, 100, 40);

		JCheckBox cbx3 = new JCheckBox("Cereal");
		cbx3.setBounds(20, 100, 100, 40);

		JCheckBox cbx4 = new JCheckBox("Jamón");
		cbx4.setBounds(20, 100, 100, 40);

		panel.add(cbx1);
		panel.add(cbx2);
		panel.add(cbx3);
		panel.add(cbx4);

	}

	private void crearListasDespegables() {

//		String [] Nombres = {"Jhonatan", "David", "Daniela", "Juana", "Rocky"};
//		
//		JComboBox cmb1 = new JComboBox(Nombres);
//		cmb1.setBounds(20, 20, 100, 30);
//		cmb1.addItem("Perra");
//		cmb1.setSelectedItem("David");
//		panel.add(cmb1);

		Persona persona1 = new Persona("Jhonatan", 19, "Colombia");
		Persona persona2 = new Persona("Daviid", 29, "Perro Hpta");

		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		JComboBox listaDesplegable = new JComboBox(modelo);

		modelo.addElement(persona1);
		modelo.addElement(persona2);
		listaDesplegable.setBounds(20, 20, 200, 30);
		panel.add(listaDesplegable);

	}

	private void crearContraseña() {

		JPasswordField pwd = new JPasswordField();
		pwd.setBounds(20, 20, 150, 30);
		pwd.setText("Esta es mi contraseña");
		System.out.println(pwd.getPassword());

		panel.add(pwd);

	}

	private void crearTablas() {

		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Nacionalidad");
		
		
		
		String [] persona1 = {"Jhonatan", "21", "Colombiano"};		
		String [] persona2 = {"Maria", "11", "Chilena"};		

		modelo.addRow(persona1);
		modelo.addRow(persona2);
		
		
		JTable tbl = new JTable(modelo);
		
		tbl.setBounds(20, 20, 300, 200);
		
		panel.add(tbl);
		JScrollPane scroll = new JScrollPane(tbl, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scroll.setBounds(tbl.getX(), tbl.getY(), tbl.getWidth(), tbl.getHeight());
		scroll.setBounds(20,20,300,200);

		
		panel.add(scroll);
		
		
		
		
	}
	
	
}