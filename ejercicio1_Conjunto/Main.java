import java.util.Scanner;

/** 
 * Problema: 4086. Conjunto
 * Autor: Angel de Jesus Nolasco Rivera
 * Grupo: GTID244 
 * Fecha: 01/11/2026 
 * Descripción: Clase principal para la lectura y entrega del resultado del problema Conjunto.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String entrada = scanner.next();
            if (ValidadorConjunto.esValida(entrada)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}