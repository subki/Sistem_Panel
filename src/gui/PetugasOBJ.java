/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author subki
 */
public class PetugasOBJ {
    private String id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    private String jenkel;
    private String tempat_lahir;
    private String tgl_lahir;
    private String agama;

    public PetugasOBJ() {
    }

    public PetugasOBJ(String id, String nama, String alamat, String telepon, String email, String jenkel, String tempat_lahir, String tgl_lahir, String agama) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
        this.jenkel = jenkel;
        this.tempat_lahir = tempat_lahir;
        this.tgl_lahir = tgl_lahir;
        this.agama = agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAgama() {
        return agama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }
    
}
