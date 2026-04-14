import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test

    @Test
    void getEdad() {
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);
        assertTrue(p.getEdad() > 0);
    }

    @Test
    void equalsTest() {
        Persona p1 = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);
        Persona p2 = new Persona(12345678, "Otro Nombre", 'H', 2, 2, 2001);

        assertTrue(p1.equals(p2));
    }

    @Test
    void compareToTest() {
        Persona p1 = new Persona(11111111, "Juan Perez", 'H', 1, 1, 2000);
        Persona p2 = new Persona(22222222, "Ana Lopez", 'M', 2, 2, 2001);

        assertTrue(p1.compareTo(p2) < 0);
    }

    @Test
    void toStringTest() {
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);
        String texto = p.toString();
        assertTrue(texto.contains("Juan"));
    }
}