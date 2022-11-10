/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * DEPARTAMENTO DE INGENIERIA
 * PROGRAMACION ORIENTADA A OBJETOS
 * @author  Eunice Anahi Mata Ixcayau
 * @date    10 - 11 - 2022
 * Controlador. Desribe el comprotamiento de la radio.
 */

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class radio implements Acciones{
    //atributos
    private int volumen;
    private String FmAm;
    private double EmisoraActual;
    private int NumListaCancionUsar;
    private boolean ModoTelefonoConexion;
    private int cancionActual;
    private ArrayList<Double> ListaEmisoras;
    private ArrayList<contactos> ListaContactos;
    private ArrayList<Cancion> ListaCanciones1;
    private ArrayList<Cancion> ListaCanciones2;
    private ArrayList<TarjetaPresentacion> listadoTarjetaPresentacion;

    //constructor
    public radio() {
        this.volumen = 10;
        this.FmAm = "FM";
        this.EmisoraActual = 0.00;
        this.NumListaCancionUsar = 0;
        this.ModoTelefonoConexion = false;
        this.cancionActual = 0;
        this.ListaEmisoras = new ArrayList<Double>();
        this.ListaContactos = new ArrayList<contactos>();
        this.ListaCanciones1 = new ArrayList<Cancion>();
        this.ListaCanciones2 = new ArrayList<Cancion>();
        this.listadoTarjetaPresentacion = new ArrayList<TarjetaPresentacion>();
    }

    //Setters y getters.
    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getFmAm() {
        return this.FmAm;
    }

    public void setFmAm(String FmAm) {
        this.FmAm = FmAm;
    }

    public double getEmisoraActual() {
        return this.EmisoraActual;
    }

    public void setEmisoraActual(double EmisoraActual) {
        this.EmisoraActual = EmisoraActual;
    }

    public int getNumListaCancionUsar() {
        return this.NumListaCancionUsar;
    }

    public void setNumListaCancionUsar(int NumListaCancionUsar) {
        this.NumListaCancionUsar = NumListaCancionUsar;
    }

    public boolean isModoTelefonoConexion() {
        return this.ModoTelefonoConexion;
    }

    public boolean getModoTelefonoConexion() {
        return this.ModoTelefonoConexion;
    }

    public void setModoTelefonoConexion(boolean ModoTelefonoConexion) {
        this.ModoTelefonoConexion = ModoTelefonoConexion;
    }

    /**
     * @return ArrayList<Double> return the ListaEmisoras
     */
    public ArrayList<Double> getListaEmisoras() {
        return ListaEmisoras;
    }

    /**
     * @param ListaEmisoras the ListaEmisoras to set
     */
    public void setListaEmisoras(ArrayList<Double> ListaEmisoras) {
        this.ListaEmisoras = ListaEmisoras;
    }

    public ArrayList<contactos> getListaContactos() {
        return this.ListaContactos;
    }

    public void setListaContactos(ArrayList<contactos> ListaContactos) {
        this.ListaContactos = ListaContactos;
    }

    public ArrayList<cancion> getListaCanciones1() {
        return this.ListaCanciones1;
    }

    public void setListaCanciones1(ArrayList<cancion> ListaCanciones1) {
        this.ListaCanciones1 = ListaCanciones1;
    }

    public ArrayList<cancion> getListaCanciones2() {
        return this.ListaCanciones2;
    }

    public void setListaCanciones2(ArrayList<cancion> ListaCanciones2) {
        this.ListaCanciones2 = ListaCanciones2;
    }

    /**
     * @return ArrayList<TarjetaPresentacion> return the listadoTarjetaPresentacion
     */
    public ArrayList<TarjetaPresentacion> getListadoTarjetaPresentacion() {
        return listadoTarjetaPresentacion;
    }

    /**
     * @param listadoTarjetaPresentacion the listadoTarjetaPresentacion to set
     */
    public void setListadoTarjetaPresentacion(ArrayList<TarjetaPresentacion> listadoTarjetaPresentacion) {
        this.listadoTarjetaPresentacion = listadoTarjetaPresentacion;
    }

    /**
     * @return int return the cancionActual
     */
    public int getCancionActual() {
        return cancionActual;
    }

    /**
     * @param cancionActual the cancionActual to set
     */
    public void setCancionActual(int cancionActual) {
        this.cancionActual = cancionActual;
    }

    // --------------------------------------------- Metodos ---------------------------------------------
    public String cambiarVolumen(String vol){
        String r = "Volumen: ";
        if(vol.equalsIgnoreCase("+")){
            this.volumen =+ 1;
            r = r + getVolumen();
        }
        else if(vol.equalsIgnoreCase("-")){
            this.volumen =- 1;
            r = r + getVolumen();
        }
        return r;
    }

    public String imprimirListaEmisoras(){
        String r = " --- Listado de Emisoras ---\n";
        for (int i = 0 ; i<ListaEmisoras.size(); i++){
            r  = r + " ( " + i + " ) " + ListaEmisoras.get(i) + "\n";
        }
        return r;
    }

    public String imprimirListaCanciones(){
        String r = " --- Listado de Canciones No." + getNumListaCancionUsar() + "\n";

        if(getNumListaCancionUsar() == 1){
            for (int i=0 ; i<ListaCanciones1.size() ; i++){
                r = r + " " + i + ". " + ListaCanciones1.get(i).toString() + "\n";
            }
        }
        else if(getNumListaCancionUsar() == 2){
            for (int i=0 ; i<ListaCanciones2.size() ; i++){
                r = r + " " + i + ". " + ListaCanciones2.get(i).toString() + "\n";
            }
        }

        return r;
    }

    // metodos de la interfaz
    //MODO RADIO ---------------------------------------------------------------------------------------------------------------------
    @Override
    public String cambiarFmAm() {
        string r = "Cambiando...";
        if (getFmAm()=="FM"){ 
            setFmAm("AM");
            r = r + "\n Cambiado a AM";
        }
        else if (getFmAm()=="AM") {
            setFmAm("FM");
            r = r + "\n Cambiado a FM";
        }
        return r;
    }

    @Override
    public String cambiarEmisora(String operador) {
        String r = "Emisora: " + getFmAm();
        if(operador.equalsIgnoreCase("+")){ //aumenta la emisora en un intevalos de 0.5
            this.EmisoraActual =+ 0.5;
        }
        else if(operador.equalsIgnoreCase("-")){ //disminuye la emisora en un intevalos de 0.5
            this.EmisoraActual =- 0.5;
        }
        r = r + " " + getEmisoraActual();
        return r;
    }

    @Override
    public String guardarEmisora(String emisora) {
        ListaEmisoras.add(emisora);
        return "Emisora " + emisora + " guardada";
    }

    @Override
    public String cargarEmisora(int emisora) {
        String r = "Emisora: " + ListaEmisoras.get(emisora);
        setEmisoraActual(ListaEmisoras.get(emisora));
        return r; 
    }

    //MODO  REPRODUCCION---------------------------------------------------------------------------------------------------------------------
    @Override
    public String seleccionarLista(int i) {
        String r = "Lista de Cancion seleccionada" + i ;
        setNumListaCancionUsar(i);
        return r;
    }

     /**
     * Metodo para cambiar la cacion
     * @param direccion 1. siguiente 2. anterior
     * @return Regresa los datos de la cancion en display
     */
    @Override
    public String cambiarCancion(int direccion) {
        String r = "Cancion cambiada: \n Reproduciendo...\n";
        if(direccion == 1){
            this.cancionActual =+ 1;
        }
        else if(direccion == 2){
            this.cancionActual =- 1;
        }

        if(NumListaCancionUsar == 1){
            if(ListaCanciones1.size() >= this.cancionActual && this.cancionActual>=0){
                r = r + ListaCanciones1.get(this.cancionActual).toString();
            }
            else { r = "No existe una cancion en la direccion deseada"; }
        }
        else if(NumListaCancionUsar ==2){
            if(ListaCanciones2.size() >= this.cancionActual && this.cancionActual>=0){
                r = r + ListaCanciones2.get(this.cancionActual).toString();
            }
            else { r = "No existe una cancion en la direccion deseada"; }
        }

        return r;
    }

    @Override
    public String escucharCancion(int i) {
        String r = "Reproduciendo... \n";

        if(getNumListaCancionUsar() == 1){
            ListaCanciones1.get(i).toString();
        }
        else if (getNumListaCancionUsar() == 2){
            ListaCanciones2.get(i).toString();
        }

        return r;
    }
   
    //MODO  TELEFONO---------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean conectarDesconectar() {
        if(getModoTelefonoConexion() == false){
            setModoTelefonoConexion(true);
        }
        else if(getModoTelefonoConexion()){
            setModoTelefonoConexion(false);
        }

        return getModoTelefonoConexion();
    }

    @Override
    public String contactos() { //imprimir contactos
        String r = " ---- Lista de Contactos --- \n";
        for(int i = 0; i<ListaContactos.size() ; i++){
            r = r + " [" + i + "] " + ListaContactos.get(i).toString() + "\n";
        }
        return r;
    }

    @Override
    public String llamar(int contacto) {
        String r = " ~~ Llamando a: " + ListaContactos.get(contacto).toString();
        return r;
    }

    @Override
    public String finalizarLlamada() {
        return "Llamada finalizada...";
    }

    @Override
    public String llamarUltimoContacto() {
        int i = ListaContactos.size();
        return llamar(i);
    }

    //MODO  PRODUCTIVIDAD ---------------------------------------------------------------------------------------------------------------------
    @Override
    public String verTarjetasPresentacion() {
        String r = " ---- Tarjetas de presentacion ----\n";
        for(int i = 0; i<listadoTarjetaPresentacion.size() ; i++){
            r = r + " (" + i + ") " + listadoTarjetaPresentacion.get(i).toString() + "\n";
        }
        return r;
    }

}
