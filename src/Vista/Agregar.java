/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Vista.Inicio;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import qrmascota.conexion;

/**
 *
 * @author Marcelo
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    int xMouse, yMouse;

    public Agregar() {
        initComponents();
        this.setTitle("Agregar Mascota");
        this.setLocationRelativeTo(null);

        date_nacimiento.getDateEditor().setEnabled(false);
        Date now = new Date(System.currentTimeMillis());
        this.date_nacimiento.setMaxSelectableDate(now);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        combo_raza = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombreMascota = new javax.swing.JTextField();
        date_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dueno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        panel_agregar = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JLabel();
        panel_limpiar = new javax.swing.JPanel();
        btn_limpiar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panel_cerrar = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JLabel();
        panel_inicio = new javax.swing.JPanel();
        btn_inicio = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.jpg"))); // NOI18N
        jLabel1.setText("btn_inicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 570));

        jPanel2.setBackground(new java.awt.Color(190, 210, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo de Mascota");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 33, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Raza Mascota");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Gato", "Perro", "Conejo" }));
        combo_tipo.setBorder(null);
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 26, 190, 34));

        combo_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una raza" }));
        combo_raza.setBorder(null);
        jPanel2.add(combo_raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 78, 190, 34));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Color");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 183, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha Nac.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 244, -1, -1));

        txt_nombreMascota.setBorder(null);
        txt_nombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreMascotaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 130, 190, 34));
        jPanel2.add(date_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 232, 190, 34));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre dueño");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 285, -1, -1));

        txt_rut.setBorder(null);
        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });
        jPanel2.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 331, 190, 34));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dirección");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 390, -1, -1));

        txt_dueno.setBorder(null);
        txt_dueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duenoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_dueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 278, 190, 34));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rut Dueño");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 338, -1, -1));

        txt_telefono.setBorder(null);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 435, 190, 34));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teléfono");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 442, -1, -1));

        txt_direccion.setBorder(null);
        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_direccionKeyTyped(evt);
            }
        });
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 383, 190, 34));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre Mascota");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, -1, -1));

        txt_color.setBorder(null);
        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_colorKeyTyped(evt);
            }
        });
        jPanel2.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 176, 190, 34));

        panel_agregar.setBackground(new java.awt.Color(0, 102, 0));

        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar.setText("Agregar");
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_agregarLayout = new javax.swing.GroupLayout(panel_agregar);
        panel_agregar.setLayout(panel_agregarLayout);
        panel_agregarLayout.setHorizontalGroup(
            panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_agregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_agregarLayout.setVerticalGroup(
            panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(panel_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_agregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(panel_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        panel_limpiar.setBackground(new java.awt.Color(153, 0, 0));

        btn_limpiar.setBackground(new java.awt.Color(153, 0, 0));
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_limpiarLayout = new javax.swing.GroupLayout(panel_limpiar);
        panel_limpiar.setLayout(panel_limpiarLayout);
        panel_limpiarLayout.setHorizontalGroup(
            panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_limpiarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_limpiarLayout.setVerticalGroup(
            panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_limpiarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(panel_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, 34));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 420, 570));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_cerrar.setBackground(new java.awt.Color(153, 0, 0));

        btn_cerrar.setBackground(new java.awt.Color(204, 0, 0));
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
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_cerrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_cerrarLayout.setVerticalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_cerrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        panel_inicio.setBackground(new java.awt.Color(0, 102, 0));

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
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(panel_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agrega tu Máscota");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
        if (combo_tipo.getSelectedItem().equals("Perro")) {
            combo_raza.removeAllItems();
            combo_raza.addItem("Seleccione una raza");
            combo_raza.addItem("Labrador");
            combo_raza.addItem("Husky");
            combo_raza.addItem("Golden");
            combo_raza.addItem("Caniche");
            combo_raza.addItem("Pastor Alemán");
            combo_raza.addItem("Dalmata");
            combo_raza.addItem("Boxer");
            combo_raza.addItem("Chihuahua");
            combo_raza.addItem("Bulldog");
            combo_raza.addItem("Beagle");
            combo_raza.addItem("Yorkshire");
            combo_raza.addItem("Otro");
        } else {
            if (combo_tipo.getSelectedItem().equals("Gato")) {
                combo_raza.removeAllItems();
                combo_raza.addItem("Seleccione una raza");
                combo_raza.addItem("Persa");
                combo_raza.addItem("Azul Ruso");
                combo_raza.addItem("Siamés");
                combo_raza.addItem("Angora");
                combo_raza.addItem("Siberiano");
                combo_raza.addItem("Maine Coon");
                combo_raza.addItem("Bengalí");
                combo_raza.addItem("Otro");
            } else {
                if (combo_tipo.getSelectedItem().equals("Conejo")) {
                    combo_raza.removeAllItems();
                    combo_raza.addItem("Seleccione una raza");
                    combo_raza.addItem("Blanco de Hotot");
                    combo_raza.addItem("Rex");
                    combo_raza.addItem("Cabeza de León");
                    combo_raza.addItem("Belier");
                    combo_raza.addItem("Angora");
                    combo_raza.addItem("Toy");
                    combo_raza.addItem("Gigante");
                    combo_raza.addItem("Tan");
                    combo_raza.addItem("Otro");
                } else {
                    combo_raza.removeAllItems();
                    combo_raza.addItem("Seleccione una raza");
                }
            }
        }
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void txt_nombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreMascotaKeyTyped
        // TODO add your handling code here:
        if (txt_nombreMascota.getText().length() >= 45) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreMascotaKeyTyped

    private void txt_duenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duenoKeyTyped
        // TODO add your handling code here:
        if (txt_dueno.getText().length() >= 45) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_duenoKeyTyped

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
        // TODO add your handling code here:
        if (txt_rut.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_rutKeyTyped

    private void txt_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyTyped
        // TODO add your handling code here:
        if (txt_direccion.getText().length() >= 45) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_direccionKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        // TODO add your handling code here:
        if (txt_telefono.getText().length() >= 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colorKeyTyped
        // TODO add your handling code here:
        if (txt_color.getText().length() >= 45) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_colorKeyTyped

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        // TODO add your handling code here:
        panel_cerrar.setBackground(new Color(153, 0, 0));
    }//GEN-LAST:event_btn_cerrarMouseExited

    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio x = new Inicio();
        x.setVisible(true);
    }//GEN-LAST:event_btn_inicioMouseClicked

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 140, 0));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        // TODO add your handling code here:
        panel_inicio.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        // TODO add your handling code here:
        if (combo_raza.getSelectedItem().equals("Seleccione una raza") || combo_tipo.getSelectedItem().equals("Seleccione un tipo")) {
            JOptionPane.showMessageDialog(null, "Ingrese raza o tipo", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txt_nombreMascota.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese nombre de su mascota", "Error", JOptionPane.WARNING_MESSAGE);
            } else {

                if (txt_color.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese color de su mascota", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (date_nacimiento.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Ingrese una fecha", "Error", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (txt_dueno.getText().trim().equals("")) {
                            JOptionPane.showMessageDialog(null, "Ingrese nombre del dueño", "Error", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (txt_rut.getText().trim().equals("")) {
                                JOptionPane.showMessageDialog(null, "Ingrese rut del dueño", "Error", JOptionPane.WARNING_MESSAGE);
                            } else {
                                if (txt_rut.getText().length() < 9 || txt_rut.getText().length() > 10) {
                                    JOptionPane.showMessageDialog(null, "El rut debe tener entre 9 y 10 caracteres", "Error", JOptionPane.WARNING_MESSAGE);
                                } else {

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
                                            if (txt_direccion.getText().trim().equals("")) {
                                                JOptionPane.showMessageDialog(null, "Ingrese una dirección", "Error", JOptionPane.WARNING_MESSAGE);
                                            } else {
                                                if (txt_telefono.getText().length() != 9) {
                                                    JOptionPane.showMessageDialog(null, "El teléfono debe tener una longitud de 9 caracteres numéricos", "Error", JOptionPane.WARNING_MESSAGE);
                                                } else {
                                                    try {
                                                        int telefono = Integer.parseInt(txt_telefono.getText());

                                                        conexion x = new conexion();
                                                        Connection cn = x.getConnection();
                                                        try {
                                                            Statement st = cn.createStatement();
                                                            int i;
                                                            int dia, mes, anio;
                                                            dia = date_nacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
                                                            mes = date_nacimiento.getCalendar().get(Calendar.MONTH) + 1;
                                                            anio = date_nacimiento.getCalendar().get(Calendar.YEAR);

                                                            ResultSet rs = st.executeQuery("select * from mydb.MASCOTA where rutDueno='" + txt_rut.getText() + "'");
                                                            int mascotasenBD = 0;
                                                            while (rs.next()) {
                                                                mascotasenBD++;
                                                            }
                                                            if (mascotasenBD >= 3) {
                                                                JOptionPane.showMessageDialog(null, "El RUT ingresado supera el máximo de máscotas permitidas", "SQL!", JOptionPane.ERROR_MESSAGE);
                                                            } else {
                                                                String fecha = (anio + "-" + mes + "-" + dia);
                                                                i = st.executeUpdate("insert into mydb.MASCOTA(nombre,tipo,raza,color,fechaNacimiento,nombreDueno,rutDueno,direccion,telefono,perdido) values('" + txt_nombreMascota.getText() + "','" + combo_tipo.getSelectedItem() + "','" + combo_raza.getSelectedItem() + "','" + txt_nombreMascota.getText() + "','" + fecha + "','" + txt_dueno.getText() + "','" + txt_rut.getText()
                                                                        + "','" + txt_direccion.getText()
                                                                        + "'," + telefono
                                                                        + ",FALSE)"
                                                                );

                                                                if (i != 0) {
                                                                    limpiar();
                                                                    JOptionPane.showMessageDialog(null, "Agregado", "SQL!", JOptionPane.INFORMATION_MESSAGE);
                                                                }
                                                            }
                                                        } catch (SQLException ex) {
                                                            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                                                            System.out.println(ex.getMessage());
                                                        }
                                                    } catch (NumberFormatException ex) {
                                                        JOptionPane.showMessageDialog(null, "El numero de teléfono no es válido", "Error", JOptionPane.WARNING_MESSAGE);
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarMouseClicked

    void limpiar() {
        txt_nombreMascota.setText("");
        txt_color.setText("");
        txt_dueno.setText("");
        txt_rut.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        date_nacimiento.setCalendar(null);
        combo_tipo.setSelectedIndex(0);
        txt_nombreMascota.requestFocus();
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
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_agregar;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_inicio;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JComboBox<String> combo_raza;
    private javax.swing.JComboBox<String> combo_tipo;
    private com.toedter.calendar.JDateChooser date_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel_agregar;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_limpiar;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dueno;
    private javax.swing.JTextField txt_nombreMascota;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
