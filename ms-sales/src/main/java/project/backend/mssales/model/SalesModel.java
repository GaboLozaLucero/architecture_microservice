package project.backend.mssales.model;

import java.util.Date;

public class SalesModel {
    private int invoice_id;
    private int product_id;
    private int client_id;
    private Date date;

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SalesModel() {
        super();
        // TODO Auto-generated constructor stub
    }
}
