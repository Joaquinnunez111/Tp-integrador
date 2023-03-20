import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class leer_csv {
    public void LEER_CSV() throws IOException {
        Path directorio_de_pronostico = Paths.get("C:\\Users\\54344\\Desktop\\TP Integrador\\Pronosticos\\predicciones.txt");
        Path directorio_de_partido = Paths.get("C:\\Users\\54344\\Desktop\\TP Integrador\\Partidos\\partido.txt");

Competencia competencia = new Competencia();

    }

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public void lector_de_csv_partidos(String directorio) {
        try {
            lector = new BufferedReader(new FileReader(directorio));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(";");
                imprimir_linea_partidos();
                System.out.println();

            }
            lector.close();
            linea = null;
            partes = null;


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);

        }

            }

    public void imprimir_linea_partidos() {
        for (int i = 0; i < partes.length; i++)   {    /*System.out.println(partes[i]);*/ /*//mostramos lectura del csv de partidos*/     }

        Partido partidos_ronda_1 = new Partido(
                Integer.parseInt(partes[0]),           //siempre los lugares 0,1,4 y 5, de partes[], van a ser números. Es por eso que utilizamos parseInt para pasarlos de String (como se encuentran en el csv) a int.
                Integer.parseInt(partes[1]),
                partes[2],
                partes[3],
                Integer.parseInt(partes[4]),
                Integer.parseInt(partes[5]));

        competencia.agregar_partido(partidos_ronda_1);
        competencia.mostrar_puntajes();

        //System.out.println(Juan.get_puntaje());
        //System.out.println(Juan.get_nombre());


        //System.out.println(partidos_ronda_1.get_resultado_partido());     //cuando imprimimos este tipos de resultados, que no se encuentran dentro del bucle for de arriba, salta un error, pero el resultado es correcto si lo corroboramos con el bucle.
        //System.out.println(partidos_ronda_1.get_id_partido());            //mismo que con lo de arriba.

        }
    public void lector_de_csv_pronosticos(String directorio){
        try {
            lector = new BufferedReader(new FileReader(directorio));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(";");
                imprimir_linea_pronostico();
                System.out.println();

            }
            lector.close();
            linea = null;
            partes = null;


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);}}

            public void imprimir_linea_pronostico() {
                for (int i = 0; i < partes.length; i++) {
                   /* System.out.println(partes[i]);*/ /*mostramos lectura de pronostico de juan*/
                }
                Pronosticador Juan = new Pronosticador(partes[0]);
                Pronostico pronostico_de_juan = new Pronostico(
                        Integer.parseInt(partes[1]),
                        Integer.parseInt(partes[2]),
                        Integer.parseInt(partes[3]));

                //System.out.println(Juan.get_puntaje());
               //System.out.println(Juan.get_nombre());


                competencia.agregar_pronostico(pronostico_de_juan, partes[0]);
                competencia.agregar_pronosticador(Juan);
            }
    Competencia competencia = new Competencia();


}













