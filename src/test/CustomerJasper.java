/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.ImageBanner;
import ar.com.fdvs.dj.domain.Style;
import ar.com.fdvs.dj.domain.builders.ColumnBuilder;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import ar.com.fdvs.dj.domain.constants.Border;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.constants.HorizontalAlign;
import ar.com.fdvs.dj.domain.constants.Transparency;
import ar.com.fdvs.dj.domain.constants.VerticalAlign;
import ar.com.fdvs.dj.domain.entities.columns.AbstractColumn;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JExcelApiExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;

/**
 *
 * @author ika
 */
public class CustomerJasper {

    public static void main(String[] args) {

try{
//build report
JasperPrint jp = buildReport();

//export report
JExcelApiExporter exporter = new JExcelApiExporter();

exporter.setParameter(JExcelApiExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);

exporter.setParameter(JExcelApiExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
exporter.setParameter(JExcelApiExporterParameter.JASPER_PRINT, jp);
exporter.setParameter(JExcelApiExporterParameter.OUTPUT_FILE_NAME, "F:/dynamicDemos.xls");
exporter.setParameter(JExcelApiExporterParameter.IGNORE_PAGE_MARGINS,
Boolean.TRUE);
exporter.setParameter(JExcelApiExporterParameter.OFFSET_X, 0);
exporter.setParameter(JExcelApiExporterParameter.IS_IGNORE_CELL_BORDER, Boolean.FALSE);
exporter.setParameter(JRXlsExporterParameter.SHEET_NAMES, new String[]{"November"});
exporter.exportReport();

}catch(JRException je){
je.printStackTrace();
}catch(ColumnBuilderException ce){
ce.printStackTrace();
}catch(ClassNotFoundException cfe){
cfe.printStackTrace();
}

}

private static JasperPrint buildReport() throws ColumnBuilderException, JRException, ClassNotFoundException{
Style headerStyle = getHeaderStyle();
Style detailStyle = new Style();
detailStyle.setBorder(Border.THIN());

//build first report
FastReportBuilder firstReport = getFirstReport(headerStyle, detailStyle);
DynamicReport firstDynaRep = firstReport.build();

//build second report
//FastReportBuilder secondReport = getSecondReport(headerStyle, detailStyle);
//DynamicReport secondDynaRep = secondReport.build();

//Prepare data
//Object[] obj = new Object[3];
//
//obj[0]= new DynamicDemoBean(100.00f, "San Jose", 200, "Tojo", "Vintage 2000", 50, "CA", "Tojo is a finer veriety of wine produced from the California wine yards. It has been produced to the industy standards. Tojo is a finer veriety of wine produced from the California wine yards. It has been produced to the industy standards.");
//
//obj[1]= new DynamicDemoBean(110f, "San Jose", 120, "Spinster", "Vintage 2000", 50, "CA", "Spinster is a finer veriety of wine produced from the California wine yards. It has been produced to the industy standards.");
//
//obj[2]= new DynamicDemoBean(120.00f, "Down Town", 220, "Royal", "Vintage 2000", 50, "CA", "Royal is a finer veriety of wine produced from the California wine yards. It has been produced to the industy standards.");

    List<CustomerDataBean> lc = null;
    Connection conec = new koneksi().connection();
        try {
            Statement st = conec.createStatement();
            ResultSet rs = st.executeQuery("select * from customer");
            if(rs.next()){
                CustomerDataBean a = new CustomerDataBean();
                a.setId(rs.getString("id"));
                a.setNama(rs.getString("nama"));
                a.setAlamat(rs.getString("alamat"));
                a.setTelepon(rs.getString("telepon"));
                a.setFax(rs.getString("fax"));
                a.setPic1(rs.getString("pic1"));
                a.setPic2(rs.getString("pic2"));
                lc.add(a);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    Object[] lc1 = lc.toArray();


//generate jasper print dynamically
JasperPrint jp = DynamicJasperHelper.generateJasperPrint(firstDynaRep, 
        new ClassicLayoutManager(), new JRBeanArrayDataSource(lc1));

//JasperPrint jp1 = DynamicJasperHelper.generateJasperPrint(secondDynaRep, new ClassicLayoutManager(), new JRBeanArrayDataSource(obj));

//Combine pages
//List pages = new ArrayList(jp1.getPages());
//int i=1;
//for(int count=0;count<pages.size();count++){
//jp.addPage(i, (JRPrintPage)pages.get(count));
//i++;
//}
return jp;
}

private static Style getHeaderStyle(){
Style headerStyle = new Style() {};
headerStyle.setFont(Font.ARIAL_MEDIUM_BOLD);
headerStyle.setBorderBottom(Border.PEN_2_POINT());
headerStyle.setHorizontalAlign(HorizontalAlign.CENTER);
headerStyle.setVerticalAlign(VerticalAlign.MIDDLE);
headerStyle.setBackgroundColor(Color.LIGHT_GRAY);
headerStyle.setTextColor(Color.BLUE);
headerStyle.setTransparency(Transparency.OPAQUE);
return headerStyle;
}

private static AbstractColumn getColumn(String property, Class type,
String title, int width, Style headerStyle, Style detailStyle)
throws ColumnBuilderException {
AbstractColumn columnState = ColumnBuilder.getInstance()
.setColumnProperty(property, type.getName()).setTitle(
title).setWidth(Integer.valueOf(width))
.setStyle(detailStyle).setHeaderStyle(headerStyle).build();
return columnState;
}

private static FastReportBuilder getFirstReport(Style headerStyle, Style detailStyle) throws ColumnBuilderException, ClassNotFoundException{
FastReportBuilder firstReport = new FastReportBuilder();

AbstractColumn columnState = getColumn("state", String.class,
"State", 30, headerStyle, detailStyle);
AbstractColumn columnBranch = getColumn("branch", String.class,
"Branch", 30, headerStyle, detailStyle);
AbstractColumn columnProductLine = getColumn("productLine", String.class,
"Product Line", 50, headerStyle, detailStyle);
AbstractColumn columnItem = getColumn("item", String.class,
"Item", 50, headerStyle, detailStyle);
AbstractColumn columnaItemCode = getColumn("itemCode", Long.class,
"Item Code", 22, headerStyle, detailStyle);
AbstractColumn columnQuantity = getColumn("quantity", Long.class,
"Quantity", 22, headerStyle, detailStyle);
Style amountStyle = new Style();
amountStyle.setHorizontalAlign(HorizontalAlign.RIGHT);
AbstractColumn columnAmount = ColumnBuilder.getInstance()
.setColumnProperty("amount", Float.class.getName())
.setTitle("Amount").setWidth(Integer.valueOf(30))
.setStyle(amountStyle).setPattern("$ 0.00")
.setStyle(detailStyle).setHeaderStyle(headerStyle).build();

AbstractColumn remarks = getColumn("remarks", String.class,
"Remarks", 100, headerStyle, detailStyle);
firstReport.addColumn(columnState)
.addColumn(columnBranch)
.addColumn(columnProductLine)
.addColumn(columnItem)
.addColumn(columnaItemCode)
.addColumn(columnQuantity)
.addColumn(columnAmount)
.addColumn(remarks);

firstReport.addFirstPageImageBanner("F:\\SSM\\src\\image\\ssm.png", Integer.valueOf(560), Integer.valueOf(51), ImageBanner.ALIGN_LEFT);
firstReport.setTitle("November 2006 sales report");
firstReport.setSubtitle("This report was generateed at");
firstReport.setUseFullPageWidth(true); //make colums to fill the page width

return firstReport;
}

//private static FastReportBuilder getSecondReport(Style headerStyle, Style detailStyle) throws ColumnBuilderException{
//FastReportBuilder secondReport = new FastReportBuilder();
//
//AbstractColumn columnState = getColumn("state", String.class,
//"State", 30, headerStyle, detailStyle);
//AbstractColumn columnBranch = getColumn("branch", String.class,
//"Branch", 30, headerStyle, detailStyle);
//AbstractColumn columnProductLine = getColumn("productLine", String.class,
//"Product Line", 50, headerStyle, detailStyle);
//AbstractColumn columnItem = getColumn("item", String.class,
//"Item", 50, headerStyle, detailStyle);
//AbstractColumn columnaItemCode = getColumn("itemCode", Long.class,
//"Item Code", 22, headerStyle, detailStyle);
//AbstractColumn columnQuantity = getColumn("quantity", Long.class,
//"Quantity", 22, headerStyle, detailStyle);
//Style amountStyle = new Style();
//amountStyle.setHorizontalAlign(HorizontalAlign.RIGHT);
//AbstractColumn columnAmount = ColumnBuilder.getInstance()
//.setColumnProperty("amount", Float.class.getName())
//.setTitle("Amount").setWidth(Integer.valueOf(30))
//.setStyle(amountStyle).setPattern("$ 0.00")
//.setStyle(detailStyle).setHeaderStyle(headerStyle).build();
//
//AbstractColumn remarks = getColumn("remarks", String.class,
//"Remarks", 100, headerStyle, detailStyle);
//secondReport.addColumn(columnState);
//secondReport.addColumn(columnBranch);
//secondReport.addColumn(columnProductLine);
//secondReport.addColumn(columnItem);
//secondReport.addColumn(columnaItemCode);
//secondReport.addColumn(columnQuantity);
//secondReport.addColumn(columnAmount);
//secondReport.addColumn(remarks);
//
//secondReport.addFirstPageImageBanner("F:\\SSM\\src\\image\\ssm.png", Integer.valueOf(560), Integer.valueOf(51), ImageBanner.ALIGN_LEFT);
//secondReport.setTitle("December 2006 sales report");
//secondReport.setSubtitle("This report was generateed at");
//secondReport.setUseFullPageWidth(true); //make colums to fill the page width
//
//return secondReport;
//}

    

}