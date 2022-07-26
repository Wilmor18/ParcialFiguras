package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel implements ActionListener {
    // Elementos del panel (atributos)
    private JButton btBorrar, btSalir;
    private VentanaPrincipal venPrin;

    // Metodos

    // Constructor
    public PanelOperaciones(VentanaPrincipal pVP) {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Creación de un objeto de tipo VentanaPrincipal
        venPrin = pVP;

        // Creación y adicion del boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", Font.BOLD, 17));
        btBorrar.setForeground(Color.BLUE);
        btBorrar.setActionCommand("borrar");
        btBorrar.addActionListener(this);
        btBorrar.setBounds(45, 0, 100, 40);
        add(btBorrar);

        // Creación y adicion del boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", Font.BOLD, 17));
        btSalir.setForeground(Color.BLUE);
        btSalir.setActionCommand("salir");
        btSalir.addActionListener(this);
        btSalir.setBounds(45, 42, 100, 40);
        add(btSalir);

    }

    // Método de atención de eventos
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Identificar el evento o comando generado
        String comando = ae.getActionCommand();
        if (comando.equals("borrar")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Borrar");
            venPrin.borrar();
        }
        if (comando.equals("salir")) {
            // JOptionPane.showMessageDialog(null,"Se hizo clic en el boton Salir");
            venPrin.salir();
        }
    }
}
