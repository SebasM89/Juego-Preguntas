import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDePreguntasSimple implements BancoDePreguntas {
    private List<Pregunta> preguntas = new ArrayList();
    private List<Pregunta> preguntasSeleccionadas = new ArrayList<>();
    private static final int NUM_PREGUNTAS_A_SELECCIONAR = 10;

    public BancoDePreguntasSimple() {
        this.cargarPreguntas();
        this.seleccionarPreguntasAleatorias();
    }

    public Pregunta obtenerPregunta(int index) {
        if (index >= 0 && index < this.preguntasSeleccionadas.size()) {
            return this.preguntasSeleccionadas.get(index);
        } else {
            throw new IndexOutOfBoundsException("Índice de pregunta fuera de rango.");
        }
    }

    public int cantidadDePreguntas() {
        return this.preguntasSeleccionadas.size();
    }

    private void cargarPreguntas() {
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Italia?", new String[]{"Roma", "Venecia", "Florencia", "Milán"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Quién pintó 'La última cena'?", new String[]{"Miguel Ángel", "Leonardo Da Vinci", "Rafael", "Caravaggio"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido como la Tierra del Sol Naciente?", new String[]{"China", "Japón", "Corea", "Vietnam"}, 1));
        this.preguntas.add(new PreguntaSimple("¿En qué año comenzó la Segunda Guerra Mundial?", new String[]{"1939", "1941", "1945", "1937"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué gas es esencial para la respiración humana?", new String[]{"Hidrógeno", "Oxígeno", "Nitrógeno", "Helio"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el metal más caro del mundo?", new String[]{"Oro", "Plata", "Platino", "Rodio"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma más hablado en Brasil?", new String[]{"Español", "Portugués", "Inglés", "Francés"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué órgano del cuerpo humano filtra la sangre?", new String[]{"Corazón", "Hígado", "Riñón", "Pulmón"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Quién es el autor de 'Cien años de soledad'?", new String[]{"Gabriel García Márquez", "Mario Vargas Llosa", "Julio Cortázar", "Isabel Allende"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el planeta más grande del sistema solar?", new String[]{"Júpiter", "Saturno", "Neptuno", "Tierra"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el río más largo de Europa?", new String[]{"Volga", "Danubio", "Rin", "Loira"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué instrumento musical tiene teclas negras y blancas?", new String[]{"Guitarra", "Piano", "Violín", "Flauta"}, 1));
        this.preguntas.add(new PreguntaSimple("¿En qué continente se encuentra Egipto?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país más grande del mundo por área?", new String[]{"Canadá", "China", "Rusia", "Estados Unidos"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por desarrollar la bombilla?", new String[]{"Nikola Tesla", "Albert Einstein", "Thomas Edison", "James Watt"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido como el 'rey de la selva'?", new String[]{"Tigre", "Elefante", "León", "Jaguar"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Egipto?", new String[]{"Árabe", "Inglés", "Francés", "Egipcio antiguo"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país más pequeño del mundo?", new String[]{"Mónaco", "Nauru", "Malta", "Ciudad del Vaticano"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué científico propuso la teoría de la relatividad?", new String[]{"Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el deporte más popular en el mundo?", new String[]{"Baloncesto", "Tenis", "Fútbol", "Críquet"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el océano más profundo?", new String[]{"Atlántico", "Pacífico", "Índico", "Ártico"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país tiene la población más grande del mundo?", new String[]{"India", "Estados Unidos", "China", "Indonesia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Quién escribió 'Hamlet'?", new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué continente tiene el mayor número de países?", new String[]{"África", "Asia", "Europa", "América del Sur"}, 0));
        this.preguntas.add(new PreguntaSimple("¿En qué año llegó el hombre a la luna?", new String[]{"1959", "1965", "1969", "1973"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la moneda oficial de Japón?", new String[]{"Yuan", "Dólar", "Won", "Yen"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué color resulta de mezclar azul y amarillo?", new String[]{"Verde", "Morado", "Naranja", "Rojo"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país de habla hispana con mayor población?", new String[]{"Argentina", "México", "España", "Colombia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué gas hace que las bebidas tengan burbujas?", new String[]{"Oxígeno", "Hidrógeno", "Dióxido de carbono", "Helio"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la distancia aproximada entre la Tierra y el Sol?", new String[]{"93 millones de millas", "50 millones de millas", "70 millones de millas", "120 millones de millas"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Quién escribió 'La Odisea'?", new String[]{"Sófocles", "Homero", "Eurípides", "Platón"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por la torre Eiffel?", new String[]{"España", "Italia", "Francia", "Inglaterra"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el metal más pesado?", new String[]{"Oro", "Plomo", "Platino", "Mercurio"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el número atómico del hidrógeno?", new String[]{"1", "2", "3", "4"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Quién pintó la Capilla Sixtina?", new String[]{"Leonardo Da Vinci", "Pablo Picasso", "Vincent Van Gogh", "Miguel Ángel"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país con más islas en el mundo?", new String[]{"Filipinas", "Suecia", "Indonesia", "Grecia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el 'gigante de gas'?", new String[]{"Urano", "Neptuno", "Júpiter", "Saturno"}, 2));
        this.preguntas.add(new PreguntaSimple("¿En qué país se encuentra la Gran Muralla?", new String[]{"Japón", "China", "Corea del Sur", "India"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la primera letra del alfabeto griego?", new String[]{"Alfa", "Beta", "Gamma", "Delta"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Australia?", new String[]{"Sydney", "Melbourne", "Canberra", "Perth"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido por tener la memoria más grande?", new String[]{"Delfín", "Elefante", "Perro", "Cuervo"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el órgano más grande del cuerpo humano?", new String[]{"Cerebro", "Corazón", "Hígado", "Piel"}, 3));
        this.preguntas.add(new PreguntaSimple("¿En qué continente se encuentra Argentina?", new String[]{"América del Sur", "América del Norte", "Europa", "África"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el nombre del río que atraviesa París?", new String[]{"Rin", "Támesis", "Danubio", "Sena"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por la música reggae?", new String[]{"Brasil", "Jamaica", "Colombia", "Sudáfrica"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el desierto más grande del mundo?", new String[]{"Sahara", "Gobi", "Kalahari", "Antártida"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido como el mejor amigo del hombre?", new String[]{"Gato", "Perro", "Caballo", "Loro"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Quién es conocido como el padre de la informática?", new String[]{"Alan Turing", "Charles Babbage", "Steve Jobs", "Bill Gates"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el volcán más alto del mundo?", new String[]{"Etna", "Kilimanjaro", "Monte Santa Helena", "Ojos del Salado"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué país inventó el sushi?", new String[]{"Corea del Sur", "China", "Japón", "Tailandia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿En qué país se celebran los carnavales de Río de Janeiro?", new String[]{"Argentina", "España", "Brasil", "Cuba"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la moneda oficial del Reino Unido?", new String[]{"Dólar", "Euro", "Libra esterlina", "Franco"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué famoso científico descubrió la ley de la gravedad?", new String[]{"Albert Einstein", "Galileo Galilei", "Isaac Newton", "Stephen Hawking"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el animal más rápido del mundo?", new String[]{"Guepardo", "Águila", "Caballo", "Tiburón"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué sustancia da color a las zanahorias?", new String[]{"Clorofila", "Betacaroteno", "Luteína", "Licopeno"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el nombre del primer satélite artificial lanzado al espacio?", new String[]{"Explorer", "Sputnik", "Voyager", "Apollo"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué científico es conocido por su trabajo sobre la evolución?", new String[]{"Gregor Mendel", "Charles Darwin", "Louis Pasteur", "Alexander Fleming"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus tulipanes?", new String[]{"Bélgica", "Alemania", "Holanda", "Dinamarca"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué órgano del cuerpo humano produce insulina?", new String[]{"Hígado", "Páncreas", "Riñón", "Intestino"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Quién es el autor de 'Romeo y Julieta'?", new String[]{"Miguel de Cervantes", "William Shakespeare", "Friedrich Schiller", "Dante Alighieri"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país más poblado de África?", new String[]{"Egipto", "Sudáfrica", "Nigeria", "Etiopía"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la unidad de medida de la energía?", new String[]{"Julio", "Newton", "Amperio", "Voltio"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué presidente estadounidense es conocido por la abolición de la esclavitud?", new String[]{"George Washington", "Thomas Jefferson", "Abraham Lincoln", "Theodore Roosevelt"}, 2));
        this.preguntas.add(new PreguntaSimple("¿En qué océano se encuentra la Gran Barrera de Coral?", new String[]{"Océano Atlántico", "Océano Pacífico", "Océano Índico", "Océano Ártico"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por el tango?", new String[]{"Chile", "México", "España", "Argentina"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Canadá?", new String[]{"Toronto", "Ottawa", "Vancouver", "Montreal"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Quién pintó 'La noche estrellada'?", new String[]{"Claude Monet", "Salvador Dalí", "Vincent van Gogh", "Pablo Picasso"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el principal componente del aire?", new String[]{"Oxígeno", "Dióxido de carbono", "Nitrógeno", "Helio"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por la Torre de Pisa?", new String[]{"España", "Francia", "Italia", "Portugal"}, 2));
        this.preguntas.add(new PreguntaSimple("¿En qué año cayó el Muro de Berlín?", new String[]{"1987", "1989", "1991", "1993"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la lengua más antigua que aún se habla?", new String[]{"Latín", "Hebreo", "Griego", "Chino"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la principal moneda utilizada en Suiza?", new String[]{"Euro", "Libra esterlina", "Dólar", "Franco suizo"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta tiene un sistema de anillos visible?", new String[]{"Marte", "Júpiter", "Saturno", "Neptuno"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el nombre del río más largo de Sudamérica?", new String[]{"Orinoco", "Amazonas", "Paraná", "Magdalena"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus pirámides?", new String[]{"México", "Perú", "Egipto", "India"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué montaña es la más alta del mundo?", new String[]{"K2", "Monte Everest", "Monte Fuji", "Mont Blanc"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país tiene la mayor reserva de petróleo?", new String[]{"Estados Unidos", "Rusia", "Venezuela", "Arabia Saudita"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Quién fue el primer hombre en orbitar la Tierra?", new String[]{"Yuri Gagarin", "Neil Armstrong", "Buzz Aldrin", "John Glenn"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Grecia?", new String[]{"Esparta", "Atenas", "Corinto", "Miconos"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué gas forma burbujas en las bebidas gaseosas?", new String[]{"Oxígeno", "Hidrógeno", "Dióxido de carbono", "Metano"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué pintor es famoso por sus girasoles?", new String[]{"Pablo Picasso", "Vincent van Gogh", "Claude Monet", "Salvador Dalí"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del agua?", new String[]{"H2O", "O2", "CO2", "NaCl"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus castillos de cuento de hadas?", new String[]{"Francia", "Italia", "Alemania", "Escocia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el nombre del satélite natural de la Tierra?", new String[]{"Luna", "Marte", "Fobos", "Titán"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué escritor es conocido como el padre de la literatura?", new String[]{"Miguel de Cervantes", "William Shakespeare", "Homero", "Dante Alighieri"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por la fabricación de queso?", new String[]{"Francia", "Suiza", "Italia", "Grecia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué instrumento mide la temperatura?", new String[]{"Barómetro", "Termómetro", "Altímetro", "Pulsómetro"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué órgano del cuerpo humano bombea sangre?", new String[]{"Pulmón", "Hígado", "Riñón", "Corazón"}, 3));
        this.preguntas.add(new PreguntaSimple("¿En qué continente se encuentra el desierto del Sahara?", new String[]{"Asia", "América", "África", "Oceanía"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué río pasa por Londres?", new String[]{"Danubio", "Tíber", "Tamesis", "Sena"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el metal más blando?", new String[]{"Aluminio", "Oro", "Mercurio", "Plomo"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Quién escribió 'La Divina Comedia'?", new String[]{"Dante Alighieri", "Giovanni Boccaccio", "Nicolás Maquiavelo", "Petrarca"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el lugar más frío de la Tierra?", new String[]{"Siberia", "Antártida", "Alaska", "Groenlandia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido como la cuna del Renacimiento?", new String[]{"Francia", "Italia", "España", "Alemania"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de México?", new String[]{"Guadalajara", "Cancún", "Ciudad de México", "Monterrey"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué deporte se juega en Wimbledon?", new String[]{"Críquet", "Tenis", "Fútbol", "Golf"}, 1));
        this.preguntas.add(new PreguntaSimple("¿En qué país se encuentra el Machu Picchu?", new String[]{"México", "Perú", "Colombia", "Bolivia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué gas es esencial para la fotosíntesis?", new String[]{"Oxígeno", "Dióxido de carbono", "Nitrógeno", "Hidrógeno"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la montaña más alta de América del Norte?", new String[]{"Monte Denali", "Monte Elbert", "Monte Logan", "Pico de Orizaba"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Quién es el autor de 'Don Quijote de la Mancha'?", new String[]{"William Shakespeare", "Miguel de Cervantes", "Gabriel García Márquez", "Mario Vargas Llosa"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por su industria del vino?", new String[]{"Argentina", "Chile", "Francia", "Italia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capa más externa de la Tierra?", new String[]{"Manto", "Núcleo", "Corteza", "Atmósfera"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por la Gran Muralla?", new String[]{"Japón", "Corea del Sur", "China", "India"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué gas es más ligero que el aire?", new String[]{"Helio", "Oxígeno", "Hidrógeno", "Nitrógeno"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Quién pintó 'La Gioconda'?", new String[]{"Vincent van Gogh", "Claude Monet", "Pablo Picasso", "Leonardo da Vinci"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la unidad básica de la vida?", new String[]{"Célula", "Átomo", "Molécula", "Gen"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del queso?", new String[]{"Francia", "Suiza", "Italia", "Grecia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué órgano del cuerpo humano filtra las toxinas?", new String[]{"Corazón", "Riñón", "Hígado", "Pulmón"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Japón?", new String[]{"Osaka", "Nagoya", "Kioto", "Tokio"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por su cerveza?", new String[]{"España", "Alemania", "Francia", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Brasil?", new String[]{"Español", "Portugués", "Inglés", "Francés"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido por su trompa?", new String[]{"Elefante", "Rinoceronte", "Hipopótamo", "Jirafa"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la principal fuente de energía de la Tierra?", new String[]{"Petróleo", "Carbón", "El Sol", "Gas natural"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del cine?", new String[]{"India", "Estados Unidos", "Francia", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué río atraviesa Egipto?", new String[]{"Nilo", "Amazonas", "Rin", "Mississippi"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el océano más pequeño del mundo?", new String[]{"Atlántico", "Pacífico", "Ártico", "Índico"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del automóvil?", new String[]{"Alemania", "Japón", "Estados Unidos", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué tipo de animal es un delfín?", new String[]{"Pez", "Mamífero", "Reptil", "Anfibio"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Quién fue el primer presidente de los Estados Unidos?", new String[]{"John Adams", "Thomas Jefferson", "Abraham Lincoln", "George Washington"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Rusia?", new String[]{"San Petersburgo", "Moscú", "Kiev", "Vladivostok"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la electricidad?", new String[]{"Nikola Tesla", "Thomas Edison", "Benjamin Franklin", "James Watt"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el planeta más cercano al Sol?", new String[]{"Venus", "Tierra", "Mercurio", "Marte"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por el café?", new String[]{"Etiopía", "Brasil", "Colombia", "Perú"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la principal fuente de vitamina D?", new String[]{"Frutas", "Verduras", "Luz solar", "Carnes"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus pizzas?", new String[]{"Francia", "Italia", "España", "Grecia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el metal más abundante en la Tierra?", new String[]{"Oro", "Hierro", "Cobre", "Plata"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus tulipanes?", new String[]{"Francia", "Países Bajos", "Alemania", "Dinamarca"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del oro?", new String[]{"Ag", "Au", "Fe", "Pb"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido por construir presas?", new String[]{"Castor", "Nutria", "Rata", "Cangrejo"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus relojes?", new String[]{"Francia", "Suiza", "Alemania", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el país más grande de Europa?", new String[]{"Francia", "Alemania", "Rusia", "Ucrania"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta tiene la mayor cantidad de lunas?", new String[]{"Marte", "Saturno", "Júpiter", "Neptuno"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué continente se conoce como el 'continente blanco'?", new String[]{"Antártida", "África", "Asia", "Europa"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por la ópera?", new String[]{"España", "Francia", "Italia", "Austria"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la lengua oficial de Canadá?", new String[]{"Inglés", "Francés", "Ambos", "Ninguno"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por la salsa?", new String[]{"México", "Colombia", "Puerto Rico", "Cuba"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido por su habilidad para cambiar de color?", new String[]{"Pulpo", "Camaleón", "Serpiente", "Rana"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la principal fuente de oxígeno en la Tierra?", new String[]{"Océanos", "Bosques", "Plantas", "Ríos"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus baguettes?", new String[]{"Italia", "Francia", "España", "Portugal"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico de la plata?", new String[]{"Ag", "Au", "Fe", "Pb"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué animal es conocido por su caparazón?", new String[]{"Tortuga", "Armadillo", "Caracol", "Cangrejo"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es la capital de Francia?", new String[]{"París", "Londres", "Berlín", "Roma"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por el avión?", new String[]{"Wright Brothers", "Henry Ford", "Nikola Tesla", "Thomas Edison"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es conocido por sus pirámides?", new String[]{"Egipto", "México", "Perú", "India"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Argentina?", new String[]{"Portugués", "Español", "Inglés", "Francés"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del oxígeno?", new String[]{"O", "O2", "Ox", "Ox2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus castillos?", new String[]{"Francia", "Alemania", "España", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta tiene un anillo visible?", new String[]{"Júpiter", "Saturno", "Marte", "Venus"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como la cuna de la civilización?", new String[]{"Asia", "África", "Europa", "América"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del avión?", new String[]{"Wright Brothers", "Henry Ford", "Nikola Tesla", "Thomas Edison"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Italia?", new String[]{"Francés", "Español", "Inglés", "Italiano"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del hidrógeno?", new String[]{"H", "H2", "He", "Hi"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus pirámides?", new String[]{"Egipto", "México", "Perú", "India"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la bombilla eléctrica?", new String[]{"Nikola Tesla", "Thomas Edison", "Alexander Graham Bell", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de España?", new String[]{"Francés", "Español", "Inglés", "Italiano"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del carbono?", new String[]{"C", "Ca", "Cb", "C2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus relojes?", new String[]{"Suiza", "Alemania", "Francia", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es el más cercano al Sol?", new String[]{"Tierra", "Marte", "Venus", "Mercurio"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente negro?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del telégrafo?", new String[]{"Nikola Tesla", "Samuel Morse", "Alexander Graham Bell", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Brasil?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del nitrógeno?", new String[]{"N", "Ni", "Na", "N2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del chocolate?", new String[]{"Suiza", "Alemania", "Francia", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta rojo?", new String[]{"Tierra", "Marte", "Venus", "Júpiter"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente helado?", new String[]{"Antártida", "África", "Europa", "América"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención de la radio?", new String[]{"Nikola Tesla", "Guglielmo Marconi", "Alexander Graham Bell", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Canadá?", new String[]{"Francés", "Inglés", "Ambos", "Ninguno"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del azufre?", new String[]{"S", "Sa", "Su", "Sf"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del vino?", new String[]{"Francia", "Alemania", "España", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es el más grande del sistema solar?", new String[]{"Saturno", "Júpiter", "Urano", "Neptuno"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como la cuna de la humanidad?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del automóvil?", new String[]{"Henry Ford", "Karl Benz", "Nikola Tesla", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Alemania?", new String[]{"Francés", "Español", "Inglés", "Alemán"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del hierro?", new String[]{"H", "He", "Fe", "Ir"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus pizzas?", new String[]{"Francia", "Alemania", "Italia", "España"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el gigante gaseoso?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente verde?", new String[]{"Asia", "África", "Europa", "América"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del barco a vapor?", new String[]{"James Watt", "Robert Fulton", "Nikola Tesla", "Thomas Edison"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Rusia?", new String[]{"Francés", "Español", "Inglés", "Ruso"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del calcio?", new String[]{"Ca", "C", "Ce", "Cl"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del aceite de oliva?", new String[]{"Francia", "Alemania", "España", "Italia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta azul?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente dorado?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del motor de combustión interna?", new String[]{"Nikola Tesla", "Karl Benz", "Rudolf Diesel", "James Watt"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Japón?", new String[]{"Francés", "Español", "Inglés", "Japonés"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del fósforo?", new String[]{"P", "F", "Ph", "Po"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del automovilismo?", new String[]{"Alemania", "Estados Unidos", "Japón", "Italia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta gigante?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente negro?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del ferrocarril?", new String[]{"George Stephenson", "James Watt", "Nikola Tesla", "Robert Fulton"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de México?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del silicio?", new String[]{"Si", "S", "Sl", "Sc"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus relojes de cuco?", new String[]{"Suiza", "Alemania", "Francia", "Italia"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es el más cercano al Sol?", new String[]{"Tierra", "Marte", "Venus", "Mercurio"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente blanco?", new String[]{"Asia", "África", "Europa", "Antártida"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención de la radio?", new String[]{"Guglielmo Marconi", "Nikola Tesla", "Alexander Graham Bell", "James Watt"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Chile?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del potasio?", new String[]{"K", "Po", "P", "Pt"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del vino?", new String[]{"Francia", "Alemania", "España", "Italia"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es el más grande del sistema solar?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como la cuna de la civilización?", new String[]{"Asia", "África", "Europa", "América"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del avión?", new String[]{"Wright Brothers", "Henry Ford", "Nikola Tesla", "James Watt"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de España?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del azufre?", new String[]{"S", "Sa", "Su", "Sf"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del chocolate?", new String[]{"Suiza", "Alemania", "Francia", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta rojo?", new String[]{"Tierra", "Marte", "Venus", "Júpiter"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente helado?", new String[]{"Asia", "África", "Europa", "Antártida"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención de la bombilla?", new String[]{"Nikola Tesla", "Thomas Edison", "Alexander Graham Bell", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Argentina?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del hidrógeno?", new String[]{"H", "He", "Hy", "H2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del aceite de oliva?", new String[]{"Francia", "Alemania", "España", "Italia"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta azul?", new String[]{"Tierra", "Marte", "Venus", "Júpiter"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente dorado?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del automóvil?", new String[]{"Henry Ford", "Karl Benz", "Nikola Tesla", "James Watt"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Japón?", new String[]{"Francés", "Español", "Inglés", "Japonés"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del nitrógeno?", new String[]{"N", "Ni", "Na", "N2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por sus relojes?", new String[]{"Suiza", "Alemania", "Francia", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta tiene el anillo más visible?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como el continente verde?", new String[]{"Asia", "África", "Europa", "América"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del motor de combustión interna?", new String[]{"Nikola Tesla", "Karl Benz", "Rudolf Diesel", "James Watt"}, 2));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Brasil?", new String[]{"Francés", "Español", "Inglés", "Portugués"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del carbono?", new String[]{"C", "Ca", "Cb", "C2"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué país es famoso por su industria del vino?", new String[]{"Francia", "Alemania", "España", "Italia"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Qué planeta es conocido como el planeta gigante?", new String[]{"Tierra", "Marte", "Saturno", "Júpiter"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Qué continente es conocido como la cuna de la humanidad?", new String[]{"Asia", "África", "Europa", "América"}, 1));
        this.preguntas.add(new PreguntaSimple("¿Qué inventor es conocido por la invención del ferrocarril?", new String[]{"George Stephenson", "James Watt", "Nikola Tesla", "Robert Fulton"}, 0));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el idioma oficial de Alemania?", new String[]{"Francés", "Español", "Inglés", "Alemán"}, 3));
        this.preguntas.add(new PreguntaSimple("¿Cuál es el símbolo químico del hierro?", new String[]{"H", "He", "Fe", "Ir"}, 2));

    }

    private void seleccionarPreguntasAleatorias() {
        // Barajamos la lista de preguntas para hacer una selección aleatoria.
        Collections.shuffle(this.preguntas);
        // Seleccionamos las primeras 10 preguntas después de barajar.
        for (int i = 0; i < NUM_PREGUNTAS_A_SELECCIONAR; i++) {
            this.preguntasSeleccionadas.add(this.preguntas.get(i));
        }
    }
}
