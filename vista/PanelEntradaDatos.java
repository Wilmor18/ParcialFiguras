package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {

    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbDomicilios;
    // Metodos

    // Constructor
    public PanelEntradaDatos() {
        // contenedor del panel
        setLayout(null);
        this.setBackground(Color.WHITE);

        // Crear y agregar la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/figuritas.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(20, 15, 200, 200);
        add(lbImagen);

        // Crear y agregar etiqueta duracion
        lbDomicilios = new JLabel("Figuritas", JLabel.CENTER);
        lbDomicilios.setFont(new Font("Arial", Font.BOLD, 20));
        lbDomicilios.setForeground(Color.orange);
        lbDomicilios.setBounds(250, 20, 240, 40);
        add(lbDomicilios);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Figuritas");
        borde.setTitleColor(Color.orange);
        setBorder(borde);

    }

}