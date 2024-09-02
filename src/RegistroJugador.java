import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistroJugador extends JFrame {
    private JTextField nombreField;
    private JButton iniciarJuegoButton;
    private MenuInicio menuInicio;

    public RegistroJugador(MenuInicio menuInicio) {
        this.menuInicio = menuInicio;
        this.setTitle("Registro de Jugador");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());
        this.nombreField = new JTextField(15);
        this.iniciarJuegoButton = new JButton("Iniciar Juego");
        this.add(new JLabel("Nombre:"));
        this.add(this.nombreField);
        this.add(this.iniciarJuegoButton);
        this.iniciarJuegoButton.addActionListener((e) -> {
            String nombreJugador = this.nombreField.getText();
            if (nombreJugador.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre.");
            } else {
                this.setVisible(false);
                new JuegoTrivia(menuInicio, nombreJugador);
            }

        });
    }
}
