package mx.edu.tecdesoftware.market_backend.persistence.crud;

import mx.edu.tecdesoftware.market_backend.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<Compra> findByIdCliente(String idCliente);
}