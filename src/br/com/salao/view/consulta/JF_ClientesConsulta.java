/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salao.view.consulta;

import br.com.salao.control.Clientes_Controller;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dragon ball gt
 */
public class JF_ClientesConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form JF_FuncionariosConsulta
     */
    public JF_ClientesConsulta() {
        initComponents();
        buscar_Clientes();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jff_cel = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btt_Gravar_Servico = new javax.swing.JButton();
        btt_Gravar_Servico1 = new javax.swing.JButton();
        btt_Gravar_Servico2 = new javax.swing.JButton();
        btt_Gravar_Servico3 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Clientes");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        txt_Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txt_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_NomeCaretUpdate(evt);
            }
        });

        jff_cel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        try {
            jff_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jff_cel.setToolTipText("");
        jff_cel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Cel:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tel", "Cel", "Rua", "Nº", "Bairro", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btt_Gravar_Servico.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btt_Gravar_Servico.setText("Gravar");
        btt_Gravar_Servico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        btt_Gravar_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_Gravar_ServicoActionPerformed(evt);
            }
        });

        btt_Gravar_Servico1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btt_Gravar_Servico1.setText("Editar");
        btt_Gravar_Servico1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        btt_Gravar_Servico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_Gravar_Servico1ActionPerformed(evt);
            }
        });

        btt_Gravar_Servico2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btt_Gravar_Servico2.setText("Excluir");
        btt_Gravar_Servico2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        btt_Gravar_Servico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_Gravar_Servico2ActionPerformed(evt);
            }
        });

        btt_Gravar_Servico3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btt_Gravar_Servico3.setText("Cancelar");
        btt_Gravar_Servico3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        btt_Gravar_Servico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_Gravar_Servico3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jff_cel, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btt_Gravar_Servico, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btt_Gravar_Servico1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btt_Gravar_Servico2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btt_Gravar_Servico3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jff_cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_Gravar_Servico)
                    .addComponent(btt_Gravar_Servico1)
                    .addComponent(btt_Gravar_Servico2)
                    .addComponent(btt_Gravar_Servico3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_Gravar_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_Gravar_ServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_Gravar_ServicoActionPerformed

    private void btt_Gravar_Servico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_Gravar_Servico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_Gravar_Servico1ActionPerformed

    private void btt_Gravar_Servico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_Gravar_Servico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_Gravar_Servico2ActionPerformed

    private void btt_Gravar_Servico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_Gravar_Servico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_Gravar_Servico3ActionPerformed


    private void txt_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_NomeCaretUpdate
        // TODO add your handling code here:

        Clientes_Controller c = new Clientes_Controller();

        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.getDataVector().clear();//Limpando tabela para não duplica valores

        for (Object obj : c.buscarPor_Nome(txt_Nome.getText())) {
            Map row = (Map) obj;

            modelo.addRow(new Object[]{
                row.get("nome"),
                row.get("tel"),
                row.get("cel"),
                row.get("rua"),
                row.get("numero"),
                row.get("bairro"),

            });

        }
    }//GEN-LAST:event_txt_NomeCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_Gravar_Servico;
    private javax.swing.JButton btt_Gravar_Servico1;
    private javax.swing.JButton btt_Gravar_Servico2;
    private javax.swing.JButton btt_Gravar_Servico3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jff_cel;
    private javax.swing.JTextField txt_Nome;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = null;

    private void buscar_Clientes() {
        Clientes_Controller c = new Clientes_Controller();

        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.getDataVector().clear();//Limpando tabela para não duplica valores

        for (Object obj : c.lista_Clientes()) {
            Map row = (Map) obj;

            modelo.addRow(new Object[]{
                row.get("nome"),
                row.get("tel"),
                row.get("cel"),
                row.get("rua"),
                row.get("numero"),
                row.get("bairro"),

            });

        }
    }

}