package project.backend.mssales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(columnDefinition = "serial")
    private int id_client;
    private String name;
    private String lastname;
    private int CI;
    private int phone;
    public Client(){
        super();
    }

    public Client(int id_client, String name, String lastname, int CI, int phone) {
        this.id_client = id_client;
        this.name = name;
        this.lastname = lastname;
        this.CI = CI;
        this.phone = phone;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
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

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id_client=" + id_client +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", CI=" + CI +
                ", phone=" + phone +
                '}';
    }
}
