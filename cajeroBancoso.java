import java.awt.*;
//import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author David Tovar Montoya
    davidtovarmontoya@gmail.com
    github user: iron-mind
 */
public class cajeroBancoso extends JFrame{

    //para la interfaz:
    Container cont;
    JPanel panel1, panel2, panel3;
    //más abajo los que va en cada botón
    JButton boton1,boton2,boton3, boton4,boton5,boton6,boton7,boton8, listo;//, 
	  JLabel encabezado, textocentro, imagen;

    //más abajo está el la clase maneja evento
	  ManejaEvento manejador;
	
	//constructor
	public cajeroBancoso()
  { 
    //primero instanciamos el manejador de eventos, para añadirselo a los botones
    manejador = new ManejaEvento();
     
		boton1 = new JButton("Retirar");
    boton1.addActionListener(manejador);  //así con los demás botones
		boton2 = new JButton("Pago");
    boton2.addActionListener(manejador);
		boton3 = new JButton("Consulta");
    boton3.addActionListener(manejador);
		boton4 = new JButton("Cambiar Clave");
    boton4.addActionListener(manejador);
		boton5 = new JButton("Recarga");
    boton5.addActionListener(manejador);
		boton6 = new JButton("Deposito");
    boton6.addActionListener(manejador);
		boton7 = new JButton("Transferencias");
    boton7.addActionListener(manejador);
		boton8 = new JButton("Otro");
    boton8.addActionListener(manejador);

	
		// instanciemos las etiquetas 
		encabezado = new JLabel("Escoja Una Opción",JLabel.CENTER);
		textocentro = new JLabel("Para el pobre ni mi#%*!",JLabel.CENTER);
    ImageIcon icono= new ImageIcon("imagec.jpg");
    imagen= new JLabel(icono);

    // ahora paneles grid para que se modifiquen los tamaños
		panel1= new JPanel();
    panel1.setLayout(new GridLayout(1,1,3,3));
		panel1.add(encabezado);
	
   // botones de la derecha
    panel2= new JPanel();
    panel2.setLayout(new GridLayout(4, 1));
    panel2.add(boton1);
    panel2.add(boton2);
    panel2.add(boton3);
    panel2.add(boton4);


 ///  bototes de la izquierda
    panel3= new JPanel();
    panel3.setLayout(new GridLayout(4, 1));
    panel3.add(boton5);
    panel3.add(boton6);
    panel3.add(boton7);
    panel3.add(boton8);

// todo el cajero tiene layout border
		cont = getContentPane();
    cont.setLayout(new BorderLayout()  );
    cont.add(panel1, BorderLayout.NORTH);
		cont.add( panel2, BorderLayout.WEST);
		cont.add(panel3, BorderLayout.EAST );
		cont.add(textocentro, BorderLayout.SOUTH );
    cont.add(imagen, BorderLayout.CENTER  );
        
        setTitle("Banco Capitalista");
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   
    //
    //ya implementé un maneja eventos que está escuchando los botones. Y ya, el resto hazlo tú
   class ManejaEvento implements ActionListener
  {
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource() == boton1)
      {
        JOptionPane.showMessageDialog(null,"Evento Funcional, te dejo el resto a tí");

      }
      else
      {
        JOptionPane.showMessageDialog(null,"Evento Funcional, te dejo el resto a tí");
    
      }
    }
  }
}

 