/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.villae_saquicelaj;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIANTE
 */
public class Hilo extends javax.swing.JFrame {

    String imgs[] = {"7.jpg", "casa.jpg", "limon.png", "sandia.png"};
    Icon imgsIco[] = new Icon[4];
    HiloC1 hc1;// = new HiloC1(0);
    HiloC2 hc2; // = new HiloC2(0);
    HiloC3 hc3; // = new HiloC3(0);
    HiloTodo hcT; // = new HiloTodo(0);        

    JLabel col1A;
    JLabel col1B;
    JLabel col1C;
    JLabel col1D;

    JLabel col2A;
    JLabel col2B;
    JLabel col2C;
    JLabel col2D;

    JLabel col3A;
    JLabel col3B;
    JLabel col3C;
    JLabel col3D;

    public Hilo() {
        initComponents();
        PropiedadesTabla();
        this.setLocationRelativeTo(null);
        this.btnPa1.setEnabled(false);
        this.btnPa2.setEnabled(false);
        this.btnPa3.setEnabled(false);
        this.btnPaTodo.setEnabled(false);

    }

    public void ganarTodo() {
        if (hc1 == null | hc2 == null | hc3 == null) {
            JOptionPane.showMessageDialog(null, "GANASTE!");
            reiniciarIMG();
            reiniciarBT();
            reiniciarHilos();
            borrartxt();

            return;
        }
        if ((hc1.p == hc2.p) & (hc2.p == hc3.p)) {
            JOptionPane.showMessageDialog(null, "GANASTE!");
            reiniciarIMG();
            reiniciarBT();
            reiniciarHilos();
            borrartxt();

        } else {
            JOptionPane.showMessageDialog(null, "Mejor suerte para la próxima!");
            reiniciarIMG();
            reiniciarBT();
            reiniciarHilos();
            this.txtTiempoTodo.setText("");
        }
    }

    public void reiniciarIMG() {
        actualizarC1(col3A, col3B, col3C, col3D, 0);
        actualizarC1(col2A, col2B, col2C, col2D, 0);
        actualizarC1(col1A, col1B, col1C, col1D, 0);
    }

    public void reiniciarHilos() {
        this.hc1 = null;
        this.hc2 = null;
        this.hc3 = null;
        this.hcT = null;
    }

    public void reiniciarBT() {
        this.btnIn1.setEnabled(true);
        this.btnIn2.setEnabled(true);
        this.btnIn3.setEnabled(true);
        this.btnInTodo.setEnabled(true);

        this.btnPa1.setEnabled(false);
        this.btnPa2.setEnabled(false);
        this.btnPa3.setEnabled(false);
        this.btnPaTodo.setEnabled(false);
    }

    public void ganar() {
        if (hc1 == null | hc2 == null | hc3 == null) {
            return;
        }
        if ((hc1.isGirar() == false) & (hc2.isGirar() == false) & (hc3.isGirar() == false)) {
            if ((hc1.p == hc2.p) & (hc2.p == hc3.p)) {
                JOptionPane.showMessageDialog(null, "GANASTE!");
                reiniciarHilos();
                reiniciarIMG();
                reiniciarBT();
                borrartxt();

            } else {
                JOptionPane.showMessageDialog(null, "Mejor suerte para la próxima!");
                reiniciarHilos();
                reiniciarIMG();
                reiniciarBT();
                this.txtTiempoTodo.setText("");

            }
        }
    }

