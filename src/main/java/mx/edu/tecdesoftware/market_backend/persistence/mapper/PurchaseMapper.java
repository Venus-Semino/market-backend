package mx.edu.tecdesoftware.market_backend.persistence.mapper;

import mx.edu.tecdesoftware.market_backend.domain.Purchase;
import mx.edu.tecdesoftware.market_backend.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "purchaseId"),
            @Mapping(source = "idCliente", target = "customerId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "payment"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "active")

    })
    Purchase toPurchase(Purchase purchase);
    List<Purchase> toPurchases(List<Purchase> purchases);

}
