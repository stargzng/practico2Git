package Pantalla;

import java.util.Random;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {

    private int nroSecreto;
    private int ayudas = 2;
    private int intentos = 0;

    public Pantalla() {
        initComponents();
        
        Random random = new Random();
        nroSecreto = random.nextInt(900) + 100;
        System.out.println(nroSecreto); // sirve como control nada mas
        
        primerDigitoPass.setEchoChar('$');
        segundoDigitoPass.setEchoChar('$');
        tercerDigitoPass.setEchoChar('$');

        desarme();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nroSecretoTextField = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        entradaTextField = new javax.swing.JTextField();
        btnRevelar = new javax.swing.JButton();
        lbcodigo = new javax.swing.JLabel();
        PassjPanel = new javax.swing.JPanel();
        segundoDigitoPass = new javax.swing.JPasswordField();
        primerDigitoPass = new javax.swing.JPasswordField();
        tercerDigitoPass = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        nroSecretoTextField.setEditable(false);
        nroSecretoTextField.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nroSecretoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nroSecretoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroSecretoTextFieldActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adiviná");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        entradaTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        entradaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entradaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESE 3 NUMEROS!"));
        entradaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaTextFieldActionPerformed(evt);
            }
        });
        entradaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entradaTextFieldKeyTyped(evt);
            }
        });

        btnRevelar.setText("revelar");
        btnRevelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevelarActionPerformed(evt);
            }
        });

        lbcodigo.setText("CODIGO SECRETO");

        segundoDigitoPass.setEditable(false);
        segundoDigitoPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        segundoDigitoPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        primerDigitoPass.setEditable(false);
        primerDigitoPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        primerDigitoPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primerDigitoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerDigitoPassActionPerformed(evt);
            }
        });

        tercerDigitoPass.setEditable(false);
        tercerDigitoPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tercerDigitoPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tercerDigitoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tercerDigitoPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PassjPanelLayout = new javax.swing.GroupLayout(PassjPanel);
        PassjPanel.setLayout(PassjPanelLayout);
        PassjPanelLayout.setHorizontalGroup(
            PassjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primerDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segundoDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tercerDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PassjPanelLayout.setVerticalGroup(
            PassjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PassjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tercerDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PassjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(segundoDigitoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(entradaTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRevelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbcodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PassjPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(PassjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRevelar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lbcodigo))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbcodigo)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnRevelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(PassjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desarme() {

        String nro = String.valueOf(nroSecreto);

        primerDigitoPass.setText(""+ nro.charAt(0));
        segundoDigitoPass.setText(""+nro.charAt(1));
        tercerDigitoPass.setText(""+nro.charAt(2));
    }


    private void nroSecretoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroSecretoTextFieldActionPerformed
    }//GEN-LAST:event_nroSecretoTextFieldActionPerformed

    private void entradaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaTextFieldActionPerformed
        
        String nro = Integer.toString(nroSecreto);
        String entrada = entradaTextField.getText();
        
        //JOptionPane.showMessageDialog(null, "Mensaje de advertencia", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        
        if (entrada.length() != 3) {
            JOptionPane.showMessageDialog(this, "porfavor, ingrese 3 numeros");
            return;
        }
        
        if(!entradaTextField.getText().isEmpty()){
            
            if (entrada.charAt(0) == nro.charAt(0)) {
                primerDigitoPass.setEchoChar(nro.charAt(0));
            } 
            
            if (entrada.charAt(1) == nro.charAt(1)) {
                segundoDigitoPass.setEchoChar(nro.charAt(1));
            }
            
            if (entrada.charAt(2) == nro.charAt(2)) {
                tercerDigitoPass.setEchoChar(nro.charAt(2));
            } 
        } 
    }//GEN-LAST:event_entradaTextFieldActionPerformed

    private void entradaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaTextFieldKeyTyped
        //ESTE METODO CONTROLA EL "EVENTO" AL PRESIONAR una TECLA EN EL CAMPO DE TEXTO 'ingrese 3 numeros' -> "TextFieldActionPerformed"    
        char caracter = evt.getKeyChar();
        String textoingresado = entradaTextField.getText() + caracter;
        
        //sirve para que solo permita ingresar numeros
        if (!Character.isDigit(caracter)) {
            evt.consume();
            return;
        }
        
        //sirve para que no ingresen mas de 3 numeros
        if (textoingresado.length() > 3) {
            evt.consume();
            return;
        }
        
        
    }//GEN-LAST:event_entradaTextFieldKeyTyped

    private void btnRevelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevelarActionPerformed
        String nro = String.valueOf(nroSecreto);
        if (ayudas == 2) {
            primerDigitoPass.setEchoChar(nro.charAt(0));
            ayudas--;
            return;
        }
        
        if (primerDigitoPass.echoCharIsSet()) {
            segundoDigitoPass.setEchoChar(nro.charAt(1));
            btnRevelar.setEnabled(false); // desactiva el boton despues de pedir la segunda ayuda
            return;
        }

        
    }//GEN-LAST:event_btnRevelarActionPerformed

    private void primerDigitoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerDigitoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerDigitoPassActionPerformed

    private void tercerDigitoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tercerDigitoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tercerDigitoPassActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PassjPanel;
    private javax.swing.JButton btnRevelar;
    private javax.swing.JTextField entradaTextField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JTextField nroSecretoTextField;
    private javax.swing.JPasswordField primerDigitoPass;
    private javax.swing.JPasswordField segundoDigitoPass;
    private javax.swing.JPasswordField tercerDigitoPass;
    // End of variables declaration//GEN-END:variables
}