    public void borrartxt() {
        this.txtCol1.setText("");
        this.txtCol2.setText("");
        this.txtCol3.setText("");
        this.txtTiempoTodo.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCol1 = new javax.swing.JTextField();
        txtCol2 = new javax.swing.JTextField();
        txtCol3 = new javax.swing.JTextField();
        btnIn1 = new javax.swing.JButton();
        btnIn2 = new javax.swing.JButton();
        btnIn3 = new javax.swing.JButton();
        btnPa1 = new javax.swing.JButton();
        btnPa2 = new javax.swing.JButton();
        btnPa3 = new javax.swing.JButton();
        btnPaTodo = new javax.swing.JButton();
        btnInTodo = new javax.swing.JButton();
        txtTiempoTodo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TIEMPOS");

        txtCol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCol1ActionPerformed(evt);
            }
        });

        btnIn1.setText("INICIAR");
        btnIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIn1ActionPerformed(evt);
            }
        });

        btnIn2.setText("INICIAR");
        btnIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIn2ActionPerformed(evt);
            }
        });

        btnIn3.setText("INICIAR");
        btnIn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIn3ActionPerformed(evt);
            }
        });

        btnPa1.setText("PARAR");
        btnPa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPa1ActionPerformed(evt);
            }
        });

        btnPa2.setText("PARAR");
        btnPa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPa2ActionPerformed(evt);
            }
        });

        btnPa3.setText("PARAR");
        btnPa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPa3ActionPerformed(evt);
            }
        });

        btnPaTodo.setText("PARAR TODO");
        btnPaTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaTodoActionPerformed(evt);
            }
        });

        btnInTodo.setText("INICIAR TODO");
        btnInTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInTodoActionPerformed(evt);
            }
        });

        jLabel2.setText("TIEMPO PARA TODOS:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCol1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtCol3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTiempoTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIn2)
                            .addComponent(btnPa2)
                            .addComponent(btnInTodo))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPaTodo)
                            .addComponent(btnIn3)
                            .addComponent(btnPa3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIn1)
                    .addComponent(btnIn2)
                    .addComponent(btnIn3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPa1)
                    .addComponent(btnPa2)
                    .addComponent(btnPa3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaTodo)
                    .addComponent(btnInTodo)
                    .addComponent(txtTiempoTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaTodoActionPerformed
        if ("".equals(this.txtTiempoTodo.getText())) {
            hc1.setGirar(false);
            hc2.setGirar(false);
            hc3.setGirar(false);

            hc1.stop();
            hc2.stop();
            hc3.stop();
            ganar();
        } else {
            hcT.setGirar(false);
            hcT.stop();
            ganarTodo();
        }

        //JOptionPane.showMessageDialog(null, "GANASTE!");

    }//GEN-LAST:event_btnPaTodoActionPerformed

    private void btnIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIn1ActionPerformed
        int tiempo = Integer.valueOf(this.txtCol1.getText());
        hc1 = new HiloC1(tiempo);
        hc1.setGirar(true);

        hc1.start();

        activarDesacticarBT(this.btnPa1, this.btnIn1);
        this.btnInTodo.setEnabled(false);


    }//GEN-LAST:event_btnIn1ActionPerformed

    private void txtCol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCol1ActionPerformed

    private void btnPa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPa1ActionPerformed
        activarDesacticarBT(this.btnIn1, this.btnPa1);
        hc1.setGirar(false);
        this.btnIn1.setEnabled(true);

        hc1.stop();

        ganar();

    }//GEN-LAST:event_btnPa1ActionPerformed

    private void btnIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIn2ActionPerformed
        int tiempo = Integer.valueOf(this.txtCol2.getText());
        activarDesacticarBT(this.btnPa2, this.btnIn2);

        this.btnInTodo.setEnabled(false);
        hc2 = new HiloC2(tiempo);
        hc2.setGirar(true);
        hc2.start();

    }//GEN-LAST:event_btnIn2ActionPerformed

    private void btnPa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPa2ActionPerformed
        activarDesacticarBT(this.btnIn2, this.btnPa2);
        hc2.setGirar(false);
        this.btnIn2.setEnabled(true);
        hc2.stop();
        ganar();

    }//GEN-LAST:event_btnPa2ActionPerformed

    private void btnIn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIn3ActionPerformed
        int tiempo = Integer.valueOf(this.txtCol3.getText());
        activarDesacticarBT(this.btnPa3, this.btnIn3);
        this.btnInTodo.setEnabled(false);

        hc3 = new HiloC3(tiempo);
        hc3.setGirar(true);;
        hc3.start();

    }//GEN-LAST:event_btnIn3ActionPerformed

    private void btnPa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPa3ActionPerformed
        activarDesacticarBT(this.btnIn3, this.btnPa3);
        hc3.setGirar(false);
        hc3.stop();
        ganar();

    }//GEN-LAST:event_btnPa3ActionPerformed

    private void btnInTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInTodoActionPerformed
        if ("".equals(this.txtTiempoTodo.getText())) {
            int tHc1 = Integer.valueOf(this.txtCol1.getText());
            int tHc2 = Integer.valueOf(this.txtCol2.getText());
            int tHc3 = Integer.valueOf(this.txtCol3.getText());

            hc1 = new HiloC1(tHc1);
            hc2 = new HiloC2(tHc2);
            hc3 = new HiloC3(tHc3);

            hc1.setGirar(true);
            hc2.setGirar(true);
            hc3.setGirar(true);

            hc1.start();
            hc2.start();
            hc3.start();

            this.btnIn1.setEnabled(false);
            this.btnIn2.setEnabled(false);
            this.btnIn3.setEnabled(false);
            this.btnInTodo.setEnabled(false);

            this.btnPa1.setEnabled(true);
            this.btnPa2.setEnabled(true);
            this.btnPa3.setEnabled(true);
            this.btnPaTodo.setEnabled(true);
        } else {
            int tiempo = Integer.valueOf(this.txtTiempoTodo.getText());

            hcT = new HiloTodo(tiempo);
            hcT.start();
            this.btnIn1.setEnabled(false);
            this.btnIn2.setEnabled(false);
            this.btnIn3.setEnabled(false);
            this.btnInTodo.setEnabled(false);

            this.btnPa1.setEnabled(false);
            this.btnPa2.setEnabled(false);
            this.btnPa3.setEnabled(false);
            this.btnPaTodo.setEnabled(true);
        }


    }//GEN-LAST:event_btnInTodoActionPerformed
    public void activarDesacticarBT(JButton actBt, JButton desBt) {
        actBt.setEnabled(true);
        desBt.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hilo().setVisible(true);
            }
        });
    }

    private void PropiedadesTabla() {
        jTable1.setDefaultRenderer(Object.class, new ImgTabla());

        String titulos[] = {"Col 1", "Col 2", "Col 3"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        jTable1.setModel(tm);

        col1A = new JLabel();
        col1B = new JLabel();
        col1C = new JLabel();
        col1D = new JLabel();

        col2A = new JLabel();
        col2B = new JLabel();
        col2C = new JLabel();
        col2D = new JLabel();

        col3A = new JLabel();
        col3B = new JLabel();
        col3C = new JLabel();
        col3D = new JLabel();

        // IMG 7
        ImageIcon icono1 = new ImageIcon(imgs[0]);
        Icon img1 = new ImageIcon(icono1.getImage().getScaledInstance(38, 55, Image.SCALE_DEFAULT));

        //IMG CASA
        ImageIcon icono2 = new ImageIcon(imgs[1]);
        Icon img2 = new ImageIcon(icono2.getImage().getScaledInstance(58, 55, Image.SCALE_DEFAULT));

        //IMG LIMON
        ImageIcon icono3 = new ImageIcon(imgs[2]);
        Icon img3 = new ImageIcon(icono3.getImage().getScaledInstance(68, 55, Image.SCALE_DEFAULT));

        //IMG SANDIA
        ImageIcon icono4 = new ImageIcon(imgs[3]);
        Icon img4 = new ImageIcon(icono4.getImage().getScaledInstance(68, 55, Image.SCALE_DEFAULT));

        imgsIco[0] = img1; //7
        imgsIco[1] = img2; // casa
        imgsIco[2] = img3; // limon
        imgsIco[3] = img4; // sandia

        col1A.setIcon(imgsIco[0]);
        col2A.setIcon(imgsIco[0]);
        col3A.setIcon(imgsIco[0]);

        col1B.setIcon(imgsIco[2]);
        col2B.setIcon(imgsIco[2]);
        col3B.setIcon(imgsIco[2]);

        col1C.setIcon(imgsIco[3]);
        col2C.setIcon(imgsIco[3]);
        col3C.setIcon(imgsIco[3]);

        col1D.setIcon(imgsIco[1]);
        col2D.setIcon(imgsIco[1]);
        col3D.setIcon(imgsIco[1]);

        tm.addRow(new Object[]{col1A, col2A, col3A});
        tm.addRow(new Object[]{col1B, col2B, col3B});
        tm.addRow(new Object[]{col1C, col2C, col3C});
        tm.addRow(new Object[]{col1D, col2D, col3D});

        this.jTable1.setRowHeight(55);

    }
//--------------------------------------------------------------------------

    public class HiloC1 extends Thread {

        private int tiempo;
        private int p = 0; //posicion
        private boolean girar = false;

        public HiloC1(int tiempo) {
            this.tiempo = tiempo;
        }

        @Override
        public void run() {
            while (girar) {
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                // System.out.println("Tiempo: " + tiempo);
                actualizarC1(col1A, col1B, col1C, col1D, p);
                p++;
                if (p == 4) {
                    p = 0;
                }

            }
        }

        public void setGirar(boolean girar) {
            this.girar = girar;
        }

        public boolean isGirar() {
            return girar;
        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

    }

    //--------------------------------------------------------------------------
    public class HiloC2 extends Thread {

        private int tiempo;
        private int p = 0; //posicion
        private boolean girar = false;

        public HiloC2(int tiempo) {
            this.tiempo = tiempo;
        }

        @Override
        public void run() {
            while (girar) {
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                // System.out.println("Tiempo: " + tiempo);
                actualizarC1(col2A, col2B, col2C, col2D, p);
                p++;
                if (p == 4) {
                    p = 0;
                }

            }

        }

        public void setGirar(boolean girar) {
            this.girar = girar;
        }

        public boolean isGirar() {
            return girar;
        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

    }

    //--------------------------------------------------------------------------
    public class HiloC3 extends Thread {

        private int tiempo;
        private int p = 0; //posicion
        private boolean girar = false;

        public HiloC3(int tiempo) {
            this.tiempo = tiempo;
        }

        @Override
        public void run() {
            while (girar) {
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                // System.out.println("Tiempo: " + tiempo);
                actualizarC1(col3A, col3B, col3C, col3D, p);
                p++;
                if (p == 4) {
                    p = 0;
                }

            }

        }

        public void setGirar(boolean girar) {
            this.girar = girar;
        }

        public boolean isGirar() {
            return girar;
        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

    }
//---------------------------------------------------------------------------------

    public class HiloTodo extends Thread {

        private int tiempo;
        private int p = 0; //posicion
        private boolean girar = true;

        public HiloTodo(int tiempo) {
            this.tiempo = tiempo;
        }

        @Override
        public void run() {
            while (girar) {
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                // System.out.println("Tiempo: " + tiempo);
                actualizarC1(col3A, col3B, col3C, col3D, p);
                actualizarC1(col2A, col2B, col2C, col2D, p);
                actualizarC1(col1A, col1B, col1C, col1D, p);
                p++;
                if (p == 4) {
                    p = 0;
                }

            }

        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

        public boolean isGirar() {
            return girar;
        }

        public void setGirar(boolean girar) {
            this.girar = girar;
        }

    }
//---------------------------------------------------------------------------------

    public void actualizarC1(JLabel lbA, JLabel lbB, JLabel lbC, JLabel lbD, int p) {
        switch (p) {
            case 0:
                lbA.setIcon(imgsIco[p]);
                lbB.setIcon(imgsIco[p + 2]);
                lbC.setIcon(imgsIco[p + 3]);
                lbD.setIcon(imgsIco[p + 1]);
                break;
            case 1:
                lbA.setIcon(imgsIco[p]);
                lbB.setIcon(imgsIco[p - 1]);
                lbC.setIcon(imgsIco[p + 1]);
                lbD.setIcon(imgsIco[p + 2]);
                break;
            case 2:
                lbA.setIcon(imgsIco[p + 1]);
                lbB.setIcon(imgsIco[p - 1]);
                lbC.setIcon(imgsIco[p - 2]);
                lbD.setIcon(imgsIco[p]);
                break;
            case 3:
                lbA.setIcon(imgsIco[p - 1]);
                lbB.setIcon(imgsIco[p]);
                lbC.setIcon(imgsIco[p - 2]);
                lbD.setIcon(imgsIco[p - 3]);
                break;

        }
        this.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn1;
    private javax.swing.JButton btnIn2;
    private javax.swing.JButton btnIn3;
    private javax.swing.JButton btnInTodo;
    private javax.swing.JButton btnPa1;
    private javax.swing.JButton btnPa2;
    private javax.swing.JButton btnPa3;
    private javax.swing.JButton btnPaTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCol1;
    private javax.swing.JTextField txtCol2;
    private javax.swing.JTextField txtCol3;
    private javax.swing.JTextField txtTiempoTodo;
    // End of variables declaration//GEN-END:variables
}
