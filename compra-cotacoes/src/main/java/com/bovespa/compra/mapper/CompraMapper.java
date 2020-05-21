package com.bovespa.compra.mapper;

import com.bovespa.compra.integracao.CompraResponse;
import com.bovespa.compra.model.CompraEntity;
import com.bovespa.compra.model.CompraEntrada;
import com.bovespa.compra.model.CompraSaida;
import com.bovespa.compra.model.CompraSaida2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompraMapper {

    CompraMapper Instance = Mappers.getMapper(CompraMapper.class);

    @Mappings({
            @Mapping(source = "v_total", target = "v_total"),
            @Mapping(target = "id", ignore = true)
    })

    CompraEntity entradaParaEntity(CompraEntrada compraEntrada, CompraResponse compraResponse, Double v_total);
    CompraSaida entityParaSaida(CompraEntity compraEntity);
    CompraSaida2 entityParaSaida2(CompraEntity compraEntity);
}
