import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MenuInicio extends JFrame {
    private JButton jugarButton;
    private JButton verPuntajesButton;
    private List<Puntaje> puntajes;

    public MenuInicio() {
        this.setTitle("Menú de Inicio");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
        JPanel panelBienvenida = new JPanel();
        JLabel textoBienvenida = new JLabel("¡Bienvenido al Juego de Preguntas!");
        textoBienvenida.setFont(new Font("Arial", 1, 24));
        textoBienvenida.setHorizontalAlignment(0);
        panelBienvenida.add(textoBienvenida);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, 1));
        panelBotones.setAlignmentX(0.5F);
        this.jugarButton = new JButton("Jugar");
        this.jugarButton.setMaximumSize(new Dimension(300, 60));
        this.jugarButton.setBackground(Color.GREEN);
        this.jugarButton.setForeground(Color.WHITE);
        this.verPuntajesButton = new JButton("Ver Puntajes");
        this.verPuntajesButton.setMaximumSize(new Dimension(300, 60));
        this.verPuntajesButton.setBackground(Color.BLUE);
        this.verPuntajesButton.setForeground(Color.WHITE);
        panelBotones.add(Box.createVerticalGlue());
        panelBotones.add(this.jugarButton);
        panelBotones.add(Box.createRigidArea(new Dimension(0, 30)));
        panelBotones.add(this.verPuntajesButton);
        panelBotones.add(Box.createVerticalGlue());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, 1));
        panelPrincipal.add(panelBienvenida);
        panelPrincipal.add(panelBotones);
        this.add(panelPrincipal, "Center");
        this.puntajes = new ArrayList();
        this.jugarButton.addActionListener((e) -> {
            this.setVisible(false);
            String nombreJugador = JOptionPane.showInputDialog("Ingrese su nombre:");
            if (nombreJugador != null && !nombreJugador.trim().isEmpty()) {
                new JuegoTrivia(this, nombreJugador);
            } else {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
                this.setVisible(true);
            }

        });
        this.verPuntajesButton.addActionListener((e) -> {
            this.mostrarPuntajes();
        });
        this.setLocationRelativeTo((Component)null);
    }

    public void agregarPuntaje(Puntaje puntaje) {
        this.puntajes.add(puntaje);
        this.puntajes.sort((p1, p2) -> {
            return Integer.compare(p2.getPuntaje(), p1.getPuntaje());
        });
    }

    private void mostrarPuntajes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Puntaje");
        Iterator var2 = this.puntajes.iterator();

        while(var2.hasNext()) {
            Puntaje p = (Puntaje)var2.next();
            modelo.addRow(new Object[]{p.getNombre(), p.getPuntaje()});
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        JOptionPane.showMessageDialog(this, scrollPane, "Top 10 Puntajes", 1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuInicio menu = new MenuInicio();
            menu.setVisible(true);
        });
    }
}