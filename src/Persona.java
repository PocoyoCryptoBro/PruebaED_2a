package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Clase Persona que representa a un alumno con sus datos personales.
 *
 * Contiene información como NIF, nombre, género y fecha de nacimiento.
 * Implementa Comparable para permitir la ordenación de objetos Persona.
 *
 * @author Eric
 * @version 1.0
 */

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores por defecto.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que inicializa el NIF.
     *
     * @param nif número de NIF
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor completo.
     *
     * @param nif número de NIF
     * @param nombre nombre completo de la persona
     * @param genero género de la persona
     * @param dia día de nacimiento
     * @param mes mes de nacimiento
     * @param ano año de nacimiento
     */
    public Persona(int nif, String nombre, char genero,
                   int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Obtiene el NIF de la persona.
     *
     * @return objeto Nif
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     *
     * @param nif nuevo NIF
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el género de la persona.
     *
     * @return género
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     *
     * @param genero nuevo género
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de nacimiento.
     *
     * @return fecha de nacimiento
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento.
     *
     * @param nacimiento nueva fecha de nacimiento
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad actual de la persona.
     *
     * @return edad en años
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una representación en texto de la persona.
     * Incluye NIF, nombre, apellidos (si los hay) y edad.
     *
     * @return cadena con la información de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara dos personas por su NIF.
     *
     * @param a persona a comparar
     * @return true si tienen el mismo NIF, false en caso contrario
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara esta persona con otro objeto.
     *
     * @param obj objeto a comparar
     * @return true si son iguales (mismo NIF), false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara dos personas para ordenarlas.
     * Se basa en el valor del NIF.
     *
     * @param o persona a comparar
     * @return valor negativo, cero o positivo según el orden
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}