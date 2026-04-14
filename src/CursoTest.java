import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @org.junit.jupiter.api.Test
    void getNombre() {
        Curso curso = new Curso("Programacion");
        assertEquals("Programacion", curso.getNombre());
    }
    @Test
    void testToString() {
        Curso curso = new Curso("Programacion");
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);

        curso.aniadirAlumno(p);

        String resultado = curso.toString();

        assertTrue(resultado.contains("Programacion"));
        assertTrue(resultado.contains("Juan"));
    }
    @Test
    void aniadirAlumno() {
        Curso curso = new Curso("Programacion");
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);

        curso.aniadirAlumno(p);

        String resultado = curso.toString();

        assertTrue(resultado.contains("Juan"));
    }
}