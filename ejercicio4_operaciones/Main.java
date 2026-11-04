import java.util.Scanner;

/** 
 * Problema: 1019. Operaciones con una pila
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Clase principal que coordina la entrada de datos e invoca las operaciones sobre la pila.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        PilaEspecial pilaCustom = new PilaEspecial();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            pilaCustom.procesarNumero(a);
        }

        pilaCustom.imprimirResultado();
        scanner.close();
    }
}