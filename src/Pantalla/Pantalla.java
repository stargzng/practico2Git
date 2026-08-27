package Pantalla;

public class Pantalla extends javax.swing.JFrame {

    private int nroSecreto;

    public Pantalla() {
        initComponents();
        nroSecreto = (int) (Math.random() * 899) + 100;
        nroSecretoTextField.setText(String.valueOf(nroSecreto));
        desarme();
        
        //asdasd
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        nroSecretoTextField = new javax.swing.JTextField();
        entradaTextField = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        digitoTres = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        digitoDos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        digitoUno = new javax.swing.JTextArea();
        primerDigito = new javax.swing.JPasswordField();
        segundoDigito = new javax.swing.JPasswordField();
        tercerDigito = new javax.swing.JPasswordField();
        botonAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adiviná");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);

        nroSecretoTextField.setEditable(false);
        nroSecretoTextField.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        nroSecretoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nroSecretoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroSecretoTextFieldActionPerformed(evt);
            }
        });

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

        digitoTres.setEditable(false);
        digitoTres.setColumns(20);
        digitoTres.setRows(5);
        jScrollPane5.setViewportView(digitoTres);

        digitoDos.setEditable(false);
        digitoDos.setColumns(20);
        digitoDos.setRows(5);
        jScrollPane3.setViewportView(digitoDos);

        digitoUno.setEditable(false);
        digitoUno.setColumns(20);
        digitoUno.setRows(5);
        jScrollPane6.setViewportView(digitoUno);

        primerDigito.setText("jPasswordField1");
        primerDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerDigitoActionPerformed(evt);
            }
        });

        segundoDigito.setText("jPasswordField1");

        tercerDigito.setText("jPasswordField1");

        botonAyuda.setText("ayuda");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(nroSecretoTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(entradaTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(primerDigito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(segundoDigito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tercerDigito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botonAyuda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(nroSecretoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(primerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(segundoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tercerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nroSecretoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(primerDigito)
                            .addComponent(segundoDigito)
                            .addComponent(tercerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

        
        primerDigito.setText(""+nro.charAt(0));
        segundoDigito.setText(""+nro.charAt(1));
        tercerDigito.setText(""+nro.charAt(2));
        
        //borrar
        digitoUno.setText(""+nro.charAt(0));
        digitoDos.setText(""+nro.charAt(1));
        digitoTres.setText(""+nro.charAt(2));
        
    }


    private void nroSecretoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroSecretoTextFieldActionPerformed

    }//GEN-LAST:event_nroSecretoTextFieldActionPerformed

    private void entradaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaTextFieldActionPerformed

    }//GEN-LAST:event_entradaTextFieldActionPerformed

    private void entradaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaTextFieldKeyTyped

        //ESTE METODO CONTROLA EL "EVENTO" AL PRESIONAR una TECLA EN EL CAMPO DE TEXTO 'ingrese 3 numeros' -> "TextFieldActionPerformed"        

    }//GEN-LAST:event_entradaTextFieldKeyTyped

    private void primerDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerDigitoActionPerformed
        
        
    }//GEN-LAST:event_primerDigitoActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
      
    }//GEN-LAST:event_botonAyudaActionPerformed

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
    private javax.swing.JButton botonAyuda;
    private javax.swing.JTextArea digitoDos;
    private javax.swing.JTextArea digitoTres;
    private javax.swing.JTextArea digitoUno;
    private javax.swing.JTextField entradaTextField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField nroSecretoTextField;
    private javax.swing.JPasswordField primerDigito;
    private javax.swing.JPasswordField segundoDigito;
    private javax.swing.JPasswordField tercerDigito;
    // End of variables declaration//GEN-END:variables
}
