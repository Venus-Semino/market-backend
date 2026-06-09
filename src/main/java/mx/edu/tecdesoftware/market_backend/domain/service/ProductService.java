package mx.edu.tecdesoftware.market_backend.domain.service;

import mx.edu.tecdesoftware.market_backend.domain.Product;
import mx.edu.tecdesoftware.market_backend.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //llamar a sus seis métodos

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        // verificar que existe antes de borrar los if siempre van en el servicio
        if(getProduct(productId).isPresent()){
            productRepository.delete(productId);
        }{
            return false;
        }
    }
}
