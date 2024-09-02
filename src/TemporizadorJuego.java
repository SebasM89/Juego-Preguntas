import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class TemporizadorJuego implements Temporizable {
    private JLabel temporizadorLabel;
    private Timer temporizador;
    private int tiempoRestante;
    private Runnable onTiempoAgotado;

    public TemporizadorJuego(JLabel temporizadorLabel, Runnable onTiempoAgotado) {
        this.temporizadorLabel = temporizadorLabel;
        this.onTiempoAgotado = onTiempoAgotado;
    }

    public void iniciarTemporizador() {
        this.tiempoRestante = 10;
        this.temporizadorLabel.setText("Tiempo: " + this.tiempoRestante);
        this.temporizador = new Timer();
        this.temporizador.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                --TemporizadorJuego.this.tiempoRestante;
                TemporizadorJuego.this.temporizadorLabel.setText("Tiempo: " + TemporizadorJuego.this.tiempoRestante);
                if (TemporizadorJuego.this.tiempoRestante <= 0) {
                    TemporizadorJuego.this.temporizador.cancel();
                    TemporizadorJuego.this.onTiempoAgotado.run();
                }

            }
        }, 1000L, 1000L);
    }

    public void resetearTemporizador() {
        if (this.temporizador != null) {
            this.temporizador.cancel();
        }

        this.iniciarTemporizador();
    }
}