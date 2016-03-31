/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author subki
 */
public class CustomerOBJ {
    private String id;
    private String nama;
    private String alamat;
    private String telepon;
    private String fax;
    private String pic1;
    private String pic2;

    public CustomerOBJ() {
    }

    public CustomerOBJ(String id, String nama, String alamat, String telepon, String fax, String pic1, String pic2) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.fax = fax;
        this.pic1 = pic1;
        this.pic2 = pic2;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getFax() {
        return fax;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPic1() {
        return pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    
}
