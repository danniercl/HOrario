/*
 * by ES Corp
 */
package horario;

import java.awt.Color;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Dannier Castro
 */
public final class CUrsos extends javax.swing.JFrame {

    int l = 0, k = 0, m = 0, j = 0, v = 0, s = 0;
    String texto = "";

    static String model1[] = new String[]{"7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"};
    static String model2[] = new String[]{"7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50"};
    public static String nulo;

    public CUrsos() {
        initComponents();
        nulo = textField1.getText();

        getContentPane().setBackground(Color.WHITE);

        xxx();
        if (SUpermatriz.s1 == 0 && SUpermatriz.s2 == 0) {
            jLabel3.hide();
        }
        //System.out.println("Aqui la vara funca :)");

        label1.setText("Curso: " + OPtion.infocursos[SUpermatriz.s1][0] + ", Grupo: " + SUpermatriz.curgroup[SUpermatriz.s1][SUpermatriz.s2]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label4 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(500, 550));

        jRadioButton1.setBackground(java.awt.Color.white);
        jRadioButton1.setText("Lunes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(java.awt.Color.white);
        jRadioButton2.setText("Kartes");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(java.awt.Color.white);
        jRadioButton3.setText("Miercoles");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(java.awt.Color.white);
        jRadioButton4.setText("Jueves");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(java.awt.Color.white);
        jRadioButton5.setText("Viernes");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(java.awt.Color.white);
        jRadioButton6.setText("Sabado");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:50", "8:50", "9:50", "10:50", "11:50", "12:50", "13:50", "14:50", "15:50", "16:50", "17:50", "18:50", "19:50", "20:50", "21:50" }));

        label1.setBackground(java.awt.Color.white);
        label1.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 0, 0));

        label2.setBackground(java.awt.Color.white);
        label2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        label2.setText("Ingrese el Nombre del Profesor");

        label3.setBackground(java.awt.Color.white);
        label3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label3.setText("(Opcional)");

