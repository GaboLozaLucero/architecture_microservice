package project.backend.mssales.dto;

import java.util.Date;

public class SalesDto {
    public String name;
    public String lastname;
    public String name_product;

    public double price;
    public Date date;

    public SalesDto(String name, String lastname, String name_product, double price, Date date) {
        this.name = name;
        this.lastname = lastname;
        this.name_product = name_product;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name_product='" + name_product + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
