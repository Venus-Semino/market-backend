package mx.edu.tecdesoftware.market_backend.persistence.crud;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // Query method
    /*
        SELECT*
        FROM categorias
        WHERE id_categoria = ?
        ORDER BY nombre ASC
     */
    //Obtener una lista de productos filtrados pr id de categoría
    // y ordenados acendentemente pro nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Obtener los productos ascasos
    Optional<List<Producto>> findByIdCantidadStocklessThanAndEStado(int cantidad, boolean estado);

}
