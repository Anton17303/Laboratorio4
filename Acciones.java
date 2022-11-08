import java.util.ArrayList;

/**
 * Acciones
 */
public interface Acciones {
    //Modo radio
    public String cambiarFmAm();
    public String cambiarEmisora();
    public String guardarEmisora();
    public String cargarEmisora();
    //Modo reproduccion
    public String seleccionarLista();
    public String cambiarCancion();
    public String escucharCancion();
    //Modo telefono
    public boolean conectarDesconectar();
    public ArrayList<Contactos> contactos();
    public String llamar();
    public String finalizarLlamada();
    public String llamarUltimoContacto();
    //Modo productividad
    public ArrayList<String> verTarjetasPresentacion();

}