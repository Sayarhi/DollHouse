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

        //Variables
        boolean validacionEntrada=false;
        final String ROSA="\u001B[38;5;212m";
        final String RESETEO ="\u001B[0m";
        final String MENSAJE ="-------- DOLLHOUSE ---------";

        //Impresión del menú por pantalla
        System.out.println(ROSA+MENSAJE+RESETEO);

    }
}
