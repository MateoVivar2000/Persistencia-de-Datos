package vista;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Productos_Modelo;
import modelo.tablaDAO;

public class ventanaCRUD extends javax.swing.JFrame {
    DefaultTableModel modelo;
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ventanaCRUD.class.getName());

 
    public ventanaCRUD() {
        initComponents();
        setLocationRelativeTo(null);
        String[] titulos = {"ID","PRODUCTO","MATERIAL","TIEMPO DE IMPRESION"};
        modelo = new DefaultTableModel(null,titulos);
        tblProductos.setModel(modelo);
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtMaterial = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTiempoDeImpresion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(this::btnBorrarActionPerformed);

        btnCancelar.setText("CANCELAR");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        jLabel1.setText("PRODUCTO:");

        jLabel2.setText("TIEMPO DE IMPRESION:");

        jLabel3.setText("MATERIAL:");

        jLabel4.setText("ID:");

        txtProducto.addActionListener(this::txtProductoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnAgregar)
                                .addGap(32, 32, 32)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrar)
                                .addGap(32, 32, 32)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaterial)
                                    .addComponent(txtTiempoDeImpresion)
                                    .addComponent(txtProducto)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoDeImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         tablaDAO objConexión = new tablaDAO();
        Productos_Modelo oModelo = recuperarDatosGUI();
       String strSentenciaInsert = String.format("UPDATE ProductosPersonalizadosTBL SET PRODUCTO='%s', MATERIAL='%s', TIEMPO_DE_IMPERSION='%s' WHERE ID=%d", 
        oModelo.getProducto(), 
        oModelo.getMaterial(), 
        oModelo.getTiempoDeImpresion().toString(), 
        oModelo.getID());
        objConexión.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    tablaDAO objConexión = new tablaDAO();
        Productos_Modelo oModelo = recuperarDatosGUI();
        String strSentenciaInsert = String.format("DELETE FROM ProductosPersonalizadosTBL WHERE ID = %d", oModelo.getID());
        objConexión.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        tablaDAO objConexión = new tablaDAO();
        Productos_Modelo oModelo = recuperarDatosGUI();
        String strSentenciaInsert = String.format("INSERT INTO ProductosPersonalizadosTBL (PRODUCTO, MATERIAL, TIEMPO_DE_IMPERSION)"
           + "VALUES ('%s','%s','%s')",oModelo.getProducto(),oModelo.getMaterial(),oModelo.getTiempoDeImpresion().toString());
        objConexión.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
    if(evt.getClickCount()==1){
        JTable receptor = (JTable)evt.getSource();
        txtID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
        txtProducto.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
        txtMaterial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
        txtTiempoDeImpresion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
        
    }
    }//GEN-LAST:event_tblProductosMouseClicked
    public void mostrarDatos(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
         tablaDAO objConexión = new tablaDAO();
    try {
            ResultSet resultado =objConexión.consultarProductos("SELECT * FROM ProductosPersonalizadosTBL");
            while (resultado.next()) {
                System.out.println(resultado.getString("ID"));
                System.out.println(resultado.getString("PRODUCTO"));
                System.out.println(resultado.getString("MATERIAL"));
                System.out.println(resultado.getString("TIEMPO_DE_IMPERSION"));
              
                Object[] usuario ={resultado.getString("ID"),resultado.getString("PRODUCTO"),resultado.getString("MATERIAL"),resultado.getString("TIEMPO_DE_IMPERSION")};
                modelo.addRow(usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Productos_Modelo recuperarDatosGUI(){
    Productos_Modelo oProductos = new Productos_Modelo();
    int ID = (txtID.getText().isEmpty())?0:Integer.parseInt(txtID.getText());
    oProductos.setID(ID);
    oProductos.setProducto(txtProducto.getText());
    oProductos.setMaterial(txtMaterial.getText());
    oProductos.setTiempoDeImpresion(txtTiempoDeImpresion.getText().isEmpty() ? 0.0f : Float.parseFloat(txtTiempoDeImpresion.getText()));
     return oProductos;
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ventanaCRUD().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTiempoDeImpresion;
    // End of variables declaration//GEN-END:variables
}
