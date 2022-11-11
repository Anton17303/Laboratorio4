/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * DEPARTAMENTO DE INGENIERIA
 * PROGRAMACION ORIENTADA A OBJETOS
 * @author  Eunice Anahi Mata Ixcayau
 * @author  Jose Alejandro Anton
 * @date    10 - 11 - 2022
 * Controlador. Desribe el comprotamiento de la radio.
 */
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Principal {
    public static void main(String[] args) {
        radio MiRadio = new radio();

        Scanner teclado = new Scanner(System.in);
        String menu = "------------Mi radio :) ------------\n1. Modo radio\n2. Modo reproduccion\n3. Modo telefono\n4. Modo Productividad\n5. Salir\n";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        while (opcion<5 && opcion>=1){
            switch (opcion){
                case 1:
                    String menuRadio = "--- Modo Radio ---\n1. Cambiar radio (FM/AM)\n2. Cambiar emisora\n3. Guardar emisora\n4. Cargar emisora\n5. Apagar modo radio\n";
                    int opcionRadio = 1;
                    System.out.println(menuRadio);
                    System.out.println("Ingrese la opción que desea: ");
                    opcionRadio = teclado.nextInt();
                    teclado.nextLine(); System.out.println("\n");
                    while(opcionRadio<5 && opcionRadio>=1){
                        switch (opcionRadio) {
                            case 1: //cambiar de radio FM a AM y viceversa
                                System.out.println(MiRadio.cambiarFmAm());

                                teclado.nextLine();
                                System.out.println(menuRadio);
                                System.out.println("Ingrese la opción que desea: ");
                                opcionRadio = teclado.nextInt();
                                teclado.nextLine(); System.out.println("\n");
                                break;
                            case 2: //cambiar emisora
                                try {
                                    
                                    System.out.println("Siguiente emisora ( + ) / Anterior emisora ( - )");
                                    String op = teclado.nextLine();
                                    if(MiRadio.getEmisoraActual() == 0.00 && op.equalsIgnoreCase("-")){
                                        System.out.println("Ya no se puede ir para una emisora anterior");
                                    } else{
                                        if(op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")){
                                            System.out.println(MiRadio.cambiarEmisora(op));
                                        }
                                        else{ System.out.println("Solo se permiten operadores como: + / -"); }
                                    }

                                    teclado.nextLine();
                                    System.out.println(menuRadio);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionRadio = teclado.nextInt(); System.out.println("\n");
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println(e.toString());
                                }
                                break;
                            case 3: //guardar emisora
                                try {
                                    System.out.println(" 1. Guardar emisora actual\n 2. Guardar otra emisora");
                                    int op2 = teclado.nextInt(); teclado.nextLine();
                                    if(op2 == 1){
                                        System.out.println("Guardando emisora actual " + MiRadio.getEmisoraActual());
                                        String n = "" + MiRadio.getEmisoraActual();
                                        System.out.println(MiRadio.guardarEmisora(n));
                                    }
                                    else if(op2 == 2){
                                        System.out.println("Ingrese la nueva emisora en formato ##.##");
                                        String n = teclado.nextLine();
                                        System.out.println( MiRadio.guardarEmisora(n));
                                    }
                                    
                                    teclado.nextLine();
                                    System.out.println(menuRadio);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionRadio = teclado.nextInt();
                                    teclado.nextLine(); System.out.println("\n");
                                } catch (Exception e) {
                                    System.out.println(e.toString());
                                }
                                break;
                            case 4://cargar emisora
                                try {
                                    System.out.println(MiRadio.imprimirListaEmisoras());
                                    System.out.println("Elija una emisora");
                                    int i = teclado.nextInt(); teclado.nextLine();
                                    System.out.println(MiRadio.cargarEmisora(i));

                                    
                                    teclado.nextLine();
                                    System.out.println(menuRadio);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionRadio = teclado.nextInt();
                                    teclado.nextLine(); System.out.println("\n");
                                } catch (Exception e) {
                                    System.out.println(e);
                                } 
                                break;
                            case 5:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                break;
                        }
                    }
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine(); System.out.println("\n");
                    break;
                
                case 2: 
                    String menuReproduccion = "--- Modo Reproduccion ---\n1. Seleccionar lista de reproducción\n2. Cambiar canción\n3. Escuchar canción\n4. Apagar modo reproduccion\n";
                    int opcionReproducccion = 1;
                    System.out.println(menuReproduccion);
                    System.out.println("Ingrese la opción que desea: ");
                    opcionReproducccion = teclado.nextInt();
                    teclado.nextLine();
                    while(opcionReproducccion<4 && opcionReproducccion>=1){
                        switch (opcionReproducccion) {
                            case 1: //seleccionar lista de reproduccion
                                try {
                                    System.out.println("Hay dos listas de canciones. Elija una:\n 1. Lista 1\n 2. Lista 2\n");
                                    int op3 = teclado.nextInt(); teclado.nextLine();

                                    System.out.println(MiRadio.seleccionarLista(op3));
                                    teclado.nextLine();
                                    System.out.println(menuReproduccion);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionReproducccion = teclado.nextInt();
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println(e.toString());
                                }
                                break;
                            case 2: // cambiar cancion
                                try {
                                    System.out.println("Selecciones una opcion: \n 1. Siguiente\n 2. Anterior\n");
                                    int op3 = teclado.nextInt(); teclado.nextLine();
                                    if(MiRadio.getCancionActual() == 0 && op3 ==2){
                                        System.out.println("No hay cancion anterior a la actual");
                                    }
                                    else{
                                        System.out.println(MiRadio.cambiarCancion(op3));
                                    }

                                    teclado.nextLine();
                                    System.out.println(menuReproduccion);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionReproducccion = teclado.nextInt();
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println(e.toString());
                                }
                                break;
                            case 3: //escuchar cancion
                                System.out.println(MiRadio.imprimirListaCanciones());
                                System.out.println("Selecciones el numero de la cancion a escuchar");
                                int op3 = teclado.nextInt(); teclado.nextLine();

                                System.out.println(MiRadio.escucharCancion(op3));

                                teclado.nextLine();
                                System.out.println(menuReproduccion);
                                System.out.println("Ingrese la opción que desea: ");
                                opcionReproducccion = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            case 4:
                                System.out.println("Saliendo modo reproduccion...");
                                break;
                        
                        }
                    }
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine(); System.out.println("\n");
                    break;
                
                case 3: 
                    System.out.println("Modo telefono conectado: " + MiRadio.conectarDesconectar());
                    String menuTelefono = "--- Modo Telefono ---\n1. Mostrar contactos\n2. Llamar a contacto\n3. Finalizar llamada\n4. Llamar al último contacto con el que se habló\n5. Desconectar telefono\n";
                    int opcionTelefono = 1;
                    System.out.println(menuTelefono);
                    System.out.println("Ingrese la opción que desea: ");
                    opcionTelefono = teclado.nextInt();
                    teclado.nextLine();
                    while(opcionTelefono<5 && opcionTelefono>=1){
                        switch (opcionTelefono) {
                            case 1: //mostrar contactos
                                System.out.println(MiRadio.contactos());

                                teclado.nextLine();
                                System.out.println(menuTelefono);
                                System.out.println("Ingrese la opción que desea: ");
                                opcionTelefono = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            case 2: //llamar a un cierto contacto
                                try {
                                    System.out.println(MiRadio.contactos());
                                    System.out.println("Elija el  contacto que quiera llamar");
                                    int op4 = teclado.nextInt(); teclado.nextLine();
                                    System.out.println(MiRadio.llamar(op4));

                                    teclado.nextLine();
                                    System.out.println(menuTelefono);
                                    System.out.println("Ingrese la opción que desea: ");
                                    opcionTelefono = teclado.nextInt();
                                    teclado.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Seleccione el valor correcto indicado");
                                }
                                break;
                            case 3: //finalizar llamada contactos
                                System.out.println(MiRadio.finalizarLlamada());
                                teclado.nextLine();
                                System.out.println(menuTelefono);
                                System.out.println("Ingrese la opción que desea: ");
                                opcionTelefono = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            case 4: //llamar al ultimo contacto que fue llamado
                                System.out.println(MiRadio.llamarUltimoContacto());
                            
                                teclado.nextLine();
                                System.out.println(menuTelefono);
                                System.out.println("Ingrese la opción que desea: ");
                                opcionTelefono = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            case 5: //mostrar contactos
                                System.out.println("Saliendo de modo telefono...");
                                teclado.nextLine();
                                break;
                        
                        
                            default:
                                break;
                        }
                    }
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine(); System.out.println("\n");
                    break;
                
                
                case 4:
                    System.out.println("--- Modo Productividad ---\n");
                    System.out.println(MiRadio.verTarjetasPresentacion());

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine(); System.out.println("\n");
                    break;
                
            } 
            
        }
    }
}
