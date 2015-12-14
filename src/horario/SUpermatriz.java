/*
 * by ES Corp
 */
package horario;

/**
 * @author Dannier
 */
public class SUpermatriz {

    public static String curgroup[][] = new String[OPtion.cursos][OPtion.longgroup]; //Contrasta los cursos con los grupos disponibles
    public static String curprof[][] = new String[OPtion.cursos][OPtion.longgroup]; //Contrasta los grupos con los profes, en la misma posicion que la anterior
    public static int s1 = 0; //Contador de la supermatriz-curso
    public static int s2 = 0; //Contador de la supermatriz-grupo

    CUrsos frame = new CUrsos();

    public SUpermatriz() {
        //System.out.print("Que fue primero... el huevo o la gallina");
        HOrario.supermatriz = new String[OPtion.cursos][OPtion.longgroup][6][2];
        curgroup();

        //System.out.println("\n" + "-Comienza la recoleccion de datos para cada uno de los grupos");
        completarSM();

    }

    // Rellena la matriz curgroup, donde estan los grupos de cada curso en diferentes entradas
    public static void curgroup() {

        String split[] = new String[OPtion.longgroup];

        for (int t = 0; t < OPtion.cursos; t++) {
            split = OPtion.infocursos[t][2].split(",");

            for (int r = 0; r < split.length; r++) {
                curgroup[t][r] = split[r];
            }
        }

        //System.out.print("\n" + "-Muestra los grupos para cada curso. Cada curso es cada filas \n");
        for (int p = 0; p < OPtion.cursos; p++) {
            for (int m = 0; m < OPtion.longgroup; m++) {
                //System.out.print(curgroup[p][m] + "\t");
            }
            //System.out.print("\n");
        }

    }

    public static void completarSM() {

        if (s2 == OPtion.infocursos[s1][2].split(",").length) {
            s1++;
            s2 = 0;
        }

        if (s1 != OPtion.cursos) {
            CUrsos frame = new CUrsos();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } else {
            s1 = 0;
            s2 = 0;
            CUrsos frame = new CUrsos();
            //System.out.println("\n" + "-Se imprime el horario dentro de la matriz:");
            frame.impresion();

            //De aqui se envia la matriz al metodo que calcula todas las posibilidades de horario
            SEleccionPDF seleccion = new SEleccionPDF();

            /* Version 1
             ARmando armando = new ARmando(); */
        }

    }

}
