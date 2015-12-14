/*
 * by ES Corp
 */
package horario;

import java.awt.Color;

/**
 * @author Dannier Castro
 */
public class OPtion {

    public static int cursos; //Cantidad de cursos
    public static String infocursos[][]; //Info de Cursos, creditos y grupos
    public static int n = 0; // Contador
    public static int longgroup = 0; //Maximo de grupo en SUpermatriz
    public static int templong; //

    //OPtionFRame frame = new OPtionFRame();
    // Para ingresar la cantidad de cursos
    public OPtion() {

        CUantos cuantos = new CUantos();
        cuantos.setVisible(true);
        cuantos.setLocationRelativeTo(null);
        cuantos.setTitle("Créditos");
        cuantos.getContentPane().setBackground(Color.WHITE);

        /*Version 1: Para evitar usar JOption
         int k = 0;
         while (k == 0) {
         try {
         cursos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de cursos que piensa llevar:\n"));
         k = 1;
         //System.out.println("-Usuario ingresara " + cursos + " cursos \n");
         } catch (NumberFormatException fis) {
         JOptionPane.showMessageDialog(null, "El número de cursos debe ser entero :/", "Ups!", JOptionPane.INFORMATION_MESSAGE);
         k = 0;
         }
         } 
        
         infocursos = new String[cursos][3];

         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
         frame.setTitle("Prioridad Curso " + (n + 1));

         */
    }

    public static void recopilacion() {
        n++;
        OPtionFRame frame = new OPtionFRame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Prioridad Curso " + (n + 1));
    }

    public static void longgroups() {
        if (templong > longgroup) {
            longgroup = templong;
        }
    }

    public static void imprime() {
        //System.out.print("-Se muestran los datos de los cursos \n");
        //System.out.print("NOMBRE" + "\t\t" + "CREDIT" + "\t\t" + "GRUPOS" + "\n");

        for (int p = 0; p < cursos; p++) {
            for (int m = 0; m < 3; m++) {
                //System.out.print(infocursos[p][m] + "\t\t");
            }
            //System.out.print("\n");
        }

        //System.out.print("\n" + "-La maxima longitud de la componente (grupos) en la supermatriz \n" + "debe ser de " + longgroup + "\n");
        SUpermatriz spmt = new SUpermatriz();
    }
}
