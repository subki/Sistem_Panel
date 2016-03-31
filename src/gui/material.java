/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.EventObject;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JExcelApiExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author subki
 */
public class material extends javax.swing.JFrame {

    Connection conec;
    public material() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Data Material");
        this.setIconImage(new ImageIcon(getClass().getResource("/image/ssm.png")).getImage());conec = new koneksi().connection();
        createtable();
        auto_refresh();
        jButton1.setIcon(new ImageIcon(getClass().getResource("/image/plussign8.png")));
        jButton2.setIcon(new ImageIcon(getClass().getResource("/image/letterx.png")));
        jButton3.setIcon(new ImageIcon(getClass().getResource("/image/printer70.png")));
        jButton4.setIcon(new ImageIcon(getClass().getResource("/image/app1.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new style.Images();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMaterial = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA MATERIAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PT. SUMBER SURYA MANDIRI");

        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchKeyReleased(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelMaterial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelMaterial);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        materialform frm = new materialform(null, true);
        frm.getTfitemno().setText("");
        frm.getTfnama().setText("");
        frm.getTftipe().setText("");
        frm.getTfbrand().setText("");
        frm.getTadeskrip().setText("");
        frm.getTfaktual().setText("");
        frm.getTfjual().setText("");
        frm.getCbunit().setSelectedIndex(0);
        frm.getBtnSubmit().setText("Save");
        frm.getBtnSubmit().setIcon(new ImageIcon(getClass().getResource("/image/diskette25.png")));
        frm.getBtnCancel().setIcon(new ImageIcon(getClass().getResource("/image/door9.png")));
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyReleased
        createtable();
    }//GEN-LAST:event_tfsearchKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            koneksi kon = new koneksi();
            Connection con = kon.connection();

            Calendar kalender = new GregorianCalendar();
            int thn = kalender.get(Calendar.YEAR);
            int bln = kalender.get(Calendar.MONTH)+1;
            int tgl = kalender.get(Calendar.DATE);
            String prefix = String.valueOf(thn)+String.valueOf(bln)+String.valueOf(tgl);
            //String nama_file = no+" "+String.valueOf(prefix);

            File report = new File("c:/SSM/report/materialreport.jasper");
            JasperReport jasperReport = (JasperReport)JRLoader.loadObject(report);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, con);

            //JasperViewer.viewReport(jasperPrint,false);
            JRXlsExporter exporter= new JRXlsExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            //exporter.setParameter(JRExporterParameter.IGNORE_PAGE_MARGINS, true);
            //exporter.setParameter(JExcelApiExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);

            exporter.setParameter(JExcelApiExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
            exporter.setParameter(JExcelApiExporterParameter.IGNORE_PAGE_MARGINS,Boolean.TRUE);
            exporter.setParameter(JExcelApiExporterParameter.OFFSET_X, 0);
            exporter.setParameter(JExcelApiExporterParameter.IS_IGNORE_CELL_BORDER, Boolean.FALSE);
            exporter.setParameter(JRXlsExporterParameter.SHEET_NAMES, new String[]{"Material"});

            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "C:/SSM/print/Material "+prefix+".xls");
            
            exporter.setParameter(JExcelApiExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS, Boolean.TRUE);
            exporter.exportReport();
            
