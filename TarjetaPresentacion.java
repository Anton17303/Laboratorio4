/*
 * Jose Alejandro Anton
 * laboratorio 4
 * 10/11/2022
 */
public class TarjetaPresentacion {
    private String nombre;
    private String numero;
    private String trabajo;

    /*
     * los constructores
     */
    public TarjetaPresentacion(){
        nombre = " ";
        numero = " ";
        trabajo = " ";
    }
    public TarjetaPresentacion(String numero, String nombre, String trabajo){
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.numero = numero;
    }
    /*
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * @param nombre the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /*
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }
    /*
     * @param nombre the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    /*
     * @return String return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = "Nombre "+ nombre +"\nNumero: "+numero+"\nTrabajo: "+trabajo;
        return cadena;
    }
}
