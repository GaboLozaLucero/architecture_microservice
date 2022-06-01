package project.backend.msproducts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.backend.msproducts.entity.Product;
import project.backend.msproducts.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> SearchProducts(){
        return (List<Product>) productRepository.findAll();
    }


    public void save(Product product){
        productRepository.save(product);
    }

    public void update(Product product) {
        productRepository.save(product);
    }

    public Optional<Product> SearchProduct(int id){
        return productRepository.findById(id);
    }



    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

}
