/*
 * by ES Corp
 */
package horario;

import java.awt.Color;

/**
 * @author Dannier Castro
 */
public class HOrario {

// Esta es la madre de todas las matrices y es "cuadrimensional".
    public static String supermatriz[][][][];

    public static void main(String[] args) {

        /* Versión 1 : Quitado para NO usar JOptionPane
         // Panel inicial, con las recomendaciones y tips para utilizar el software
         JOptionPane.showMessageDialog(null, "                      Bienvenido al\n            Generador de HOrarios \n\n Para un óptimo funcionamiento, siga las\n siguientes indicaciones:\n\n --Ingrese los cursos y grupos que realmente\n considera matricular, ya que el programa\n generará todos los posibles HOrarios, lo que\n podría significar bastantes opciones,\n dificultándole la comparación y selección\n del HOrario que le conviene.\n\n --Ingrese los cursos en Orden de Prioridad,\n esto le ayuda al programa a generar\n y ordenar HOrarios de acuerdo a su\n prioridad.\n\n --Tenga a mano los siguientes datos: Cursos,\n Créditos, Grupos, Días y Horas.\n\n --Lea cuidadosamente cada indicación,\n verifique los datos que ingresa y\n aproveche esta útil herramienta.\n\n\n                  DCL, by ES Corp", "HOrario", JOptionPane.INFORMATION_MESSAGE);
         */
        INtroduccion intro = new INtroduccion();

        intro.setLocationRelativeTo(null);
        intro.setTitle("HOrario by EScorp");
        intro.getContentPane().setBackground(Color.WHITE);

        /* Versión 1: Ahora el frame INdroducción se encarga de abrir OPtion
         OPtion option = new OPtion(); */
    }
}
