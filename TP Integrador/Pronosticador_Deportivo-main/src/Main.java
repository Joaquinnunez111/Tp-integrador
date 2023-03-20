import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Path recorrido = Paths.get("C:\\Users\\54344\\Desktop\\TP Integrador\\Pronosticos");

        //lee csv del pronosticador (datos principales)
        leer_csv lectura_pronostico = new leer_csv();
        lectura_pronostico.lector_de_csv("C:\\Users\\54344\\Desktop\\TP Integrador\\Pronosticos\\predicciones.txt");*/

        leer_csv lectura_csv_partidos = new leer_csv();
        lectura_csv_partidos.lector_de_csv_partidos("C:\\Users\\54344\\Desktop\\TP Integrador\\Partidos\\ronda_1.csv");

        leer_csv lectura_prediccion = new leer_csv();
        lectura_prediccion.lector_de_csv_partidos("C:\\Users\\54344\\Desktop\\TP Integrador\\Pronosticos\\predicciones.csv");

        }

    }
