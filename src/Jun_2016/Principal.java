
package Jun_2016;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Mar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BT_Simulacion = new javax.swing.JToggleButton();
        BT_Salir = new javax.swing.JButton();
        BT_Exportar = new javax.swing.JButton();
        BT_Detalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TB_Mar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(TB_Mar);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mar de los Sargazos");

        BT_Simulacion.setText("Arrancar");
        BT_Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SimulacionActionPerformed(evt);
            }
        });

        BT_Salir.setText("Salir");

        BT_Exportar.setText("Exportar");
        BT_Exportar.setEnabled(false);

        BT_Detalle.setText("Detalle");
        BT_Detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Simulacion)
                        .addGap(31, 31, 31)
                        .addComponent(BT_Exportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Detalle)
                        .addGap(39, 39, 39)
                        .addComponent(BT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Simulacion)
                    .addComponent(BT_Salir)
                    .addComponent(BT_Exportar)
                    .addComponent(BT_Detalle))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_DetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DetalleActionPerformed
        Detalle d = new Detalle();
        d.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BT_DetalleActionPerformed

    private void BT_SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SimulacionActionPerformed
       
        BT_Simulacion.setText("Parar");
        
        if (BT_Simulacion.isSelected()) BT_Simulacion.setText("Arrancar");
    }//GEN-LAST:event_BT_SimulacionActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Detalle;
    private javax.swing.JButton BT_Exportar;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JToggleButton BT_Simulacion;
    private javax.swing.JTable TB_Mar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
