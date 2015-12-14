 /*
 * by ES Corp
 */
package horario;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Image;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dannier
 */
public class IMpresionPDF {

    public static Document document = new Document();
    public static BaseColor colores[] = new BaseColor[15];
    public static BaseColor colorback[][]= new BaseColor[15][2];
    public static Rectangle rect = new Rectangle(PageSize.A4.getWidth(), PageSize.A4.getWidth()-40);
    static Image image;
            

    public void comienzo() {

        //System.out.println("Esto es el tamaño de A4: "+PageSize.A4.getWidth());
        rect.setBackgroundColor(new BaseColor(0xA6,0xD8,0xF4));
        document.setPageSize(rect);
        
        try {
            
            PdfWriter.getInstance(document, new FileOutputStream("HOrario.pdf"));
            
            image = Image.getInstance(this.getClass().getResource("LogoEScorp50x50.png"));
            image.scalePercent(18f);
            image.setAbsolutePosition(533f, 6f);

            //document.setPageSize(rect);
            document.open();
            
            /* Si no hay horario posible el programa da error por no tener paginas, pero portada() siempre va a agregar una pagina
            entonces no va a hacer falta
            Paragraph noerror = new Paragraph(" ");
            document.add(noerror);
            */
            
            portada();

        } catch (Exception e) {
            e.printStackTrace();
        }

        backgroud();
        basecolor();

    }

