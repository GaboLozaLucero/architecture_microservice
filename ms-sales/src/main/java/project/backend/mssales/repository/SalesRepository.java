package project.backend.mssales.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import project.backend.mssales.dto.SalesDto;
import project.backend.mssales.entity.Sales;

import java.util.List;

public interface SalesRepository extends CrudRepository<Sales, Integer> {
    @Query( "select new project.backend.mssales.dto.SalesDto(a.name,a.lastname, b.name_product, b.price, c.date ) " +
            "from Client a, Product b, Sales  c " +
            "where a.id_client=c.id_client and c.id_product=b.id_product ")
    List<SalesDto> GetSale();
}
