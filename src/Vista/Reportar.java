/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import qrmascota.conexion;

/**
 *
 * @author Marcelo
 */
public class Reportar extends javax.swing.JFrame {

    /**
     * Creates new form Reportar
     */
    int xMouse, yMouse;
    
    public Reportar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Reporta tu máscota");
        
        combo_mascotas.setVisible(false);
        
        panel_reportar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        panel_cerrar = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JLabel();
        panel_inicio = new javax.swing.JPanel();
        btn_inicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        combo_mascotas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JLabel();
        panel_reportar = new javax.swing.JPanel();
        btn_reportar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_cerrar.setBackground(new java.awt.Color(153, 0, 0));
        panel_cerrar.setForeground(new java.awt.Color(255, 255, 255));

        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setText("X");
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_cerrarLayout = new javax.swing.GroupLayout(panel_cerrar);
        panel_cerrar.setLayout(panel_cerrarLayout);
        panel_cerrarLayout.setHorizontalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panel_cerrarLayout.setVerticalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cerrarLayout.createSequentialGroup()
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        panel_inicio.setBackground(new java.awt.Color(0, 102, 0));
        panel_inicio.setForeground(new java.awt.Color(51, 102, 0));

        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_inicio.setText("<");
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(panel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reportar");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresa tu RUT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 30));

        txt_rut.setBorder(null);
        txt_rut.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });
        jPanel1.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 170, 30));

        jPanel1.add(combo_mascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 170, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><div style=\"text-align:center\"><span>Sentimos que tú <br> máscota esté <br> pérdida :(</span></div></html>");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        panel_buscar.setBackground(new java.awt.Color(0, 102, 0));

        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buscar.setText("Buscar");
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel1.add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 170, 34));

        panel_reportar.setBackground(new java.awt.Color(204, 204, 0));

        btn_reportar.setBackground(new java.awt.Color(204, 204, 0));
        btn_reportar.setForeground(new java.awt.Color(0, 0, 0));
        btn_reportar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_reportar.setText("Reportar");
        btn_reportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_reportarLayout = new javax.swing.GroupLayout(panel_reportar);
        panel_reportar.setLayout(panel_reportarLayout);
        panel_reportarLayout.setHorizontalGroup(
            panel_reportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(panel_reportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_reportarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_reportar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_reportarLayout.setVerticalGroup(
            panel_reportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(panel_reportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_reportarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_reportar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(panel_reportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportar.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 400, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
        // TODO add your handling code here:
        if (txt_rut.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_rutKeyTyped
    
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed
    
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged
    
    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked
    
    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
        // TODO add your handling code here:
        Inicio x = new Inicio();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inicioMouseClicked
    
    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_btn_cerrarMouseEntered
    
    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 140, 0));
    }//GEN-LAST:event_btn_inicioMouseEntered
    
    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        // TODO add your handling code here:
        panel_cerrar.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_btn_cerrarMouseExited
    
    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btn_inicioMouseExited
    
    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        // TODO add your handling code here:
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(txt_rut.getText());
        if (matcher.matches() == false) {
            JOptionPane.showMessageDialog(null, "Rut invalido (Formato: 11111111-1)", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String[] stringRut = txt_rut.getText().split("-");
            String rut = stringRut[0];
            String verificador = stringRut[1].toLowerCase();
            
            Integer M = 0, S = 1, T = Integer.parseInt(rut);
            for (; T != 0; T = (int) Math.floor(T /= 10)) {
                S = (S + T % 10 * (9 - M++ % 6)) % 11;
            }
            
            String verificadorBueno;
            if (S > 0) {
                verificadorBueno = String.valueOf(S - 1);
            } else {
                verificadorBueno = "k";
            }
            
            if (!verificador.equals(verificadorBueno)) {
                JOptionPane.showMessageDialog(null, "El digito verificador del RUT es inválido", "Error", JOptionPane.WARNING_MESSAGE);
                
            } else {
                try {
                    combo_mascotas.setVisible(false);
                    panel_reportar.setVisible(false);
                    conexion x = new conexion();
                    Connection cn = x.getConnection();
                    Statement st = cn.createStatement();
                    ResultSet rs;
                    rs = st.executeQuery("select idMASCOTA,nombre from mydb.MASCOTA where rutDueno='" + txt_rut.getText() + "' and perdido=FALSE");
                    
                    combo_mascotas.removeAllItems();
                    
                    if (rs.next()) {
                        combo_mascotas.setVisible(true);
                        panel_reportar.setVisible(true);
                        btn_reportar.setVisible(true);
                        
                        combo_mascotas.addItem("Seleccione una máscota");
                        rs.beforeFirst();
                        while (rs.next()) {
                            combo_mascotas.addItem(rs.getString(1) + "-" + rs.getString(2));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El RUT ingresado no presenta mascotas perdidas en el sistema", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_buscarMouseClicked
    
    private void btn_reportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportarMouseClicked
        // TODO add your handling code here:
        if (combo_mascotas.getSelectedItem().equals("Seleccione una máscota")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una máscota", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String[] mascota = combo_mascotas.getSelectedItem().toString().split("-");
            int idMascota = Integer.parseInt(mascota[0]);
            try {
                conexion x = new conexion();
                Connection cn = x.getConnection();
                Statement st = cn.createStatement();
                int i = st.executeUpdate("update mydb.MASCOTA set perdido=TRUE where idMASCOTA=" + idMascota + "");
                JOptionPane.showMessageDialog(null, "Lamentamos tu pérdida :( tu mascota esta en la lista de máscotas perdidas", ":(", JOptionPane.INFORMATION_MESSAGE);
                combo_mascotas.setVisible(false);
                panel_reportar.setVisible(false);
                txt_rut.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_reportarMouseClicked

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
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_inicio;
    private javax.swing.JLabel btn_reportar;
    private javax.swing.JComboBox<String> combo_mascotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_reportar;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
}