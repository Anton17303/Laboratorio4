public class TarjetaPresentacion {
    private String nombre;
    private String numero;
    private String trabajo;

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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
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