            //JOptionPane.showMessageDialog(null, "Data perhasil di print ke format Excel. \nOpen C:/SSM/print/Material "+prefix+".xls");
            int option = JOptionPane.showConfirmDialog(null, 
                        "Data berhasil di print ke format Excel. \nOpen File "+prefix+".xls?", "Export Excel", JOptionPane.YES_NO_OPTION);
                if(option==JOptionPane.YES_OPTION){
                    try {
                        Desktop.getDesktop().open(new File("C:\\SSM\\print\\Material "+prefix+".xls"));
                    } catch (IOException ex) {
                        Logger.getLogger(material.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        } catch (JRException ex) {
            Logger.getLogger(panelbox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        materialformimport f = new materialformimport(null, true);
        f.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new material().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelMaterial;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables

    private void auto_refresh() {
        Timer timer = new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                createtable();
            }
        });

        timer.setDelay(3000); // delay for 30 seconds
        timer.start();
    }

    public void createtable() {
        String sql = "SELECT * FROM component "
                + " where item_no like ? "
                + " or name like ? "
                + " or description like ? "
                + " or type like ? "
                + " or brand like ? "
                + " or unit like ? "
                + "ORDER BY item_no";
        DefaultTableModel a = new DefaultTableModel();
        a.addColumn("No");
        a.addColumn("Kode");
        a.addColumn("Nama");
        a.addColumn("Spesifikasi");
        a.addColumn("Tipe");
        a.addColumn("Merk");
        a.addColumn("Unit");
        a.addColumn("Aktual");
        a.addColumn("Jual");
        a.addColumn("Action");  
        tabelMaterial.setModel(a);
        int no = 1;
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, "%"+tfsearch.getText()+"%");
            ps.setString(2, "%"+tfsearch.getText()+"%");
            ps.setString(3, "%"+tfsearch.getText()+"%");
            ps.setString(4, "%"+tfsearch.getText()+"%");
            ps.setString(5, "%"+tfsearch.getText()+"%");
            ps.setString(6, "%"+tfsearch.getText()+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                a.addRow(new Object[]{
                    no,
                    rs.getString("item_no"),
                    rs.getString("name"),
                    rs.getString("description"),
                    rs.getString("type"),
                    rs.getString("brand"),
                    rs.getString("unit"),
                    rs.getString("aktual"),
                    rs.getString("jual"),
                    ""
                });
                no += 1;
                TableColumn kolom = tabelMaterial.getColumn("Action");
                kolom.setCellRenderer(new ButtonsRenderer());
                kolom.setCellEditor(new ButtonsEditor(tabelMaterial));
//                
//                int rows = tabelCutomer.getRowHeight();
//                tabelCutomer.setRowHeight(30);
                System.out.println("Tabel Customer Sukses");
            }
            new AturKolom(tabelMaterial);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tabel Customer Gagal");
        }
    }
    
    class ButtonsPanel extends JPanel{
        List <JButton> buttons = Arrays.asList(
                new JButton("", new ImageIcon(getClass().getResource("/image/delete5.png"))), 
                new JButton("", new ImageIcon(getClass().getResource("/image/pencil117.png")))
                //new JButton("", new ImageIcon(getClass().getResource("/image/printer70.png")))
                );
        public ButtonsPanel(){
            super();
            setOpaque(true);
            for(JButton b : buttons){
                b.setFocusable(false);
                b.setRolloverEnabled(false);
                add(b);
            }
        }
    }
    
    class ButtonsRenderer extends ButtonsPanel implements TableCellRenderer{

        public ButtonsRenderer(){
            super();
            setName("Table.cellRenderer");
        }
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int col) {
            setBackground(isSelected?table.getSelectionBackground():table.getBackground());
            return this;
        }
    }
    
    class ButtonsEditor extends ButtonsPanel implements TableCellEditor {
        protected transient ChangeEvent changeEvent;
        private final JTable table;
        private class EditingStopHandler extends MouseAdapter implements ActionListener {
            @Override public void mousePressed(MouseEvent e) {
                Object o = e.getSource();
                if (o instanceof TableCellEditor) {
                    actionPerformed(null);
                } else if (o instanceof JButton) {
                    //DEBUG: view button click -> control key down + edit button(same cell) press -> remain selection color
                    ButtonModel m = ((JButton) e.getComponent()).getModel();
                    if (m.isPressed() && table.isRowSelected(table.getEditingRow()) && e.isControlDown()) {
                        setBackground(table.getBackground());
                    }
                }
            }
            @Override public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override public void run() {
                        fireEditingStopped();
                    }
                });
            }
        }
        public ButtonsEditor(JTable table) {
            super();
            this.table = table;
            buttons.get(0).setAction(new DeleteAction(table));
            buttons.get(1).setAction(new EditAction(table));
            //buttons.get(2).setAction(new PrintAction(table));

            EditingStopHandler handler = new EditingStopHandler();
            for (JButton b: buttons) {
                b.addMouseListener(handler);
                b.addActionListener(handler);
            }
            addMouseListener(handler);
        }
        @Override public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.setBackground(table.getSelectionBackground());
            return this;
        }
        @Override public Object getCellEditorValue() {
            return "";
        }

        //Copied from AbstractCellEditor
        //protected EventListenerList listenerList = new EventListenerList();
        //protected transient ChangeEvent changeEvent;
        @Override public boolean isCellEditable(EventObject e) {
            return true;
        }
        @Override public boolean shouldSelectCell(EventObject anEvent) {
            return true;
        }
        @Override public boolean stopCellEditing() {
            fireEditingStopped();
            return true;
        }
        @Override public void cancelCellEditing() {
            fireEditingCanceled();
        }
        @Override public void addCellEditorListener(CellEditorListener l) {
            listenerList.add(CellEditorListener.class, l);
        }
        @Override public void removeCellEditorListener(CellEditorListener l) {
            listenerList.remove(CellEditorListener.class, l);
        }
        public CellEditorListener[] getCellEditorListeners() {
            return listenerList.getListeners(CellEditorListener.class);
        }
        protected void fireEditingStopped() {
            // Guaranteed to return a non-null array
            Object[] listeners = listenerList.getListenerList();
            // Process the listeners last to first, notifying
            // those that are interested in this event
            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == CellEditorListener.class) {
                    // Lazily create the event:
                   //if (Objects.isNull(changeEvent)) {
                    if (Objects.equals(i, changeEvent)) {
                        changeEvent = new ChangeEvent(this);
                    }
                    ((CellEditorListener) listeners[i + 1]).editingStopped(changeEvent);
                }
            }
        }
        protected void fireEditingCanceled() {
            // Guaranteed to return a non-null array
            Object[] listeners = listenerList.getListenerList();
            // Process the listeners last to first, notifying
            // those that are interested in this event
            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == CellEditorListener.class) {
                    // Lazily create the event:
                    if (Objects.equals(i, changeEvent)) {
//                    if (Objects.isNull(changeEvent)) {
                        changeEvent = new ChangeEvent(this);
                    }
                    ((CellEditorListener) listeners[i + 1]).editingCanceled(changeEvent);
                }
            }
        }
    }
    
    
    class DeleteAction extends AbstractAction {
        private final JTable table;
        public DeleteAction(JTable table) {
            super("del");
            this.table = table;
        }
        @Override 
        public void actionPerformed(ActionEvent e) {
            int baris = tabelMaterial.getSelectedRow();
            int kolom = tabelMaterial.getSelectedColumn();
            String data = tabelMaterial.getValueAt(baris, kolom).toString();
            String id = tabelMaterial.getValueAt(baris, 1).toString();
            String d = tabelMaterial.getValueAt(baris, 2).toString();
            
            int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Yakin untuk menghapus data Material \n"+d, 
                                  "Hapus Data", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) { 
                delete(id);
            }
        }

        private void delete(String id) {
            String sql = "Delete from component where item_no=?";
            PreparedStatement ps;
            try {
                ps = conec.prepareStatement(sql);
                ps.setString(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                createtable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(tabelMaterial, "Terjadi kesalahan : "+ex);
            }
        }
    }

    class EditAction extends AbstractAction {
        private final JTable table;
        public EditAction(JTable table) {
            super("edt");
            this.table = table;
        }
        @Override 
        public void actionPerformed(ActionEvent e) {
            int row = table.convertRowIndexToModel(table.getEditingRow());
            Object o = table.getModel().getValueAt(row, 0);
            
            int baris = tabelMaterial.getSelectedRow();
            int kolom = tabelMaterial.getSelectedColumn();
            String data = tabelMaterial.getValueAt(baris, kolom).toString();
            String no = tabelMaterial.getValueAt(baris, 1).toString();
            String nama = tabelMaterial.getValueAt(baris, 2).toString();
            String deskrip = tabelMaterial.getValueAt(baris, 3).toString();
            String tipe = tabelMaterial.getValueAt(baris, 4).toString();
            String merk = tabelMaterial.getValueAt(baris, 5).toString();
            String unit = tabelMaterial.getValueAt(baris, 6).toString();
            String act = tabelMaterial.getValueAt(baris, 7).toString();
            String jual = tabelMaterial.getValueAt(baris, 8).toString();
            
            materialform frm = new materialform(null, true);
            frm.getTfitemno().setText(no);
            frm.getTfnama().setText(nama);
            frm.getTadeskrip().setText(deskrip);
            frm.getTftipe().setText(tipe);
            frm.getTfbrand().setText(merk);
            frm.getCbunit().setSelectedItem(unit);
            frm.getTfaktual().setText(act);
            frm.getTfjual().setText(jual);
            frm.getBtnSubmit().setText("Update");
            frm.getBtnSubmit().setIcon(new ImageIcon(getClass().getResource("/image/refresh65.png")));
            frm.getBtnCancel().setIcon(new ImageIcon(getClass().getResource("/image/door9.png")));
            frm.setVisible(true);
            System.out.println(no);
            
        }
    }
}