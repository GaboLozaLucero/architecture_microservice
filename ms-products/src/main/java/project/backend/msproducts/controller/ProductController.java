package project.backend.msproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.backend.msproducts.entity.Product;
import project.backend.msproducts.service.ProductService;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> SearchProducts() {

        return productService.SearchProducts();
    }

    //AGREGAR UN NUEVO PRODUCTO
    @PostMapping
    public Product saveProduct(@RequestBody Product product) throws ServerException {
        System.out.println(product);
        productService.save(product);
        if (product == null) {
            throw new ServerException(null);
        } else {
            return product;
        }
    }


    //ELIMINAR PRODUCTO EXISTENTE
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
    }


    //OBTENER UN PRODUCTO POR ID
    @GetMapping("/{id}")
    public Optional<Product> getByProductId(
            @PathVariable Integer id) {
        return productService.SearchProduct(id);
    }
    //ACTUALIZAR PRODUCT
    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

}
