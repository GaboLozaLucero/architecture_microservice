package project.backend.msproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.backend.msproducts.entity.Product;
import project.backend.msproducts.entity.Provider;
import project.backend.msproducts.service.ProductService;
import project.backend.msproducts.service.ProviderService;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    //	OBTENER TODOS LOS PROVEEDORES
    @GetMapping
    public List<Provider> SearchProducts() {

        return providerService.SearchProvider();
    }

    //AGREGAR UN NUEVO PROVEEDOR
    @PostMapping
    public Provider saveProduct(@RequestBody Provider provider) throws ServerException {
        System.out.println(provider);
        providerService.save(provider);
        if (provider == null) {
            throw new ServerException(null);
        } else {
            return provider;
        }
    }


    //ELIMINAR PROVEEDOR EXISTENTE
    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable("id") int id) {
        providerService.deleteProvider(id);
    }


    //OBTENER UN PROVEEDOR
    @GetMapping("/{id}")
    public Optional<Provider> getByProductId(
            @PathVariable Integer id) {
        return providerService.SearchProvider(id);
    }
    //ACTUALIZAR PRODUCT
    @PutMapping
    public void updateProvider(@RequestBody Provider provider) {
        providerService.updateProvider(provider);
    }

}
