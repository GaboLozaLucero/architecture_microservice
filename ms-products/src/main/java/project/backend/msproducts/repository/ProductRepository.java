package project.backend.msproducts.repository;


import org.springframework.data.repository.CrudRepository;
import project.backend.msproducts.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
