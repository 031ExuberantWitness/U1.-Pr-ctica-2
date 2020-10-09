
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class FmCalificaciones extends javax.swing.JDialog {
    private DefaultTableModel m;
    int unStatus;
    int xx =0, yy =0; 
    
    public FmCalificaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); txtNombre.setVisible(false);
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pCalif = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnidad = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        cmbUnidad = new javax.swing.JComboBox();
        txtCalif = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblCalif = new javax.swing.JLabel();
        lblProm = new javax.swing.JLabel();
        lblPromF = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();
        txtRow = new javax.swing.JTextField();
        txtUnSeleccionada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editorExportar = new javax.swing.JEditorPane();
        btnObtener = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("Calificaciones"); // NOI18N
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCalif.setBackground(new java.awt.Color(255, 255, 255));
        pCalif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUnidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidad", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUnidadMousePressed(evt);
            }
        });
        tblUnidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblUnidadPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblUnidad);
        if (tblUnidad.getColumnModel().getColumnCount() > 0) {
            tblUnidad.getColumnModel().getColumn(0).setResizable(false);
            tblUnidad.getColumnModel().getColumn(1).setResizable(false);
        }

        pCalif.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 290));

        btnSalir.setText("Cerrar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pCalif.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, -1));

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige la unidad...", "Unidad 1.- Introduccion", "Unidad 2.- Clases", "Unidad 3.- Herencia", "Unidad 4.- Polimorfismo", "Unidad 5.- Excepciones", "Unidad 6.- Persistencia" }));
        cmbUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUnidadItemStateChanged(evt);
            }
        });
        pCalif.add(cmbUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 350, -1));

        txtCalif.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCalif.setEnabled(false);
        txtCalif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCalifKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalifKeyTyped(evt);
            }
        });
        pCalif.add(txtCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 180, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pCalif.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 180, -1));

        lblCalif.setText("Calificacion de la unidad:");
        pCalif.add(lblCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 160, -1));

        lblProm.setText("Promedio:");
        pCalif.add(lblProm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        lblPromF.setText("ERROR404");
        pCalif.add(lblPromF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/FondoBlanco.jpg"))); // NOI18N
        pCalif.add(lblBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtRow.setText("jTextField1");
        pCalif.add(txtRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 80, -1));

        txtUnSeleccionada.setText("jTextField1");
        pCalif.add(txtUnSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        jTabbedPane1.addTab("Tabla", pCalif);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(editorExportar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 290));

        btnObtener.setText("Obtener datos");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });
        jPanel1.add(btnObtener, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 130, 30));

        btnExportar.setText("Exportar");
        btnExportar.setEnabled(false);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 130, 30));

        txtNombre.setEditable(false);
        txtNombre.setText("calificaciones.txt");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 220, 30));

        jTabbedPane1.addTab("Exportar", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUnidadItemStateChanged
        txtCalif.requestFocus(); txtCalif.setEnabled(true); btnAgregar.setEnabled(true);
    }//GEN-LAST:event_cmbUnidadItemStateChanged

    private void txtCalifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalifKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            agregarCalif();
        }
    }//GEN-LAST:event_txtCalifKeyReleased

    private void tblUnidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnidadMousePressed
        int res = JOptionPane.showConfirmDialog(this, "¿Desea borrar esta fila?");
        if(res == JOptionPane.OK_OPTION) m.removeRow(tblUnidad.getSelectedRow());
        calcularProm(); 
        
        editorExportar.setText("");
        btnExportar.setEnabled(false);
    }//GEN-LAST:event_tblUnidadMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getXOnScreen(); int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX(); yy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarCalif();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        if (tblUnidad.getRowCount()==0){
            showMessageDialog(null, "Registre al menos una calificación...");
            return;
        }
        
        btnExportar.setEnabled(true);
        exportarTabla();
    }//GEN-LAST:event_btnObtenerActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCalifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalifKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtCalifKeyTyped

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        try{
            OutputStreamWriter archivo = new OutputStreamWriter( new FileOutputStream( txtNombre.getText()));
            
            archivo.write(editorExportar.getText());
            archivo.close();
            
            showMessageDialog(null, "Se guardo con exito el archivo...");
            
            editorExportar.setText("");
            dispose();
        }catch(Exception e){
            showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void tblUnidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblUnidadPropertyChange
        
    }//GEN-LAST:event_tblUnidadPropertyChange
    
    private void agregarCalif(){
        if(Integer.parseInt(txtCalif.getText()) <0 || Integer.parseInt(txtCalif.getText()) >10){
            showMessageDialog(null, "Solo entre valores entre 10 y 0");
            return;
        }//Verifica el rango de la calificación
        
        int existe = 0;
        if(cmbUnidad.getSelectedIndex()==0){
                showMessageDialog(this, "Error: Seleccione una unidad...");
            }else{
                if(txtCalif.getText().equals("")){
                showMessageDialog(this, "Error: No deje el espacio en blanco...");
                }else{
                    Object itemSelec = cmbUnidad.getSelectedItem();
                    m =(DefaultTableModel)tblUnidad.getModel();
                    
                    for (int i = 0; i < m.getRowCount(); i++){
                        if(cmbUnidad.getSelectedItem().toString().equals(m.getValueAt(i,0).toString())){
                            m.setValueAt(txtCalif.getText(), i, 1);
                            showMessageDialog(this, "Datos modificados exitosamente...");
                            txtCalif.setText("");
                            existe = 1;
                            i = m.getRowCount();
                        }else{
                            existe = 0;
                        }
                    }
                    
                    if(existe==0){
                       Object O[]=new Object[2];
                        O[0]= itemSelec;
                        O[1]= txtCalif.getText();
                        m.addRow(O); 
                        txtCalif.setText("");
                        unStatus++;
                    }
                    calcularProm();
                    txtCalif.setEnabled(true);
                }
            }
        
        txtCalif.requestFocus(); cmbUnidad.setSelectedIndex(cmbUnidad.getSelectedIndex()+1);
        
        editorExportar.setText("");
        btnExportar.setEnabled(false);
    }
    
    private void calcularProm(){
        int promTotal = 0;
        for (int i = 0; i < m.getRowCount(); i++){
            promTotal += Integer.parseInt((String) m.getValueAt(i, 1));
        }
        lblPromF.setText(Integer.toString(promTotal/6));
    }
    
    private void exportarTabla(){
        String cad = "";
        for (int i = 0; i < m.getRowCount(); i++){
            cad += m.getValueAt(i, 0).toString() + ": " + m.getValueAt(i, 1).toString() + "\n";
        }
        
        editorExportar.setText(cad);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnObtener;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbUnidad;
    private javax.swing.JEditorPane editorExportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblCalif;
    private javax.swing.JLabel lblProm;
    private javax.swing.JLabel lblPromF;
    private javax.swing.JPanel pCalif;
    private javax.swing.JTable tblUnidad;
    private javax.swing.JTextField txtCalif;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRow;
    private javax.swing.JTextField txtUnSeleccionada;
    // End of variables declaration//GEN-END:variables
}
