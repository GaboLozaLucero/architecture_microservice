package project.backend.mssales.dto;

import java.util.Date;

public class SalesDto {
    public String client_name;
    public String name_product;
    public double price;
    public Date date;

    public SalesDto(String client_name, String name_product, double price, Date date) {
        this.client_name = client_name;
        this.name_product = name_product;
        this.price = price;
        this.date = date;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalesDto{" +
                "client_name='" + client_name + '\'' +
                ", name_product='" + name_product + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
