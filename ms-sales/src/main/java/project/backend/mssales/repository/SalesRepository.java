package project.backend.mssales.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import project.backend.mssales.dto.SalesDto;
import project.backend.mssales.entity.Sales;

import java.util.List;

public interface SalesRepository extends CrudRepository<Sales, Integer> {
    @Query( "select new project.backend.mssales.dto.SalesDto(a.client_name, b.product_name, b.price, c.date ) " +
            "from Client a, Product b, Sales  c " +
            "where a.client_id=c.client_id and c.product_id=b.product_id ")
    List<SalesDto> GetSale();
}
