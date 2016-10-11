/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("RECORRIDOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 180, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos iniciales:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Numero de filas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Numero de columnas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel1.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 60, 30));

        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, 120));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        cmdLlenadoAutomatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLlenadoAutomatico.setText("Llenado Automatico");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 30));

        cmdLlenadoManual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLlenadoManual.setText("Llenado Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 30));

        cmdOperacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 90, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 400, 120));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 430, 330));

        cmbOperaciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Recorrido 1", "Recorrido 2", "Recorrido 3", "Recorrido 4", "Recorrido 5" }));
        jPanel2.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, 30));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 450, 330));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 590, 80));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 640, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
       int nf,nc,n;
        
        nf=Integer.parseInt(txtFilas.getText());
        nc=Integer.parseInt(txtColumnas.getText());
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
               n = (int) (Math.random()*50 + 1); 
              tblTablaInicial.setValueAt(n,i,j);  
            }
        }
       
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
       int nf,nc;
        DefaultTableModel tm,tm2;
        
        if (txtFilas.getText().trim().isEmpty()){
           txtFilas.requestFocusInWindow();
          JOptionPane.showMessageDialog(this,"Digite por favor el numero de filas","Error",JOptionPane.ERROR_MESSAGE);
        } else if (txtColumnas.getText().trim().isEmpty()){
            txtColumnas.requestFocusInWindow();
            JOptionPane.showMessageDialog(this,"Digite por favor el numero de columnas","Error",JOptionPane.ERROR_MESSAGE);
        
        }else {
            nf=Integer.parseInt(txtFilas.getText());
            nc=Integer.parseInt(txtColumnas.getText());
            
         tm = (DefaultTableModel) tblTablaInicial.getModel();
         tm2 = (DefaultTableModel)tblTablaResultado.getModel();

         tm.setRowCount(nf);
         tm.setColumnCount(nc);

         tm2.setRowCount(nf);
         tm2.setColumnCount(nc);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
       int nf,nc;
       
      nc=tblTablaInicial.getColumnCount();
      nf=tblTablaInicial.getRowCount();
      DefaultTableModel tm,tm2;
      
      txtFilas.setText("");
      txtColumnas.setText("");
      cmbOperaciones.setSelectedIndex(0);
      txtResultado.setText("");
      
      tm=(DefaultTableModel) tblTablaInicial.getModel();
      tm2=(DefaultTableModel) tblTablaResultado.getModel();
      
       tm.setRowCount(0);
       tm.setColumnCount(0);
       
       tm2.setRowCount(0);
       tm2.setColumnCount(0);
       
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
      int nf,nc,op,aux;
      
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiartabla(tblTablaResultado);
        
      switch (op){
            case 0:
            txtResultado.setText(Helper.PrimerRecorrido(tblTablaInicial));
              break;
            case 1:
            txtResultado.setText(Helper.SegundoRecorrido(tblTablaInicial));
                break;
            case 2:
             
                break;
            case 3:
             txtResultado.setText(Helper.CuartoRecorrido(tblTablaInicial));
                break; 
             case 4:
             txtResultado.setText(Helper.QuintoRecorrido(tblTablaInicial));
                break;
           
       }        
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc;
       int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemeto en la posicion ["+i+"]"+"["+j+"]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un numero valido",3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                            
                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
     char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          }
    }//GEN-LAST:event_txtColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}