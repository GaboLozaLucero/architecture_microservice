package project.backend.msproducts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.msproducts.entity.Provider;
import project.backend.msproducts.repository.ProviderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService{
    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> SearchProvider(){
        return (List<Provider>) providerRepository.findAll();
    }


    public void save(Provider provider){
        providerRepository.save(provider);
    }

    public void update(Provider provider) {
        providerRepository.save(provider);
    }

    public Optional<Provider> SearchProvider(int id){
        return providerRepository.findById(id);
    }

    public void deleteProvider(int id){
        providerRepository.deleteById(id);
    }

    public void updateProvider(Provider provider){
        providerRepository.save(provider);
    }

}
