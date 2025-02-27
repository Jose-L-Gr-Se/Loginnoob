
package com.login;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        NameEmpresa = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        CityBG = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelSalida = new javax.swing.JPanel();
        XSalida = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        UsuarioTitulo = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JTextField();
        SeparadorUsuario = new javax.swing.JSeparator();
        TítuloContraseña = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        SeparadorContraseña = new javax.swing.JSeparator();
        PanelInicioSesión = new javax.swing.JPanel();
        BotónEntrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameEmpresa.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        NameEmpresa.setForeground(java.awt.Color.white);
        NameEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameEmpresa.setText("NOMBRE DE LA EMPRESA");
        PanelFondo.add(NameEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 300, -1));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        PanelFondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 140, 290, -1));

        CityBG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CityBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        PanelFondo.add(CityBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        PanelSalida.setBackground(new java.awt.Color(255, 255, 255));
        PanelSalida.setToolTipText("");
        PanelSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSalidaMouseExited(evt);
            }
        });

        XSalida.setBackground(new java.awt.Color(255, 255, 255));
        XSalida.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        XSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XSalida.setText("X");
        XSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XSalidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelSalidaLayout = new javax.swing.GroupLayout(PanelSalida);
        PanelSalida.setLayout(PanelSalidaLayout);
        PanelSalidaLayout.setHorizontalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSalidaLayout.createSequentialGroup()
                    .addComponent(XSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelSalidaLayout.setVerticalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSalidaLayout.createSequentialGroup()
                    .addComponent(XSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 751, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        PanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        LOGO.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        LOGO.setText("LOGO");
        PanelFondo.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        IniciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        IniciarSesion.setText("INICIAR SESIÓN");
        PanelFondo.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        UsuarioTitulo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        UsuarioTitulo.setText("USUARIO");
        UsuarioTitulo.setToolTipText("");
        PanelFondo.add(UsuarioTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        TextoUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TextoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TextoUsuario.setText("Ingrese su nombre de usuario");
        TextoUsuario.setBorder(null);
        TextoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextoUsuarioMousePressed(evt);
            }
        });
        PanelFondo.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 400, -1));

        SeparadorUsuario.setForeground(java.awt.Color.black);
        PanelFondo.add(SeparadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 400, -1));

        TítuloContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        TítuloContraseña.setText("CONTRASEÑA");
        TítuloContraseña.setToolTipText("");
        PanelFondo.add(TítuloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("*****");
        jPasswordField1.setToolTipText("Ingresa tu contraseña");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        PanelFondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 400, -1));

        SeparadorContraseña.setForeground(java.awt.Color.black);
        PanelFondo.add(SeparadorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, -1));

        PanelInicioSesión.setBackground(new java.awt.Color(0, 134, 190));

        BotónEntrar.setBackground(new java.awt.Color(0, 134, 190));
        BotónEntrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        BotónEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BotónEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotónEntrar.setText("ENTRAR");
        BotónEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónEntrar.setOpaque(true);
        BotónEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotónEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelInicioSesiónLayout = new javax.swing.GroupLayout(PanelInicioSesión);
        PanelInicioSesión.setLayout(PanelInicioSesiónLayout);
        PanelInicioSesiónLayout.setHorizontalGroup(
            PanelInicioSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(PanelInicioSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelInicioSesiónLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BotónEntrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelInicioSesiónLayout.setVerticalGroup(
            PanelInicioSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(PanelInicioSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelInicioSesiónLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BotónEntrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PanelFondo.add(PanelInicioSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoUsuarioMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void XSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XSalidaMouseClicked

    private void XSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalidaMouseEntered
        PanelSalida.setBackground(Color.red);
    }//GEN-LAST:event_XSalidaMouseEntered

    private void PanelSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSalidaMouseExited
        
    }//GEN-LAST:event_PanelSalidaMouseExited

    private void XSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalidaMouseExited
        PanelSalida.setBackground(Color.white);
    }//GEN-LAST:event_XSalidaMouseExited

    private void TextoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoUsuarioMousePressed
        if (TextoUsuario.getText().equals("Ingrese su nombre de usuario")){
        TextoUsuario.setText("");
        TextoUsuario.setForeground(Color.black);}
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()){
        jPasswordField1.setText("*****");
        jPasswordField1.setForeground(Color.gray);}
    }//GEN-LAST:event_TextoUsuarioMousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        if (TextoUsuario.getText().isEmpty()){
        TextoUsuario.setText("Ingrese su nombre de usuario");
        TextoUsuario.setForeground(Color.gray);}
        if (String.valueOf(jPasswordField1.getPassword()).equals("*****")){
        jPasswordField1.setText("");
        
        jPasswordField1.setForeground(Color.black);}
    
    }//GEN-LAST:event_jPasswordField1MousePressed

    private void BotónEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónEntrarMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento fallido de login con los datos:\nUsuario: " + TextoUsuario.getText() + "\nContraseña: " + String.valueOf(jPasswordField1.getPassword()), "LOGIN" , javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotónEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotónEntrar;
    private javax.swing.JLabel CityBG;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NameEmpresa;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelInicioSesión;
    private javax.swing.JPanel PanelSalida;
    private javax.swing.JSeparator SeparadorContraseña;
    private javax.swing.JSeparator SeparadorUsuario;
    private javax.swing.JTextField TextoUsuario;
    private javax.swing.JLabel TítuloContraseña;
    private javax.swing.JLabel UsuarioTitulo;
    private javax.swing.JLabel XSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
