/*
 * by ES Corp
 */
package horario;

import java.io.*;

/**
 * @author Dannier Castro
 */
public class Impresion {

    File newText = new File("HOrario.txt");

    public void ImpHOr() {
        if (ARmando.horario == 1) {
            try {
                FileWriter fw = new FileWriter(newText);
                fw.write("");
                titular();
            } catch (IOException iox) {
                iox.printStackTrace();
            }

        }

        encabezado();
        rellenar();

    }

    public void encabezado() {
        try {
            FileWriter fw = new FileWriter(newText, true);
            BufferedWriter wt = new BufferedWriter(fw);
            if (ARmando.horario != 1) {
                wt.newLine();
                wt.newLine();
            }
            wt.write("HORARIO " + ARmando.horario);
            wt.newLine();
            wt.newLine();
            wt.write("|HORA" + "\t" + "|LUNES" + "\t\t" + "|KARTES" + "\t\t" + "|MIERCOLES" + "\t" + "|JUEVES" + "\t\t" + "|VIERNES" + "\t" + "|SABADO" + "\t\t" + "|");
            wt.newLine();
            wt.write("" + "\t" + "|" + "\t\t" + "|" + "\t\t" + "|" + "\t\t" + "|" + "\t\t" + "|" + "\t\t" + "|" + "\t\t" + "|");
            wt.newLine();
            wt.close();
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    public void rellenar() {
        String separador[];
        for (int n = 0; n < 15; n++) {
            try {
                FileWriter fw = new FileWriter(newText, true);
                BufferedWriter wt = new BufferedWriter(fw);
                wt.write(hora(n));
                for (int m = 0; m < 6; m++) {

                    if (ARmando.Horarios[n][m] == null) {
                        wt.write("|" + "\t\t");
                    } else {
                        separador = ARmando.Horarios[n][m].split("-");

                        if (OPtion.infocursos[Integer.parseInt(separador[0])][0].length() < 5) {
                            wt.write("|  " + OPtion.infocursos[Integer.parseInt(separador[0])][0] + "\t\t");
                        }
                        if (OPtion.infocursos[Integer.parseInt(separador[0])][0].length() >= 5) {
                            wt.write("|  " + OPtion.infocursos[Integer.parseInt(separador[0])][0] + "\t");
                        }

                    }
                }
                wt.write("|");
                wt.newLine();
                wt.write("\t");

                for (int m = 0; m < 6; m++) {

                    if (ARmando.Horarios[n][m] == null) {
                        wt.write("|" + "\t\t");
                    } else {
                        String segundo;
                        separador = ARmando.Horarios[n][m].split("-");
                        segundo = SUpermatriz.curgroup[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + "  ";

                        if (SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])].equals("")) {
                            segundo += "---------";
                            //System.out.println("PROFE PROFE -" + SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + "-");
                        } else {
                            segundo += SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])];
                        }

                        if (segundo.length() == 15) {
                            wt.write("|" + segundo);
                        } else {

                            if (segundo.length() < 7) {
                                wt.write("|" + segundo + "\t\t");
                            }
                            if (segundo.length() >= 7) {
                                wt.write("|" + segundo + "\t");
                            }
                        }

                    }
                }
                wt.write("|");
                wt.newLine();
                wt.close();
            } catch (IOException iox) {
                iox.printStackTrace();
            }
        }
    }

    public String hora(int n) {
        String time = "";

        if (n == 0) {
            time = "7:00am\t";
        } else if (n == 1) {
            time = "8:00am\t";
        } else if (n == 2) {
            time = "9:00am\t";
        } else if (n == 3) {
            time = "10:00am";
        } else if (n == 4) {
            time = "11:00am";
        } else if (n == 5) {
            time = "12:00md";
        } else if (n == 6) {
            time = "1:00pm\t";
        } else if (n == 7) {
            time = "2:00pm\t";
        } else if (n == 8) {
            time = "3:00pm\t";
        } else if (n == 9) {
            time = "4:00pm\t";
        } else if (n == 10) {
            time = "5:00pm\t";
        } else if (n == 11) {
            time = "6:00pm\t";
        } else if (n == 12) {
            time = "7:00pm\t";
        } else if (n == 13) {
            time = "8:00pm\t";
        } else if (n == 14) {
            time = "9:00pm\t";
        }

        return "|" + time;
    }

    public void titular() {
        try {
            FileWriter fw = new FileWriter(newText, true);
            BufferedWriter wt = new BufferedWriter(fw);
            wt.write("GENERADOR DE HORARIOS");
            wt.newLine();
            wt.newLine();
            wt.write("Total de Creditos: " + creditotal());
            wt.newLine();
            wt.newLine();
            wt.close();
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    int creditotal() {
        int creditaje = 0;

        for (int h = 0; h < OPtion.cursos; h++) {
            creditaje += Integer.parseInt(OPtion.infocursos[h][1]);
        }
        return creditaje;

    }

    void finale() {
        try {
            FileWriter fw = new FileWriter(newText, true);
            BufferedWriter wt = new BufferedWriter(fw);
            wt.newLine();
            wt.write("Creado por Dannier Castro L., by ES Corp");
            wt.newLine();
            wt.write("dannier@thinkescorp.com, \nfacebook.com/EScorp.cr - twitter.com/EScorpCR");
            wt.close();
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
}
