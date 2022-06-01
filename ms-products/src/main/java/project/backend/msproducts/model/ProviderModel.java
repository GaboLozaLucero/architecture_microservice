package project.backend.msproducts.model;

public class ProviderModel {

    private int provider_id;
    private String provider_name;

    public ProviderModel(int provider_id, String provider_name) {
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
}
