package mx.edu.tecdesoftware.market_backend.persistence.mapper;

import mx.edu.tecdesoftware.market_backend.domain.PurchaseItem;
import mx.edu.tecdesoftware.market_backend.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PurchaseMapper.class, ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "")
    })
}
