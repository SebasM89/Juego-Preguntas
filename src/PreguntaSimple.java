public class PreguntaSimple implements Pregunta {
    private String pregunta;
    private String[] opciones;
    private int respuestaCorrecta;

    public PreguntaSimple(String pregunta, String[] opciones, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public String[] getOpciones() {
        return this.opciones;
    }

    public int getRespuestaCorrecta() {
        return this.respuestaCorrecta;
    }
}
