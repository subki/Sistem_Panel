/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import koneksi.koneksi;

/**
 *
 * @author subki
 */
public class materialform extends javax.swing.JDialog {

    Connection conec;
    public materialform(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Data Material");
        this.setIconImage(new ImageIcon(getClass().getResource("/image/ssm.png")).getImage());
        conec = new koneksi().connection();
        tadeskrip.setLineWrap(true);
        tadeskrip.setWrapStyleWord(true);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfitemno = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tadeskrip = new javax.swing.JTextArea();
        tftipe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfbrand = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbunit = new javax.swing.JComboBox();
        jPanel2 = new style.ImageMaterial();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfaktual = new javax.swing.JTextField();
        tfjual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kode Material");

        jLabel2.setText("Nama Material");

        jLabel3.setText("Deskripsi");

        tfitemno.setText("jTextField1");

        tfnama.setText("jTextField2");

        tadeskrip.setColumns(20);
        tadeskrip.setRows(5);
        jScrollPane1.setViewportView(tadeskrip);

        tftipe.setText("jTextField3");

        jLabel4.setText("Type");

        jLabel5.setText("Brand");

        tfbrand.setText("jTextField4");

        jLabel6.setText("Unit");

        cbunit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".:: Unit ::.", "Meter", "Pcs", "Box", "Set", "Kg" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        btnSubmit.setText("jButton1");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga Aktual");

        jLabel8.setText("Harga Jual");

        tfaktual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfaktualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfaktualKeyTyped(evt);
            }
        });

        tfjual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfjualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfjualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfitemno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfnama)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfjual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfaktual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tftipe, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfbrand, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbunit, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnCancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfitemno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tftipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfaktual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(btnSubmit.getText().equals("Save")){
            save();
        }
        
        if(btnSubmit.getText().equals("Update")){
            update();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tfaktualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfaktualKeyReleased
        NumberFormat no = NumberFormat.getInstance();
        double nominal = Long.valueOf(tfaktual.getText().replace(",", "").trim());
        no.setMaximumFractionDigits(3);
        tfaktual.setText(no.format(nominal));
    }//GEN-LAST:event_tfaktualKeyReleased

    private void tfjualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfjualKeyReleased
        NumberFormat no = NumberFormat.getInstance();
        double nominal = Long.valueOf(tfjual.getText().replace(",", "").trim());
        no.setMaximumFractionDigits(3);
        tfjual.setText(no.format(nominal));
    }//GEN-LAST:event_tfjualKeyReleased

    private void tfaktualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfaktualKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))){
            evt.consume();
        }
    }//GEN-LAST:event_tfaktualKeyTyped

    private void tfjualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfjualKeyTyped
        char c = evt.getKeyChar();
        if(!((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))){
            evt.consume();
        }
    }//GEN-LAST:event_tfjualKeyTyped

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
            java.util.logging.Logger.getLogger(materialform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(materialform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(materialform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(materialform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                materialform dialog = new materialform(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbunit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tadeskrip;
    private javax.swing.JTextField tfaktual;
    private javax.swing.JTextField tfbrand;
    private javax.swing.JTextField tfitemno;
    private javax.swing.JTextField tfjual;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftipe;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfjual() {
        return tfjual;
    }

    public JTextField getTfaktual() {
        return tfaktual;
    }

    public JTextField getTfitemno() {
        return tfitemno;
    }

    public JTextArea getTadeskrip() {
        return tadeskrip;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public JTextField getTftipe() {
        return tftipe;
    }

    public JTextField getTfbrand() {
        return tfbrand;
    }

    public JTextField getTfnama() {
        return tfnama;
    }

    public JComboBox getCbunit() {
        return cbunit;
    }
    

    private void save() {
        String a = tfitemno.getText();
        String b = tfnama.getText();
        String c = tadeskrip.getText();
        String d = tftipe.getText();
        String e = tfbrand.getText();
        String f = (String)cbunit.getSelectedItem().toString();
        String act = tfaktual.getText().replace(",", "");
        String jual= tfjual.getText().replace(",", "");
        
        if(!a.equals("")){
            String sql_cari = "select * from component where item_no=?";
            String sql_insert = "insert into component (item_no, name, description, type, brand, unit, aktual, jual) values (?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement st = conec.prepareStatement(sql_cari);
                st.setString(1, a);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Data Material dengan Kode : "+a+" sudah ada. \n Update Data?", 
                                  "Warning", 
                                  JOptionPane.YES_NO_OPTION); 
                    if (selectedOption == JOptionPane.YES_OPTION) { 
                        update();
                    }
                }else{
                    try {
                        PreparedStatement ps = conec.prepareStatement(sql_insert);
                        ps.setString(1, a);
                        ps.setString(2, b);
                        ps.setString(3, c);
                        ps.setString(4, d);
                        ps.setString(5, e);
                        ps.setString(6, f);
                        ps.setString(7, act);
                        ps.setString(8, jual);
                        ps.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                        this.dispose();
                    } catch (SQLException ex) {
                        Logger.getLogger(materialform.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(materialform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Kode Material tidak boleh kosong");
        }
    }
    
    private void update(){
        String a = tfitemno.getText();
        String b = tfnama.getText();
        String c = tadeskrip.getText();
        String d = tftipe.getText();
        String e = tfbrand.getText();
        String f = (String)cbunit.getSelectedItem().toString();
        String act = tfaktual.getText().replace(",", "");
        String jual= tfjual.getText().replace(",", "");
        
        if(!a.equals("")){
            String sql = "update component set name=?, description=?, type=?, brand=?, unit=?, aktual=?, jual=? where item_no=?";
            try {
                PreparedStatement ps = conec.prepareStatement(sql);
                ps.setString(1, b);
                ps.setString(2, c);
                ps.setString(3, d);
                ps.setString(4, e);
                ps.setString(5, f);
                ps.setString(6, act);
                ps.setString(7, jual);
                ps.setString(8, a);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(materialform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Kode Material tidak boleh kosong");
        }
    }
}
