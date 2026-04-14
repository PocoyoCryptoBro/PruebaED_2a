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