package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

    private PanelEntradaDatos miPanelEntradaDatos;
    private PanelInformacion miPanelResultados;
    private PanelOperaciones miPanelOperaciones;

    // Metodos

    // Metodo constructor
    public VentanaPrincipal() {

        // Contenedor de la ventana
        setLayout(null);

        // Crear y agregar el panel a la ventana
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 480, 360);
        add(miPanelEntradaDatos);

        // Crear y agregar el panel a la ventana
        miPanelOperaciones = new PanelOperaciones(this);
        miPanelOperaciones.setBounds(10, 250, 200, 115);
        add(miPanelOperaciones);

        // Crear y agregar el panel a la ventana
        miPanelResultados = new PanelInformacion();
        miPanelResultados.setBounds(10, 375, 480, 115);
        add(miPanelResultados);

        
        Crear y agregar el panel a la ventana
        miPanelUsuario = new PanelUsuario();
        miPanelUsuario.setBounds(10, 375, 480, 115);
        add(miPanelResultados);
         

        // Caracteristicas de la ventanta
        setTitle("Figuritas Doña lupe");
        setSize(500, 540);
        // setLocation(100,100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    // Operaciones principales
    public void salir() {
        JOptionPane.showMessageDialog(null, "Bye bye...");
        System.exit(0);
    }

    public void borrar() {
        miPanelResultados.borrarResultado();
    }

}
