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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksi.koneksi;

/**
 *
 * @author subki
 */
public class DetailCosting extends javax.swing.JDialog {

    private CostingOBJ data;
    Connection conec;
    public DetailCosting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conec = new koneksi().connection();
        setLocationRelativeTo(this);
        createtable();
    }

    public CostingOBJ getData() {
        return data;
    }

    public void setData(CostingOBJ data) {
        this.data = data;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR FULL COST MODEL (FCM)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PT. SUMBER SURYA MANDIRI");

        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("*) Klik untuk mengambil data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyReleased
        createtable();
    }//GEN-LAST:event_tfsearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        data = new CostingOBJ();
        TableModel a = jTable1.getModel();
        data.setOffer(a.getValueAt(jTable1.getSelectedRow(), 0).toString());
        data.setProject_name(a.getValueAt(jTable1.getSelectedRow(), 1).toString());
        this.setVisible(false);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DetailCosting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailCosting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailCosting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailCosting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailCosting dialog = new DetailCosting(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables

    private void createtable() {
        String sql = "SELECT * FROM fcm "
                + " where offer_no like ? "
                + " or project_name like ? "
                + "ORDER BY offer_no";
        DefaultTableModel a = new DefaultTableModel();
        a.addColumn("Quo. No");
        a.addColumn("Project Name");
        a.addColumn("Sales");
        a.addColumn("Prepared");
        a.addColumn("Date");  
        jTable1.setModel(a);
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, "%"+tfsearch.getText()+"%");
            ps.setString(2, "%"+tfsearch.getText()+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                String cust = rs.getString("customer");
                String nama_customer = cari_customer(cust);
                
                String petugas1 = rs.getString("sales_engine");
                String nama_sales = cari_petugas(petugas1);
                String petugas2 = rs.getString("prepare_by");
                String nama_pre = cari_petugas(petugas2);
                
                a.addRow(new Object[]{
                    rs.getString("offer_no"),
                    rs.getString("project_name"),
                    nama_customer,
                    nama_sales,
                    nama_pre,
                    rs.getString("tgl")
                });
                new AturKolom(jTable1);
                System.out.println("Tabel Customer Sukses");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tabel Customer Gagal");
        }
    }
    private String cari_customer(String cust) {
        String sql = "select * from customer where id=?";
        String nama = null;
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, cust);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nama = rs.getString("nama");
                return nama;
            }else{
                nama = cust;
                return nama;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailCosting.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nama);
        return nama;
    }

    private String cari_petugas(String petugas1) {
        String sql = "select * from petugas where nik=?";
        String nama = null;
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, petugas1);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nama = rs.getString("nama");
                return nama;
            }else{
                nama = petugas1;
                return nama;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailCosting.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nama);
        return nama;
    }
}
