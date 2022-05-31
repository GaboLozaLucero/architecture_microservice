package project.backend.mssales.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sale")
public class Sales {
    @Id
    @Column(columnDefinition = "serial")
    private int id_sale;
    private int id_product;
    private int id_client;
    private Date date;

    public Sales(){
        super();
    }

    public Sales(int id_sale, int id_product, int id_client, Date date) {
        this.id_sale = id_sale;
        this.id_product = id_product;
        this.id_client = id_client;
        this.date = date;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
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
                "id_sale=" + id_sale +
                ", id_product=" + id_product +
                ", id_client=" + id_client +
                ", date=" + date +
                '}';
    }
}
