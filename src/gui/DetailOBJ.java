/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author subki
 */
public class DetailOBJ {
    private String itemno;
    private String nama;
    private String unit;
    private String aktual;
    private String jual;

    public DetailOBJ() {
    }

    public DetailOBJ(String itemno, String nama, String unit, String aktual, String jual) {
        this.itemno = itemno;
        this.nama = nama;
        this.unit = unit;
        this.aktual = aktual;
        this.jual = jual;
    }

    public void setJual(String jual) {
        this.jual = jual;
    }

    public String getJual() {
        return jual;
    }

    public void setAktual(String aktual) {
        this.aktual = aktual;
    }

    public String getAktual() {
        return aktual;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
    
    
}
