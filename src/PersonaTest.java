import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test

    @Test
    void getEdad() {
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);
        assertTrue(p.getEdad() > 0);
    }
}