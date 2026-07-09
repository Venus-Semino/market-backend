package mx.edu.tecdesoftware.market_backend.domain.repository;

import mx.edu.tecdesoftware.market_backend.domain.PurchaseItem;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseItemRepository extends CrudRepository<PurchaseItem, Long> {

    //lista de comptras
    List<PurchaseItem> findByCompra(Compra compra);
    Optional<PurchaseItem> findById(Long id);


}
