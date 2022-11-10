import java.util.ArrayList;

/**
 * Acciones
 */
public interface Acciones {
    //Modo radio
    public String cambiarFmAm();
    /**
     * Metodo para realizar la accion de cambiarEmisora
     * @param operador operador: "+" para aumentar 0.5, "-" para disminuir 0.5
     * @return String diciendo "Emisora actual: "
     */
    public String cambiarEmisora(String operador); 
    /**
     * Metodo para guardar emisoras
     * @param emisora  recibe un valor de emisora (ej: 105.90, 90.80, 15.10) Este metodo ingresa el valor en un array.
     * @return String diciendo "Emisora ## guardada"
     */
    public String guardarEmisora(String emisora);
    /**
     * Metodo para caragar una emisora se recomienda mostrar la lista de emisoras guardadas y enumararlas.
     * @param emisora int del numero de la posicion de emisora a mostrar 
     * @return devuelve el numero de emisora.
     */
    public String cargarEmisora(int emisora);
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //Modo reproduccion
    public String seleccionarLista(int i);
    /**
     * Metodo para cambiar la cacion
     * @param direccion 1. siguiente 2. anterior
     * @return Regresa los datos de la cancion en display
     */
    public String cambiarCancion(int direccion);
    /**
     * Metodo para seleccionar una cancion
     * @param numlista numero para determinar que lista se usara
     * @param i numero de la posicion en la lista de canciones
     * @return regresar los datos de la cancion
     */
    public String escucharCancion(int i);
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //Modo telefono
    public boolean conectarDesconectar();
    public String contactos(); //imprime la lista de contactos
    /**
     * Metodo para llamar un contacto, se recomienda listar los contactos con numero de pos
     * @param contacto numero que determina la posicion en la lista de contactos
     * @return los datos del contacto y "Llamando..."
     */
    public String llamar(int contacto);
    public String finalizarLlamada();
    public String llamarUltimoContacto();
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //Modo productividad
    public String verTarjetasPresentacion(); //lista las tarjetas de presentación

}