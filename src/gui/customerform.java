/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import koneksi.koneksi;

/**
 *
 * @author ika
 */
public class customerform extends javax.swing.JDialog {

    Connection conec;
    
    public customerform(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Data Customer");
        this.setIconImage(new ImageIcon(getClass().getResource("/image/ssm.png")).getImage());
        conec = new koneksi().connection();
        taaddress.setWrapStyleWord(true);
        taaddress.setLineWrap(true);
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
        tfkode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taaddress = new javax.swing.JTextArea();
        tftelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tffax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfpic1 = new javax.swing.JTextField();
        tfpic2 = new javax.swing.JTextField();
        jPanel2 = new style.ImageCustomer();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfkode.setText("jTextField1");

        jLabel1.setText("ID Cusomer");

        jLabel2.setText("Nama Customer");

        jLabel3.setText("Alamat");

        tfnama.setText("jTextField1");

        taaddress.setColumns(20);
        taaddress.setRows(5);
        jScrollPane1.setViewportView(taaddress);

        tftelepon.setText("jTextField2");

        jLabel4.setText("Telepon");

        jLabel5.setText("Fax");

        tffax.setText("jTextField3");

        jLabel6.setText("PIC 1 & 2");

        tfpic1.setText("jTextField4");

        tfpic2.setText("jTextField5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jLabel6))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tffax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(tftelepon, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfpic2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addComponent(tfpic1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tftelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tffax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfpic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfpic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnCancel))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(btnSubmit.getText().equals("Save")){
            save();
        }
        if(btnSubmit.getText().equals("Update")) {
            update();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       customer frm = new customer();
       frm.createtable();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                customerform dialog = new customerform(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taaddress;
    private javax.swing.JTextField tffax;
    private javax.swing.JTextField tfkode;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfpic1;
    private javax.swing.JTextField tfpic2;
    private javax.swing.JTextField tftelepon;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfkode() {
        return tfkode;
    }

    public JTextField getTffax() {
        return tffax;
    }

    public JTextField getTfnama() {
        return tfnama;
    }

    public JTextField getTfpic1() {
        return tfpic1;
    }

    public JTextField getTfpic2() {
        return tfpic2;
    }

    public JTextField getTftelepon() {
        return tftelepon;
    }

    public JTextArea getTaaddress() {
        return taaddress;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    private void save() {
        String a = tfkode.getText();
        String b = tfnama.getText();
        String c = taaddress.getText();
        String d = tftelepon.getText();
        String e = tffax.getText();
        String f = tfpic1.getText();
        String g = tfpic2.getText();
        
        if(!a.equals("")){
            String sql_cari = "select * from customer where id=?";
            String sql_insert = "insert into customer (id, nama, alamat, telepon, fax, pic1, pic2) values (?,?,?,?,?,?,?)";
            try {
                PreparedStatement st = conec.prepareStatement(sql_cari);
                st.setString(1, a);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Data Customer dengan ID : "+a+" sudah ada. \n Update Data?", 
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
                        ps.setString(7, g);
                        ps.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                        this.dispose();
                    } catch (SQLException ex) {
                        Logger.getLogger(customerform.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(customerform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ID Customer tidak boleh kosong");
        }
    }
    
    private void update(){
        
        String a = tfkode.getText();
        String b = tfnama.getText();
        String c = taaddress.getText();
        String d = tftelepon.getText();
        String e = tffax.getText();
        String f = tfpic1.getText();
        String g = tfpic2.getText();
        if(!a.equals("")){
            String sql = "update customer set nama=?, alamat=?, telepon=?, fax=?, pic1=?, pic2=? where id=?";
            try {
                PreparedStatement ps = conec.prepareStatement(sql);
                ps.setString(1, b);
                ps.setString(2, c);
                ps.setString(3, d);
                ps.setString(4, e);
                ps.setString(5, f);
                ps.setString(6, g);
                ps.setString(7, a);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(customerform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "ID Customer tidak boleh kosong");
        }
    }
public void nomor_faktur() {
        String pre = "CL";
        String sql = "select * from faktur where faktur=?";
        try {
            PreparedStatement st = conec.prepareStatement(sql);
            st.setString(1, pre);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int no = rs.getInt("no_faktur")+1;
                String pjg = String.valueOf(no);
                int a = pjg.length();
                if(a ==1 ){
                    tfkode.setText(pre+"-000"+pjg);
                }else if(a==2){
                    tfkode.setText(pre+"-00"+pjg);
                }else if(a==3){
                    tfkode.setText(pre+"-0"+pjg);
                }else if(a==4){
                    tfkode.setText(pre+"-"+pjg);
                }
            }else{
                PreparedStatement pd = conec.prepareStatement("insert into faktur (faktur, no_faktur) values('CL','0')");
                pd.executeUpdate();
                System.out.println("Simpan berhasil");
                tfkode.setText(pre+"-0001");
            }
            System.out.println(tfkode.getText().substring(0,tfkode.getText().length()-5));
        } catch (SQLException ex) {
            Logger.getLogger(customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void update_faktur() {
        String sql = "update faktur set no_faktur=no_faktur+1 where faktur=?";
        try {
            PreparedStatement st = conec.prepareStatement(sql);
            st.setString(1, tfkode.getText().substring(0,tfkode.getText().length()-5));
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
