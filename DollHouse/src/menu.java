import java.util.Scanner;

/**
 * Creación del menú de la app DollHouse
 * 
 * @author Adriana,Miruna y Andrea
 */
public class menu {
    public static void main(String[] args) {
        //Creo el Scanner
        Scanner teclado = new Scanner(System.in);

        /**
         * Variables de color, mensaje , menú, 
         */
        boolean validacionEntrada=false;

        //colores
        final String ROSA="\u001B[38;5;212m";
        final String RESETEO ="\u001B[0m";
        final String ROSA_PASTEL = "\u001B[38;5;218m"; // Un poco más suave
        final String ROSA_BRILLANTE   = "\u001B[38;5;206m"; // Un tono más vivo y llamativo

        final String MENSAJE =" DOLLHOUSE ";
        String opciones;

        //Impresión del menú por pantalla
        System.out.println(ROSA_BRILLANTE+"   ----------------------");
        System.out.printf("        %s\n",MENSAJE);
        System.out.println("   ----------------------"+RESETEO);

        
        System.out.printf("        %s\n", "1 - Inicio");
        System.out.printf("        %s\n","2 - Instrucciones ");
        System.out.printf("        %s\n","3 - Salir ");

        do {
            //Petición de datos
            System.out.print("\nIntroduce la opción que quieras: ");
            opciones=teclado.nextLine();
            
            switch (opciones) {
                case "1":
                    System.out.println(ROSA+"Iniciando DollHouse...."+RESETEO);
                    System.out.println("Bienvenido ");
                    validacionEntrada=true;//Esto sirve para que se cierre del todo la app, si queremos que vuelva a pedir una opción lo quitamos
                    break;
                case "2":
                    System.out.println(ROSA+"\n---- INSTRUCCIONES DE DOLLHOUSE ----\n"+RESETEO);
                    System.out.println(ROSA_PASTEL+"DOLLHOUSE es una aplicación de moda y cosméticos para todo el público\n");
                    System.out.println("1) Nos centramos principalmente en ponerte a la última con los nuevos productos que están en tendencias.\n");
                    System.out.println("2) Queremos ayudarte a localizarlos en las tiendas de tu conveniencia y darles una calificación de 1 a 5 estrellas según las reseñas.\n");
                    System.out.println("3) Próximamente tendremos una actualización donde podremos ayudarte a crear outfits según tu estilo\n"+RESETEO);
                    validacionEntrada=true; //Aquí pasa lo mismo
                    break;
                
                case "3":
                    System.out.println("Hasta pronto");
                    validacionEntrada=true; //Esto sirve para salir del programa
                    break;
                default:
                    //Sirve para repetir la petición de datos si es que no meten los números indicados
                    System.out.println("\nOpción no válida. Tiene que ser del 1 al 3");
                    break;
            }
        } while (!validacionEntrada);

        teclado.close();
    }
}
