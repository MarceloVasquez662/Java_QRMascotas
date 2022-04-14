package Vista;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qrmascota.conexion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Marcelo
 */
public class Listado extends javax.swing.JFrame {

    /**
     * Creates new form Listado
     */
    int xMouse, yMouse;
    
    public Listado() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            conexion x = new conexion();
            Connection cn = x.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs;
            
            rs = st.executeQuery("select nombre, nombreDueno,tipo,raza,ultimaUbicacion from mydb.MASCOTA where perdido=TRUE");
            
            DefaultTableModel modeloTabla = (DefaultTableModel) table_mascotasPerdidas.getModel();
            Object filas[] = new Object[5];
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(filas);
            }
            table_mascotasPerdidas.setModel(modeloTabla);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panel_cerrar = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JLabel();
        panel_inicio = new javax.swing.JPanel();
        btn_inicio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_mascotasPerdidas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
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
            .addGroup(panel_cerrarLayout.createSequentialGroup()
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_cerrarLayout.setVerticalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cerrarLayout.createSequentialGroup()
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        panel_inicio.setBackground(new java.awt.Color(0, 102, 0));
        panel_inicio.setForeground(new java.awt.Color(255, 255, 255));

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
            .addGroup(panel_inicioLayout.createSequentialGroup()
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

        jLabel3.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Mascotas perdidas");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 230));

        jPanel3.setBackground(new java.awt.Color(255, 185, 196));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Encontre mi mascota");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Te mostramos las mascotas que continuan perdidas");

        table_mascotasPerdidas.setForeground(new java.awt.Color(51, 51, 51));
        table_mascotasPerdidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dueño", "Tipo", "Raza", "Ultima ubicación conocida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_mascotasPerdidas.setEnabled(false);
        table_mascotasPerdidas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(table_mascotasPerdidas);
        if (table_mascotasPerdidas.getColumnModel().getColumnCount() > 0) {
            table_mascotasPerdidas.getColumnModel().getColumn(0).setResizable(false);
            table_mascotasPerdidas.getColumnModel().getColumn(1).setResizable(false);
            table_mascotasPerdidas.getColumnModel().getColumn(2).setResizable(false);
            table_mascotasPerdidas.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 800, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 140, 0));
    }//GEN-LAST:event_btn_inicioMouseEntered
    
    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btn_inicioMouseExited
    
    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_btn_cerrarMouseEntered
    
    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        // TODO add your handling code here:
        panel_cerrar.setBackground(new Color(153, 0, 0));
    }//GEN-LAST:event_btn_cerrarMouseExited
    
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged
    
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Encontrada x = new Encontrada();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JTable table_mascotasPerdidas;
    // End of variables declaration//GEN-END:variables
}