        textField1.setBackground(java.awt.Color.white);
        textField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });

        label4.setBackground(java.awt.Color.white);
        label4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label4.setText("max 10 caract.");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario/LineaAzul.png"))); // NOI18N

        jLabel1.setText(" ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario/OK_2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/horario/Atras.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel3)
                                        .addGap(72, 72, 72)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
//System.out.println("LUNES");
        if (l % 2 == 0) {
            jComboBox1.setVisible(true);
            jComboBox7.setVisible(true);
            l = 1;
        } else {
            jComboBox1.hide();
            jComboBox7.hide();
            l = 0;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
//System.out.println("KARTES");
        if (k % 2 == 0) {
            jComboBox2.setVisible(true);
            jComboBox8.setVisible(true);
            k = 1;
        } else {
            jComboBox2.hide();
            jComboBox8.hide();
            k = 0;
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
//System.out.println("MIERCOLES");
        if (m % 2 == 0) {
            jComboBox3.setVisible(true);
            jComboBox9.setVisible(true);
            m = 1;
        } else {
            jComboBox3.hide();
            jComboBox9.hide();
            m = 0;
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
//System.out.println("JUEVES");
        if (j % 2 == 0) {
            jComboBox4.setVisible(true);
            jComboBox10.setVisible(true);
            j = 1;
        } else {
            jComboBox4.hide();
            jComboBox10.hide();
            j = 0;
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        //System.out.println("VIERNES");
        if (v % 2 == 0) {
            jComboBox5.setVisible(true);
            jComboBox11.setVisible(true);
            v = 1;
        } else {
            jComboBox5.hide();
            jComboBox11.hide();
            v = 0;
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        //System.out.println("SABADO");
        if (s % 2 == 0) {
            jComboBox6.setVisible(true);
            jComboBox12.setVisible(true);
            s = 1;
        } else {
            jComboBox6.hide();
            jComboBox12.hide();
            s = 0;
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//System.out.println(jComboBox1.getSelectedItem().toString());
        jComboBox7.setModel(model1(jComboBox1.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox8.setModel(model1(jComboBox2.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        jComboBox9.setModel(model1(jComboBox3.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        jComboBox10.setModel(model1(jComboBox4.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        jComboBox11.setModel(model1(jComboBox5.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        jComboBox12.setModel(model1(jComboBox6.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed

    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged

        if (textField1.getText().length() == 10) {
            texto = textField1.getText();
        }
        if (textField1.getText().length() > 10) {
            textField1.setText(texto);
        }
    }//GEN-LAST:event_textField1TextValueChanged

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        SUpermatriz.curprof[SUpermatriz.s1][SUpermatriz.s2] = textField1.getText();

        tomatrix();

        SUpermatriz.s2++;
        setVisible(false);
        SUpermatriz.completarSM();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (SUpermatriz.s2 == 0 && SUpermatriz.s1 != 0) {
            SUpermatriz.s1--;
            SUpermatriz.s2 = OPtion.infocursos[SUpermatriz.s1][2].split(",").length - 1;
        } else {
            SUpermatriz.s2--;
        }
        //System.out.println("LAS S-1 " + SUpermatriz.s1 + " " + SUpermatriz.s2);
        tomatrixnull();

        setVisible(false);
        SUpermatriz.completarSM();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CUrsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUrsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUrsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUrsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUrsos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

    public void xxx() {
        jComboBox1.hide();
        jComboBox2.hide();
        jComboBox3.hide();
        jComboBox4.hide();
        jComboBox5.hide();
        jComboBox6.hide();
        jComboBox7.hide();
        jComboBox8.hide();
        jComboBox9.hide();
        jComboBox10.hide();
        jComboBox11.hide();
        jComboBox12.hide();
    }

    public ComboBoxModel model1(String entrada) {
        int m = 0;
        for (int c = 0; c < 15; c++) {
            if (entrada == model1[c]) {
                m = c;
                c = 15;
            }
        }
        String newmodel[] = new String[15 - m];

        for (int g = 14; g - m >= 0; g--) {
            newmodel[g - m] = model2[g];
            //System.out.println(model2[g]);
        }

        ComboBoxModel cbm = new javax.swing.DefaultComboBoxModel(newmodel);
        return cbm;
    }

    public String clavehora(String hora) {
        String clave = "";
        if (hora == "7:00" || hora == "7:50") {
            clave = "0";
        } else if (hora == "8:00" || hora == "8:50") {
            clave = "1";
        } else if (hora == "9:00" || hora == "9:50") {
            clave = "2";
        } else if (hora == "10:00" || hora == "10:50") {
            clave = "3";
        } else if (hora == "11:00" || hora == "11:50") {
            clave = "4";
        } else if (hora == "12:00" || hora == "12:50") {
            clave = "5";
        } else if (hora == "13:00" || hora == "13:50") {
            clave = "6";
        } else if (hora == "14:00" || hora == "14:50") {
            clave = "7";
        } else if (hora == "15:00" || hora == "15:50") {
            clave = "8";
        } else if (hora == "16:00" || hora == "16:50") {
            clave = "9";
        } else if (hora == "17:00" || hora == "17:50") {
            clave = "10";
        } else if (hora == "18:00" || hora == "18:50") {
            clave = "11";
        } else if (hora == "19:00" || hora == "19:50") {
            clave = "12";
        } else if (hora == "20:00" || hora == "20:50") {
            clave = "13";
        } else if (hora == "21:00" || hora == "21:50") {
            clave = "14";
        }
        return clave;
    }

    private void tomatrix() {
        //System.out.println("\n" + "-La supermatriz se completa para las posiciones " + SUpermatriz.s1 + " " + SUpermatriz.s2);

        if (l == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][0][0] = clavehora(jComboBox1.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][0][1] = clavehora(jComboBox7.getSelectedItem().toString());
        }
        if (k == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][1][0] = clavehora(jComboBox2.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][1][1] = clavehora(jComboBox8.getSelectedItem().toString());
        }
        if (m == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][2][0] = clavehora(jComboBox3.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][2][1] = clavehora(jComboBox9.getSelectedItem().toString());
        }
        if (j == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][3][0] = clavehora(jComboBox4.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][3][1] = clavehora(jComboBox10.getSelectedItem().toString());
        }
        if (v == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][4][0] = clavehora(jComboBox5.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][4][1] = clavehora(jComboBox11.getSelectedItem().toString());
        }
        if (s == 1) {
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][5][0] = clavehora(jComboBox6.getSelectedItem().toString());
            HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][5][1] = clavehora(jComboBox12.getSelectedItem().toString());
        }
    }

    // Imprimir la SUpermatriz y observar los datos de las horas
    public void impresion() {
        for (int a = 0; a < OPtion.cursos; a++) {
            //System.out.println(OPtion.infocursos[a][0]);

            for (int z = 0; z < OPtion.infocursos[a][2].split(",").length; z++) {
                //System.out.print("  " + SUpermatriz.curgroup[a][z] + " ");

                for (int y = 0; y < 6; y++) {
                    //System.out.print(semana(y) + "-" + HOrario.supermatriz[a][z][y][0] + "-" + HOrario.supermatriz[a][z][y][1] + "  ");
                }
                //System.out.println("");
            }

        }

    }

    public String semana(int a) {
        String dia = "";
        if (a == 0) {
            dia = "L";
        }
        if (a == 1) {
            dia = "K";
        }
        if (a == 2) {
            dia = "M";
        }
        if (a == 3) {
            dia = "J";
        }
        if (a == 4) {
            dia = "V";
        }
        if (a == 5) {
            dia = "S";
        }

        return dia;
    }

    public void tomatrixnull() {

        for (int g = 0; g < 6; g++) {
            for (int q = 0; q < 2; q++) {
                HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][g][q] = null;
                HOrario.supermatriz[SUpermatriz.s1][SUpermatriz.s2][g][q] = null;
            }
        }

    }

}