    public void portada() throws BadElementException, IOException {
        System.out.println("Aqui va la portada :D");
        
        //Paragraph hola = new Paragraph("Aqui va la portada :D");
        //document.add(hola);
        
            Image imag;
            imag = Image.getInstance(this.getClass().getResource("PortadaHOrarioSinFondo.png"));
            imag.scalePercent(23f);
            imag.setAbsolutePosition(30f, 100f);
            
            Image twitter = Image.getInstance(this.getClass().getResource("LogoTwitter.png"));
            Image facebook = Image.getInstance(this.getClass().getResource("LogoFacebook.png"));
            Image google = Image.getInstance(this.getClass().getResource("LogoGoogle+.png"));
            Image escorp;
            escorp = Image.getInstance(this.getClass().getResource("LogoEScorp128x18HOrarioPDF.png"));
            
            twitter.scalePercent(10f);
            facebook.scalePercent(10f);
            google.scalePercent(42f);
            escorp.scalePercent(10f);
            
            Chunk t = new Chunk(twitter, 0, 0);
            Chunk f = new Chunk(facebook, 0, 0);
            Chunk g = new Chunk(google, 0, 0);
            Chunk e = new Chunk(escorp, 0, 0);
            
            t.setAnchor(new URL("http://www.twitter.com/EScorpCR"));
            f.setAnchor(new URL("http://www.facebook.com/EScorp.cr"));
            g.setAnchor(new URL("http://www.plus.google.com/112538983023268645889/posts"));
            e.setAnchor(new URL("http://www.thinkescorp.com"));
            
            //image.scalePercent(18f);
            //imag.setAbsolutePosition(250f, 250f);
            
            //Chunk ima = new Chunk(imag, 0, -12);
            //ima.setAnchor(new URL("http://www.facebook.com"));
            
            Paragraph charral = new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                          ");
            
            Font fonter = new Font(FontFamily.HELVETICA, 4, Font.BOLD, BaseColor.WHITE);
            Paragraph espacio = new Paragraph();
            espacio.setFont(fonter);
            espacio.add("\n\n");
        try {
            document.add(espacio);
        } catch (DocumentException ex) {
            Logger.getLogger(IMpresionPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            charral.add(f);
            charral.add("     ");
            charral.add(t);
            charral.add("     ");
            charral.add(g);
            charral.add("     ");
            charral.add(e);
            charral.add("     ");
            
        try {
            document.add(imag);
        } catch (DocumentException ex) {
            Logger.getLogger(IMpresionPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.add(charral);
        } catch (DocumentException ex) {
            Logger.getLogger(IMpresionPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
    }

    public void rellenar() throws DocumentException {
        
        int random = (int)(Math.random()*10);
        
        rect.setBackgroundColor(colorback[random][1]);
        document.setPageSize(rect);
        document.newPage();
        
        Paragraph parrafo = new Paragraph();
        PdfPTable table = new PdfPTable(new float[]{4, 5, 5, 5, 5, 5, 5});
        table.setTotalWidth(PageSize.A4.getWidth() - 50);
        table.setLockedWidth(true);

        /*Encabezado*/
        Font fonter = new Font(FontFamily.HELVETICA, 16, Font.BOLD, colorback[random][0]);
        parrafo.setFont(fonter);
        parrafo.add("HOrario " + ARmando.horario + "\n\n");

        Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
        Phrase hora = new Phrase("HORA\n", font);
        Phrase lunes = new Phrase("LUNES", font);
        Phrase kartes = new Phrase("KARTES", font);
        Phrase miercoles = new Phrase("MIERCOLES", font);
        Phrase jueves = new Phrase("JUEVES", font);
        Phrase viernes = new Phrase("VIERNES", font);
        Phrase sabado = new Phrase("SABADO", font);

        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        table.getDefaultCell().setBackgroundColor(colorback[random][0]);

        table.addCell(hora);
        table.addCell(lunes);
        table.addCell(kartes);
        table.addCell(miercoles);
        table.addCell(jueves);
        table.addCell(viernes);
        table.addCell(sabado);
        
        table.getDefaultCell().setColspan(7);
        table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
        Font fonta = new Font(FontFamily.HELVETICA, 1, Font.BOLD, BaseColor.WHITE);
        Phrase linea = new Phrase(" ", fonta);
        table.addCell(linea);
        
        table.getDefaultCell().setColspan(1);
        

        document.add(parrafo);
        //document.add(table);
        //document.close();

        //System.out.println("CAMPEON "+ ARmando.horario);

        /* Rellenar el horario */
        Font font1 = new Font(FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.BLACK);

        String separador[];
        for (int n = 0; n < 15; n++) {
            
            table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
            table.addCell(hora(n));
            for (int m = 0; m < 6; m++) {
                
                if (ARmando.Horarios[n][m] == null) {
                    table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
                    table.addCell("\n\n");
                } else {
                    separador = ARmando.Horarios[n][m].split("-");

                    if (SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])].equals("")) {
                        
                        table.getDefaultCell().setBackgroundColor(colores[Integer.parseInt(separador[0])]);
                        
                        Phrase curso = new Phrase(OPtion.infocursos[Integer.parseInt(separador[0])][0] + "\n" + SUpermatriz.curgroup[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + "  " + "---------", font1);
                        table.addCell(curso);

                        //table.addCell(OPtion.infocursos[Integer.parseInt(separador[0])][0]+"\n"+SUpermatriz.curgroup[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + "  "+"---------");
                        //System.out.println("PROFE PROFE -" + SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + "-");
                    } else {
                        table.getDefaultCell().setBackgroundColor(colores[Integer.parseInt(separador[0])]);
                        
                        Phrase curso = new Phrase(OPtion.infocursos[Integer.parseInt(separador[0])][0] + "\n" + SUpermatriz.curgroup[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + " " + SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])], font1);
                        table.addCell(curso);

                        //.addCell(OPtion.infocursos[Integer.parseInt(separador[0])][0]+"\n"+SUpermatriz.curgroup[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])] + " " + SUpermatriz.curprof[Integer.parseInt(separador[0])][Integer.parseInt(separador[1])]);
                    }

                }
            }

        }
        document.add(table);
        document.add(image);
        
        //parrafo = new Paragraph();
        //parrafo.add("\n");
        //document.add(parrafo);

    }

    public static void close() {
        //System.out.println("CERRADO");
        document.close();
    }

    public static String hora(int n) {
        String time = "";

        if (n == 0) {
            time = "7:00am";
        } else if (n == 1) {
            time = "8:00am";
        } else if (n == 2) {
            time = "9:00am";
        } else if (n == 3) {
            time = "10:00am";
        } else if (n == 4) {
            time = "11:00am";
        } else if (n == 5) {
            time = "12:00md";
        } else if (n == 6) {
            time = "1:00pm";
        } else if (n == 7) {
            time = "2:00pm";
        } else if (n == 8) {
            time = "3:00pm";
        } else if (n == 9) {
            time = "4:00pm";
        } else if (n == 10) {
            time = "5:00pm";
        } else if (n == 11) {
            time = "6:00pm";
        } else if (n == 12) {
            time = "7:00pm";
        } else if (n == 13) {
            time = "8:00pm";
        } else if (n == 14) {
            time = "9:00pm";
        }

        return time;
    }

    public static void basecolor() {
        BaseColor color[] = new BaseColor[15];

        color[0] = new BaseColor(0xD3, 0xE3, 0xF0);
        color[1] = new BaseColor(0xF0, 0xE0, 0xD3);
        color[2] = new BaseColor(0xFF, 0xD2, 0xBF);
        color[3] = new BaseColor(0xBF, 0xEC, 0xFF);
        color[4] = new BaseColor(0xFC, 0xD9, 0xAC);
        color[5] = new BaseColor(0xAC, 0xCF, 0xFC);
        color[6] = new BaseColor(0xB8, 0xC3, 0xFC);
        color[7] = new BaseColor(0xFC, 0xF1, 0xB8);
        color[8] = new BaseColor(0xFA, 0xF8, 0xB9);
        color[9] = new BaseColor(0xFC, 0xAC, 0xF6);
        color[10] = new BaseColor(0xFF, 0xB8, 0xB9);
        color[11] = new BaseColor(0xF0, 0xF0, 0xF0);
        color[12] = new BaseColor(0xD6, 0xFF, 0xD8);
        color[13] = new BaseColor(0xFF, 0xD6, 0xFD);
        color[14] = new BaseColor(0xAC, 0xFC, 0xB2);

        int array1[] = new int[15];

        for (int n = 0; n < 15; n++) {
            int random = (int) (Math.random() * 15);
            array1[n] = random;
            for (int m = 0; m < n; m++) {

                if (array1[m] == random) {
                    n--;
                    m = 20;
                }
            }
        }

        //for (int a = 0; a < 15; a++) {
          //  System.out.print(array1[a] + ", ");
        //}
        
        for(int s=0; s < 15; s++){
        colores[s]=color[array1[s]];
        }
        
    }

    private static void backgroud() {
        
        colorback[0][0] = new BaseColor(0x20, 0x63, 0x1A);
        colorback[1][0] = new BaseColor(0x45, 0x13, 0x4A);
        colorback[2][0] = new BaseColor(0x6B, 0x0E, 0x0E);
        colorback[3][0] = new BaseColor(0x0E, 0x6B, 0x6E);
        colorback[4][0] = new BaseColor(0x73, 0x14, 0x66);
        colorback[5][0] = new BaseColor(0x16, 0x08, 0x3B);
        colorback[6][0] = new BaseColor(0x2D, 0x3B, 0x08);
        colorback[7][0] = new BaseColor(0x5E, 0x37, 0x00);
        colorback[8][0] = new BaseColor(0x00, 0x27, 0x5E);
        colorback[9][0] = new BaseColor(0x99, 0x00, 0x00);
        
        colorback[0][1] = new BaseColor(0xCA, 0xF2, 0xC7);
        colorback[1][1] = new BaseColor(0xE4, 0xC8, 0xE6);
        colorback[2][1] = new BaseColor(0xCC, 0xB1, 0xB1);
        colorback[3][1] = new BaseColor(0xB1, 0xCC, 0xCC);
        colorback[4][1] = new BaseColor(0xD4, 0xB8, 0xD0);
        colorback[5][1] = new BaseColor(0xC1, 0xBA, 0xD4);
        colorback[6][1] = new BaseColor(0xCD, 0xD4, 0xBA);
        colorback[7][1] = new BaseColor(0xC9, 0xBD, 0xAB);
        colorback[8][1] = new BaseColor(0xAB, 0xB7, 0xC9);
        colorback[9][1] = new BaseColor(0xF0, 0xD1, 0xD1);
        
    }

}
