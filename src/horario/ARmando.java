/*
 * by ES Corp
 */
package horario;

import com.itextpdf.text.DocumentException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Dannier Castro
 */
public class ARmando {

    int marcador[] = new int[OPtion.cursos]; // Indica cuales cursos se probaran
    int valores[] = new int[OPtion.cursos]; // Cantidad de grupos por curso
    int cont = 0;
    int contador = 1;
    public static int horario = 0;
    Impresion impresion = new Impresion();

    public static String Horarios[][] = new String[15][6];

    IMpresionPDF pdfpdf = new IMpresionPDF();

    public ARmando(){
        fillvalores();
        posibilidades();

        //System.out.println("\n"+"-Prueba del metodo plus");
        //for(int n=0; n<contador;n++){
        //plus();
        //}
        //IMpresionPDF pdfpdf = new IMpresionPDF();
        if (SEleccionPDF.pdf == 1) {
            pdfpdf.comienzo();
        }

        constructor();

    }

    public void fillvalores() {
        for (int n = 0; n < OPtion.cursos; n++) {
            valores[n] = OPtion.infocursos[n][2].split(",").length;
        }

        //System.out.println("\n" + "-Arreglo de los valores");
        print(valores);

        for (int n = 0; n < OPtion.cursos; n++) {
            marcador[n] = 0;
        }
    }

    public void print(int paimp[]) {
        for (int m = 0; m < paimp.length; m++) {
            //System.out.print(paimp[m] + " ");
        }
        //System.out.println("");
    }

    public void plus() {
        int n = OPtion.cursos - 1;

        marcador[n] += 1;
        while (n != 0) {

            if (marcador[n] == valores[n]) {
                marcador[n] = 0;
                marcador[n - 1] += 1;
                n--;
            } else {
                n = 0;
            }

        }

    }

    public void posibilidades() {
        for (int n = 0; n < OPtion.cursos; n++) {
            contador = (contador * valores[n]);
        }
        //System.out.println("\n" + "-Existen " + contador + " posibilidades de horario");
    }

    public void constructor() {
        //System.out.print("Probar: ");
        print(marcador);
        int p = 0;
        if (cont < contador) {
            horario++;
            Horarios = new String[15][6];

            for (int n = 0; n < OPtion.cursos; n++) {
                for (int d = 0; d < 6; d++) {
                    try {
                        for (int m = Integer.parseInt(HOrario.supermatriz[n][marcador[n]][d][0]); m <= Integer.parseInt(HOrario.supermatriz[n][marcador[n]][d][1]); m++) {

                            if (Horarios[m][d] == null) {
                                //System.out.print("N=" + n + " D=" + d + " M=" + m + "\n");
                                Horarios[m][d] = n + "-" + marcador[n];
                                p = 1;
                            } else {
                                m = 15;
                                horario--;
                                p = 0;
                            }
                        }
                        if (p == 0) {
                            d = 6;
                            n = OPtion.cursos;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
            cont++;
            if (p == 1) {
                imprimir();

                //AGREGAR IMPRESION PDF
                if (SEleccionPDF.txt == 1) {
                    impresion.ImpHOr();
                }

                if (SEleccionPDF.pdf == 1) {
                    try {
                        pdfpdf.rellenar();
                    } catch (DocumentException ex) {
                        Logger.getLogger(ARmando.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            plus();
            constructor();
        } else {

            //AGREGAR IMPRESIÓN PDF
            if (SEleccionPDF.txt == 1) {
                impresion.finale();
            }

            //System.out.println("Hasta el FINAL");
            pdfpdf.close();

            DEspedida chao = new DEspedida();
            //FInal finale = new FInal();


        }

    }

    void imprimir() {
        //System.out.println("HORARIO " + horario);

        for (int t = 0; t < 15; t++) {
            for (int j = 0; j < 6; j++) {
                //System.out.print(Horarios[t][j] + " ");
            }
            //System.out.println("");
        }
        //System.out.println("");
    }

}
