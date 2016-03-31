/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ika
 */
public class ProductOBJ {
    private String kode;
    private String nama;
    private String act_price;
    private String deal_price;

    public ProductOBJ(String kode, String nama, String act_price, String deal_price) {
        this.kode = kode;
        this.nama = nama;
        this.act_price = act_price;
        this.deal_price = deal_price;
    }

    public ProductOBJ() {
    }

    public String getDeal_price() {
        return deal_price;
    }

    public String getAct_price() {
        return act_price;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void setDeal_price(String deal_price) {
        this.deal_price = deal_price;
    }

    public void setAct_price(String act_price) {
        this.act_price = act_price;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
