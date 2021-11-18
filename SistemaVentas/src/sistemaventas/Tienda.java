package sistemaventas;

import controladores.ControladorCompra;
import controladores.ControladorDetalleCompra;
import controladores.ControladorProducto;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Tienda extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    public Tienda() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tiendaId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tiendaName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tiendaSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tx_descripcion = new javax.swing.JTextField();
        tx_stock = new javax.swing.JTextField();
        tx_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_cantidad_compra = new javax.swing.JTextField();
        btn_comprar = new javax.swing.JButton();
        tx_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));

        tiendaId.setEditable(false);

        jLabel1.setText("IDUser");

        tiendaName.setEditable(false);

        jLabel2.setText("Usuario");

        tiendaSalir.setBackground(new java.awt.Color(255, 204, 204));
        tiendaSalir.setForeground(new java.awt.Color(255, 0, 0));
        tiendaSalir.setText("SALIR");
        tiendaSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiendaSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiendaId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiendaName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiendaSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tiendaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(tiendaSalir))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tiendaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Stock", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tx_descripcion.setEditable(false);
        tx_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tx_stock.setEditable(false);
        tx_stock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tx_id.setEditable(false);
        tx_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        tx_cantidad_compra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_comprar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_comprar.setText("Comprar");
        btn_comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprarMouseClicked(evt);
            }
        });

        tx_precio.setEditable(false);
        tx_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tx_cantidad_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tx_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_cantidad_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiendaSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiendaSalirMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_tiendaSalirMouseClicked

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        int fila = TablaProductos.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Producto no seleccionado");
        }else{
            id = Integer.parseInt((String)TablaProductos.getValueAt(fila, 0).toString());
            String descripcion = (String)TablaProductos.getValueAt(fila, 1);
            int stock = Integer.parseInt((String)TablaProductos.getValueAt(fila, 2).toString());
            float precio = Float.parseFloat((String)TablaProductos.getValueAt(fila, 3).toString());
            
            tx_id.setText(""+id);
            tx_descripcion.setText(descripcion);
            tx_stock.setText(""+stock);
            tx_precio.setText(""+precio);
        }  
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void btn_comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprarMouseClicked
        int idProducto;
        String descripcion;
        int stock, idCliente, cantidadCompra, stockActualizado;
        float precio, total;
        boolean result;
        String idtest, stockTest, precioTest, cantidadTest, nombreUser;
        
        idtest = tx_id.getText();
        descripcion = tx_descripcion.getText();
        stockTest = tx_stock.getText();
        precioTest = tx_precio.getText();
        nombreUser = tiendaName.getText();
        
        if("".equals(idtest) || "".equals(descripcion) || "".equals(stockTest) || "".equals(precioTest)){
            JOptionPane.showMessageDialog(null, "Producto no seleccionado");
        }else{
            idProducto = Integer.parseInt(idtest);
            stock = Integer.parseInt(stockTest);
            precio = Float.parseFloat(precioTest);
            idCliente = Integer.parseInt(tiendaId.getText());
            cantidadTest = tx_cantidad_compra.getText();
            if("".equals(cantidadTest)){
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad");
            }else{
                cantidadCompra = Integer.parseInt(cantidadTest);
                if(cantidadCompra > stock || cantidadCompra <= 0 || stock == 0){
                    JOptionPane.showMessageDialog(null, "No se puede comprar esa cantidad");
                }else{
                    
                    ControladorCompra ctrlCompra = new ControladorCompra();
                    ControladorProducto ctrlProd = new ControladorProducto();                   
                    Compra compra = new Compra(idProducto, idCliente);
                    
                    result = ctrlCompra.comprar(compra);
                    if(result == true){
                        ControladorDetalleCompra ctrlDetalle = new ControladorDetalleCompra();
                        // Se actualiza el stock
                        stockActualizado = stock - cantidadCompra;
                        total = cantidadCompra*precio;
                        
                        ctrlProd.actualizarStock(idProducto, stockActualizado);
                        DetalleCompra detalle = new DetalleCompra(nombreUser, descripcion, cantidadCompra, precio, total);
                        ctrlDetalle.crearDetalleCompra(detalle);
                        JOptionPane.showMessageDialog(null, "Compra Exitosa!");
                        listar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha Ocurrido en la compra");
                    }
                    tx_id.setText("");
                    tx_descripcion.setText("");
                    tx_stock.setText("");
                    tx_precio.setText("");
                    tx_cantidad_compra.setText("");
                    limpiarTabla();
                    listar();
                }
            }            
        }
    }//GEN-LAST:event_btn_comprarMouseClicked

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }
    
    public void listar(){
        String sql = "select * from producto";
        try {
            cn=Conexion.GetConnection();
            st= cn.createStatement();
            rs=st.executeQuery(sql);
            Object[] producto = new Object[4];
            modelo=(DefaultTableModel)TablaProductos.getModel();
            while(rs.next()){
                producto[0] = rs.getInt("idproducto");
                producto[1] = rs.getString("descripcion");
                producto[2] = rs.getInt("stock");
                producto[3] = rs.getFloat("precio");
                modelo.addRow(producto);
            }
            TablaProductos.setModel(modelo);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void limpiarTabla(){       
        DefaultTableModel model = (DefaultTableModel) this.TablaProductos.getModel(); 
        int rows; 
        rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--){
           model.removeRow(i); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaProductos;
    public javax.swing.JButton btn_comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField tiendaId;
    public javax.swing.JTextField tiendaName;
    public javax.swing.JButton tiendaSalir;
    public javax.swing.JTextField tx_cantidad_compra;
    public javax.swing.JTextField tx_descripcion;
    public javax.swing.JTextField tx_id;
    public javax.swing.JTextField tx_precio;
    public javax.swing.JTextField tx_stock;
    // End of variables declaration//GEN-END:variables
}
