/*
 * Jose Alejandro Anton
 * laboratorio 4
 * 10/11/2022
 */
public class Cancion {
    private String nombre;
    private String durabilidad;
    private String autor;
    private String genero;
    /*
     * los constructores
     */
    public Cancion(){
        nombre = " ";
        durabilidad = " ";
        autor = " ";
        genero = " ";
    }
    public Cancion(String nombre, String durabilidad, String autor, String genero){
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        this.autor = autor;
        this.genero = genero;
    }
    /*
     * @param nombre the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /*
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }
    /*
     * @param nombre the durabilidad to set
     */
    public void setDurabilidad(String durabilidad) {
        this.durabilidad = durabilidad;
    }
    /*
     * @return String return the durabilidad
     */
    public String getDurabilidad() {
        return durabilidad;
    }
    /*
     * @param nombre the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /*
     * @return String return the genero
     */
    public String getGenero() {
        return genero;
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
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String cadena2 = "";
        cadena2 = "Nombre "+ nombre +"\nDurabilidad: "+durabilidad+"\nGenero: "+genero+"\nAutor: "+autor;
        return cadena2;
    }

}
