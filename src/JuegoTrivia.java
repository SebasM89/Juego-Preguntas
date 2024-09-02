//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JuegoTrivia {
    private BancoDePreguntas bancoDePreguntas;
    private int preguntaActualIndex = 0;
    private int puntajeTotal = 0;
    private JFrame frame;
    private JLabel preguntaLabel = new JLabel("Pregunta:");
    private JRadioButton[] opcionesRadio;
    private ButtonGroup grupoBotones;
    private JButton confirmarButton;
    private JLabel contadorPreguntasLabel;
    private JLabel temporizadorLabel;
    private TemporizadorJuego temporizadorJuego;
    private MenuInicio menuInicio;
    private String nombreJugador;
    private boolean juegoTerminado = false;

    public JuegoTrivia(MenuInicio menuInicio, String nombreJugador) {
        this.menuInicio = menuInicio;
        this.nombreJugador = nombreJugador;
        this.bancoDePreguntas = new BancoDePreguntasSimple();
        this.inicializarInterfaz();
        this.mostrarPregunta(this.preguntaActualIndex);
        this.temporizadorJuego = new TemporizadorJuego(this.temporizadorLabel, this::handleTiempoAgotado);
        this.temporizadorJuego.iniciarTemporizador();
        this.frame.setVisible(true);
    }

    private void inicializarInterfaz() {
        this.frame = new JFrame("Juego de Trivia");
        this.frame.setLayout(new GridBagLayout());
        this.frame.setSize(500, 400);
        this.frame.setDefaultCloseOperation(3);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        this.preguntaLabel = new JLabel("Pregunta:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        this.frame.add(this.preguntaLabel, gbc);
        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new BoxLayout(panelOpciones, 1));
        this.opcionesRadio = new JRadioButton[4];
        this.grupoBotones = new ButtonGroup();

        for(int i = 0; i < this.opcionesRadio.length; ++i) {
            this.opcionesRadio[i] = new JRadioButton();
            this.grupoBotones.add(this.opcionesRadio[i]);
            panelOpciones.add(this.opcionesRadio[i]);
        }

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        this.frame.add(panelOpciones, gbc);
        this.confirmarButton = new JButton("Confirmar Respuesta");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        this.confirmarButton.setBackground(Color.GREEN);
        this.confirmarButton.setForeground(Color.WHITE);
        this.frame.add(this.confirmarButton, gbc);
        this.temporizadorLabel = new JLabel("Tiempo: 10");
        this.temporizadorLabel.setFont(new Font("Arial", 1, 16));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        this.temporizadorLabel.setForeground(Color.RED);
        this.frame.add(this.temporizadorLabel, gbc);
        this.contadorPreguntasLabel = new JLabel("Pregunta 1/10");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        this.frame.add(this.contadorPreguntasLabel, gbc);
        JButton volverMenuButton = new JButton("Volver al Menú de Inicio");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = 10;
        volverMenuButton.setBackground(Color.BLUE);
        volverMenuButton.setForeground(Color.WHITE);
        this.frame.add(volverMenuButton, gbc);
        this.confirmarButton.addActionListener((e) -> {
            if (this.grupoBotones.getSelection() == null) {
                JOptionPane.showMessageDialog(this.frame, "Por favor, selecciona una respuesta.");
            } else {
                this.verificarRespuesta();
                ++this.preguntaActualIndex;
                if (this.preguntaActualIndex < this.bancoDePreguntas.cantidadDePreguntas()) {
                    this.mostrarPregunta(this.preguntaActualIndex);
                    this.temporizadorJuego.resetearTemporizador();
                } else {
                    this.terminarJuego();
                }
            }

        });
        volverMenuButton.addActionListener((e) -> {
            this.temporizadorJuego.resetearTemporizador();
            this.frame.dispose();
            this.menuInicio.setVisible(true);
        });
    }

    private void mostrarPregunta(int index) {
        if (index < this.bancoDePreguntas.cantidadDePreguntas()) {
            Pregunta pregunta = this.bancoDePreguntas.obtenerPregunta(index);
            this.preguntaLabel.setText("Pregunta: " + pregunta.getPregunta());
            String[] opciones = pregunta.getOpciones();

            for (int i = 0; i < opciones.length; i++) {
                this.opcionesRadio[i].setText(opciones[i]);
                this.opcionesRadio[i].setSelected(false);
            }

            this.grupoBotones.clearSelection();
            this.contadorPreguntasLabel.setText("Pregunta " + (index + 1) + "/" + this.bancoDePreguntas.cantidadDePreguntas());
        }
    }

    private void verificarRespuesta() {
        if (this.preguntaActualIndex < this.bancoDePreguntas.cantidadDePreguntas()) {
            int respuestaCorrecta = this.bancoDePreguntas.obtenerPregunta(this.preguntaActualIndex).getRespuestaCorrecta();

            for(int i = 0; i < this.opcionesRadio.length; ++i) {
                if (this.opcionesRadio[i].isSelected() && i == respuestaCorrecta) {
                    this.puntajeTotal += 10;
                    JOptionPane.showMessageDialog(this.frame, "Respuesta correcta!");
                    return;
                }
            }

            JOptionPane.showMessageDialog(this.frame, "Respuesta incorrecta.");
        }
    }

    private void handleTiempoAgotado() {
        this.verificarRespuesta();
        ++this.preguntaActualIndex;
        if (this.preguntaActualIndex < this.bancoDePreguntas.cantidadDePreguntas()) {
            this.mostrarPregunta(this.preguntaActualIndex);
            this.temporizadorJuego.resetearTemporizador();
        } else {
            this.terminarJuego();
        }

    }

    private void terminarJuego() {
        if (!this.juegoTerminado) {
            this.juegoTerminado = true;
            JOptionPane.showMessageDialog(this.frame, "Juego terminado. Puntaje total: " + this.puntajeTotal);
            this.menuInicio.agregarPuntaje(new Puntaje(this.nombreJugador, this.puntajeTotal));
            this.frame.dispose();
            this.menuInicio.setVisible(true);
        }

    }
}
