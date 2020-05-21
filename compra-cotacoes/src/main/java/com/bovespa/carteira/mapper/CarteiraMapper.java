package com.bovespa.carteira.mapper;

import com.bovespa.carteira.model.CarteiraSaida;
import com.bovespa.compra.model.CompraEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarteiraMapper {

    CarteiraMapper INSTANCE = Mappers.getMapper(CarteiraMapper.class);

    @Mappings({
            @Mapping(source = "wallet", target = "wallet")
    })
    CarteiraSaida entityParaSaida(Double total_money, Double total_quotes, List<CompraEntity> wallet);
}
