package mx.edu.tecdesoftware.market_backend.persistence;

import mx.edu.tecdesoftware.market_backend.domain.Product;
import mx.edu.tecdesoftware.market_backend.domain.repository.ProductRepository;
import mx.edu.tecdesoftware.market_backend.persistence.crud.ProductoCrudRepository;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Producto;
import mx.edu.tecdesoftware.market_backend.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //Le dices a spring que esta clase se comunicará con la base de datos
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper productMapper;


    //SELECT * FROM productos
    public List<Product> getAll() {
        List<Producto> productos= (List<Producto>) productoCrudRepository.findAll();
        return productMapper.toProducts(productos);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos  = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(productMapper.toProducts(productos));
    }

    public Optional<List<Product>> getScarceProducts(int quantity) {
        Optional<List<Producto>> productos= productoCrudRepository.findByCantidadStockLessThanAndEstado
                (quantity, true);
        return Optional.of(productMapper.toProducts(productos.get()));
    }

    //Obtenr un producto dado el id
    public Optional<Product> getProduct(int productId) {
         return productoCrudRepository.findById(productId)
                 .map(producto -> productMapper.toProduct(producto));
    }

    //Guardar un producto
    public Product save(Product product) {
        Producto producto= productMapper.toProducto(product);
        return productMapper.toProduct(productoCrudRepository.save(producto));
    }

    //Eliminar pro id
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }
}
