package Main;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import componentes.JTextFieldSanSerif;
import componentes.JPanelTitle;
import componentes.JPanelWhite;
public class CheckBox_Dynamic{
	
	private JPanelTitle pnlDatos =new JPanelTitle();
	private JPanelWhite Panel =new JPanelWhite();
	private JCheckBox box = new JCheckBox();
	private JFrame frame = new JFrame();
	private BorderLayout border = new BorderLayout();

	private JLabel texto = new JLabel();
	private JTextFieldSanSerif textfield1  = new JTextFieldSanSerif();
	private String vgetcheckData ="";
	private JButton boton1=new JButton("[ F11] Save");
	private String[][] array = { { "4", "Álgebra" }, 
		                         { "5", "Aritmética" },
		                         { "6", "Razonamiento Matemático" },
		                         { "7", "Trigonometría" }}; 
	
public CheckBox_Dynamic() {
	frame.setSize(290, 300);
	frame.getContentPane().setLayout(border);
	frame.setTitle("JCheckBox Dynamic");
	frame.addWindowListener(new WindowAdapter() {
		public void windowOpened(WindowEvent e) {
			this_windows(e);
		}
	});
   //Datos checkbox
	pnlDatos.setBounds( new Rectangle(35, 3, 260, 200));
	pnlDatos.setBackground(Color.white);
	pnlDatos.setFocusable(false);
	pnlDatos.setLayout(new GridLayout(0, 1, 10, 5));
	//boton F11
	boton1.setBounds(10,210,100,30);
	//Caja de texto 1
	textfield1.setText("");
	textfield1.setBounds( 120, 210, 150, 30);
	textfield1.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			keyPressed_(e);
		}
	});
	textfield1.addFocusListener(new FocusAdapter() {
	});
	//Crear checkbox Dynamic
	CreateCheckBox();
	Panel.add(pnlDatos);
	Panel.add(textfield1);
	Panel.add(boton1);
	

	frame.add(Panel);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void this_windows(WindowEvent we) {
		textfield1.grabFocus();
}
public void keyPressed_(KeyEvent ke) {
		if (ke.getKeyCode() == KeyEvent.VK_F1) {
			keyPress("4");
		}else if (ke.getKeyCode() == KeyEvent.VK_F2) {
			keyPress("5");
		}else if (ke.getKeyCode() == KeyEvent.VK_F3) {
			keyPress("6");
		}else if (ke.getKeyCode() == KeyEvent.VK_F5) {
			keyPress("7");
		}else if (ke.getKeyCode() == KeyEvent.VK_F11) {
			textfield1.setText(vgetcheckData+"\n");
		}
	}
public void CreateCheckBox() {
		for (int i = 0; i < array.length; i++) {
			int resi=(i==3?(i+2):(i + 1));//Condition if
			texto=new JLabel("[ F"+resi+ " ] ");//create label dynamic
			texto.setBounds( 7, i*50+10, 150, 30);//position label dynamic
			for (int j = 0; j < array[i].length; j++) {//create JCheckBox dynamic
				box = new JCheckBox(array[i][j]);
				String array2 = array[i][0];
				box.setName(array2);
				box.setBackground(Color.white);
			}
			Panel.add(texto);
			pnlDatos.add(box);
			pnlDatos.revalidate();
		}
	}
public void keyPress(String turno) {

		int component = pnlDatos.getComponentCount();
		for (int i = 0; i < component; i++) {
			String name = (String) pnlDatos.getComponent(i).getClass().getName();
			JCheckBox nameCheckBox = (JCheckBox) pnlDatos.getComponent(i);
			if (name == "javax.swing.JCheckBox" && nameCheckBox.getName().equalsIgnoreCase(turno)) {
				boolean check = nameCheckBox.isSelected();
				if (check) {
					nameCheckBox.setSelected(false);
					String str = vgetcheckData.replace(nameCheckBox.getName() + ";", "");
					vgetcheckData = str;
				} else {
					nameCheckBox.setSelected(true);
					vgetcheckData = vgetcheckData + nameCheckBox.getName() + ";";
				}
			}
		}

	}

}