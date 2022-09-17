
package sistematiendaropa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SistemaTienda extends javax.swing.JFrame {

    public SistemaTienda() {
        initComponents();
        this.tabladetalles.setModel(modelo);
        this.modelo.addColumn("NACIONALIDAD");
        this.modelo.addColumn("GENERO");
        this.modelo.addColumn("TALLAS");
        this.modelo.addColumn("PRENDAS");
        this.modelo.addColumn("CANTIDAD");
        this.modelo.addColumn("PRECIO UNITARIO");
        this.modelo.addColumn("TOTAL A PAGAR");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbonacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        botonh = new javax.swing.JRadioButton();
        botonm = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        cbotallas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtprenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btngenerar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalles = new javax.swing.JTable();
        btnlimpiartabla = new javax.swing.JButton();
        btnquitar = new javax.swing.JButton();
        btnnetopagar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtnetopagar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema Tienda de Ropa");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos y/o Promociones"));

        jLabel2.setText("Nacional");

        jLabel3.setText("Hombre Talla: S=0.05, M=0.07, L=0.10");

        jLabel4.setText("Mujer Talla: S=0-04, M=0.09, L=0.12");

        jLabel5.setText("Extranjeros");

        jLabel6.setText("Hombre Talla: S=0.04, M=0.09, L=0.12");

        jLabel7.setText("Mujer Talla: S=0.05, M=0.07, L=0.10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Realizar Compra"));

        jLabel8.setText("Nacionalidad");

        cbonacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mexicano", "Extranjero" }));

        jLabel9.setText("Genero");

        buttonGroup1.add(botonh);
        botonh.setText("Hombre ");

        buttonGroup1.add(botonm);
        botonm.setText("Mujer");

        jLabel10.setText("Tallas");

        cbotallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "S", "M", "L" }));

        jLabel11.setText("Prenda");

        jLabel12.setText("Cantidad");

        jLabel13.setText("Precio");

        jLabel14.setText("Total a Pagar:");

        btngenerar.setText("Generar Compra");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel9)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel10)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonm)
                        .addGap(18, 18, 18)
                        .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtprecio)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btngenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonh)
                    .addComponent(botonm)
                    .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngenerar)
                    .addComponent(btnlimpiar))
                .addGap(36, 36, 36))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Compras"));

        tabladetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalles);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnlimpiartabla.setText("Limpiar Tabla");
        btnlimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartablaActionPerformed(evt);
            }
        });

        btnquitar.setText("Quitar Compra");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        btnnetopagar.setText("Neto a Pagar");
        btnnetopagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnetopagarActionPerformed(evt);
            }
        });

        jLabel15.setText("Neto a Pagar S/.");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnlimpiartabla, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnquitar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnetopagar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnetopagar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiartabla)
                    .addComponent(btnquitar)
                    .addComponent(btnnetopagar)
                    .addComponent(jLabel15)
                    .addComponent(txtnetopagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel modelo=new DefaultTableModel();
    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        descuentos_hombres_mexicanos();
        descuentos_mujeres_mexicanas();
        descuentos_hombres_extranjeros();
        descuentos_mujeres_extranjeras();
        
        if (botonh.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedIndex(),"Hombre",
                this.cbotallas.getSelectedItem(),this.txtprenda.getText(),this.txtcantidad.getText(),
                this.txtprecio.getText(),this.txttotal.getText()});
        }
        else if (botonm.isSelected()){
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedIndex(),"Mujer",
                this.cbotallas.getSelectedItem(),this.txtprenda.getText(),this.txtcantidad.getText(),
                this.txtprecio.getText(),this.txttotal.getText()});
        }       
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        this.cbonacionalidad.setSelectedIndex(0);
        if (botonh.isSelected()){ 
        }
        if (botonm.isSelected()){ 
        }
        this.cbotallas.setSelectedIndex(0);
        this.txtprenda.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.txttotal.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        modelo.removeRow(this.tabladetalles.getSelectedRow());
    }//GEN-LAST:event_btnquitarActionPerformed

    private void btnlimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartablaActionPerformed
        int x=this.modelo.getRowCount();
        for (int y= 0; y <=x; y++){
            this.modelo.removeRow(0);
        }
        this.txtnetopagar.setText("");
    }//GEN-LAST:event_btnlimpiartablaActionPerformed

    private void btnnetopagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnetopagarActionPerformed
        double sumatoria;
        double sumatorial=0;
        int totalrow=tabladetalles.getRowCount();
        totalrow-=1;
        for (int i =0; i <= (totalrow); i++){
            sumatoria=Double.parseDouble(String.valueOf(tabladetalles.getValueAt(i, 6)));
            sumatorial+=sumatoria;
        }
        txtnetopagar.setText("$. "+String.valueOf(sumatorial));
    }//GEN-LAST:event_btnnetopagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int aux = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
    if (aux==JOptionPane.YES_OPTION){ 
        System.exit(0);
    }else if (aux==JOptionPane.NO_OPTION){
        SistemaTienda v1 = new SistemaTienda();
        v1.setVisible(true);
        this.setVisible(false);
    }else {
        SistemaTienda v1 = new SistemaTienda();
        v1.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public void descuentos_hombres_extranjeros(){
        double cantidad_s,precio_s,total_s,desc_s=0.04;
        double cantidad_m,precio_m,total_m,desc_m=0.09;
        double cantidad_l,precio_l,total_l,desc_l=0.12;
     
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==1){
                    cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                    precio_s=Double.parseDouble(this.txtprecio.getText());
                    total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==2){
                    cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                    precio_m=Double.parseDouble(this.txtprecio.getText());
                    total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==3){
                    cantidad_l=Double.parseDouble(this.txtcantidad.getText());
                    precio_l=Double.parseDouble(this.txtprecio.getText());
                    total_l=(precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }
    public void descuentos_mujeres_extranjeras(){
        Double cantidad_s,precio_s,total_s,desc_s=0.05;
        Double cantidad_m,precio_m,total_m,desc_m=0.07;
        Double cantidad_l,precio_l,total_l,desc_l=0.05;
        
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonm.isSelected());{
            if (cbotallas.getSelectedIndex()==1){
                cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                precio_s=Double.parseDouble(this.txtprecio.getText());
                total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                this.txttotal.setText(String.valueOf(total_s));
            }
        }
        }
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonm.isSelected());{
            if (cbotallas.getSelectedIndex()==2){
                cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                precio_m=Double.parseDouble(this.txtprecio.getText());
                total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                this.txttotal.setText(String.valueOf(total_m));
            }
        }
        }
        if (cbonacionalidad.getSelectedIndex()==2){
            if (this.botonm.isSelected());{
            if (cbotallas.getSelectedIndex()==3){
                cantidad_l=Double.parseDouble(this.txtcantidad.getText());
                precio_l=Double.parseDouble(this.txtprecio.getText());
                total_l=(precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                this.txttotal.setText(String.valueOf(total_l));
            }
        }
        }
    }
    public void descuentos_mujeres_mexicanas(){
        Double cantidad_s,precio_s,total_s,desc_s=0.04;
        Double cantidad_m,precio_m,total_m,desc_m=0.09;
        Double cantidad_l,precio_l,total_l,desc_l=0.12;
        
         if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonm.isSelected()){
                if (cbotallas.getSelectedIndex()==1){
                    cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                    precio_s=Double.parseDouble(this.txtprecio.getText());
                    total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
          if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonm.isSelected()){
                if (cbotallas.getSelectedIndex()==2){
                    cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                    precio_m=Double.parseDouble(this.txtprecio.getText());
                    total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
           if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonm.isSelected()){
                if (cbotallas.getSelectedIndex()==3){
                    cantidad_l=Double.parseDouble(this.txtcantidad.getText());
                    precio_l=Double.parseDouble(this.txtprecio.getText());
                    total_l=(precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }
    public void descuentos_hombres_mexicanos(){
        Double cantidad_s,precio_s,total_s,desc_s=0.05;
        Double cantidad_m,precio_m,total_m,desc_m=0.07;
        Double cantidad_l,precio_l,total_l,desc_l=0.10;
        
        if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==1){
                    cantidad_s=Double.parseDouble(this.txtcantidad.getText());
                    precio_s=Double.parseDouble(this.txtprecio.getText());
                    total_s=(precio_s*cantidad_s)-((cantidad_s*precio_s)*desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==2){
                    cantidad_m=Double.parseDouble(this.txtcantidad.getText());
                    precio_m=Double.parseDouble(this.txtprecio.getText());
                    total_m=(precio_m*cantidad_m)-((cantidad_m*precio_m)*desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex()==1){
            if (this.botonh.isSelected()){
                if (cbotallas.getSelectedIndex()==3){
                    cantidad_l=Double.parseDouble(this.txtcantidad.getText());
                    precio_l=Double.parseDouble(this.txtprecio.getText());
                    total_l=(precio_l*cantidad_l)-((cantidad_l*precio_l)*desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }
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
            java.util.logging.Logger.getLogger(SistemaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonh;
    private javax.swing.JRadioButton botonm;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiartabla;
    private javax.swing.JButton btnnetopagar;
    private javax.swing.JButton btnquitar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbonacionalidad;
    private javax.swing.JComboBox<String> cbotallas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladetalles;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnetopagar;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprenda;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
