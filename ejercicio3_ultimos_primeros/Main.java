import java.util.Scanner;

/** 
 * Problema: 6818. Los Últimos Serán Los Primeros
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Clase principal que controla el flujo de lectura hasta la señal '#'.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilaNombres registroCompetencia = new PilaNombres();

        while (scanner.hasNext()) {
            String nombre = scanner.next();
            if (nombre.equals("#")) {
                break; // Fin de la lista de participantes
            }
            registroCompetencia.registrarLlegada(nombre);
        }

        registroCompetencia.mostrarGanadores();
        scanner.close();
    }
}