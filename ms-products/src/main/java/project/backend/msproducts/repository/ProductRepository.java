package project.backend.msproducts.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import project.backend.msproducts.entity.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
