package project.backend.msproducts.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "providers")
public class Provider{
    @Id
    @Column(columnDefinition = "serial")

    private int provider_id;
    private String provider_name;

    public Provider(){
        super();
    }

    public Provider(int provider_id, String provider_name) {
        this.provider_id = provider_id;
        this.provider_name = provider_name;
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "provider_id=" + provider_id +
                ", provider_name='" + provider_name + '\'' +
                '}';
    }
}
