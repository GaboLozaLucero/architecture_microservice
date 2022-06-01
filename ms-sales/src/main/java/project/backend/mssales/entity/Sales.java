package project.backend.mssales.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Sales {
    @Id
    @Column(columnDefinition = "serial")
    private int invoice_id;
    private int product_id;
    private int client_id;
    private Date date;

    public Sales(){
        super();
    }

    public Sales(int invoice_id, int product_id, int client_id, Date date) {
        this.invoice_id = invoice_id;
        this.product_id = product_id;
        this.client_id = client_id;
        this.date = date;
    }

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

    @Override
    public String toString() {
        return "Sales{" +
                "invoice_id=" + invoice_id +
                ", product_id=" + product_id +
                ", client_id=" + client_id +
                ", date=" + date +
                '}';
    }
}
