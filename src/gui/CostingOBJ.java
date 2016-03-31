/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author subki
 */
public class CostingOBJ {
    private String offer;
    private String project_name;
    private String customer;
    private String sales;
    private String prepare;
    private String tgl;

    public CostingOBJ() {
    }

    public CostingOBJ(String offer, String project_name, String customer, String sales, String prepare, String tgl) {
        this.offer = offer;
        this.project_name = project_name;
        this.customer = customer;
        this.sales = sales;
        this.prepare = prepare;
        this.tgl = tgl;
    }

    public String getCustomer() {
        return customer;
    }

    public String getOffer() {
        return offer;
    }

    public String getPrepare() {
        return prepare;
    }

    public String getProject_name() {
        return project_name;
    }

    public String getSales() {
        return sales;
    }

    public String getTgl() {
        return tgl;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
}
