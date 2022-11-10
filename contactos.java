/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * DEPARTAMENTO DE INGENIERIA
 * PROGRAMACION ORIENTADA A OBJETOS
 * @author  Eunice Anahi Mata Ixcayau
 * @date    10 - 11 - 2022
 * decribe un contacto
 */

public class contactos{
    //atributos
    private String nombre;
    private String numero;


    public contactos() {
        this.nombre = "";
        this.numero = "";
    }

    public contactos(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //setters y getters
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String r = " Contacto: " + getNombre() + "\n Numero: " + getNumero();
        return r;
    }
}