/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class DynamicDemoBean {
private String state;
private String branch;
private String productLine;
private String item;
private long itemCode;
private long quantity;
private float amount;
private String remarks;

public DynamicDemoBean(float amount, String branch, long itemCode,
String item, String line, long quantity, String state, String remarks) {
super();
this.amount = amount;
this.branch = branch;
this.itemCode = itemCode;
this.item = item;
productLine = line;
this.quantity = quantity;
this.state = state;
this.remarks = remarks;
}

public float getAmount() {
return amount;
}
public void setAmount(float amount) {
this.amount = amount;
}
public String getBranch() {
return branch;
}
public void setBranch(String branch) {
this.branch = branch;
}
public String getItem() {
return item;
}
public void setItem(String item) {
this.item = item;
}
public long getItemCode() {
return itemCode;
}
public void setItemCode(long itemCode) {
this.itemCode = itemCode;
}
public String getProductLine() {
return productLine;
}
public void setProductLine(String productLine) {
this.productLine = productLine;
}
public long getQuantity() {
return quantity;
}
public void setQuantity(long quantity) {
this.quantity = quantity;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}

public String getRemarks() {
return remarks;
}

public void setRemarks(String remarks) {
this.remarks = remarks;
}

}