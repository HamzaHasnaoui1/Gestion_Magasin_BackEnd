package org.example.gestion_magasin.mappers;

import org.example.gestion_magasin.dtos.ProduitsDto;
import org.example.gestion_magasin.entities.Produits;
import org.mapstruct.Mapper;

@Mapper
public interface ProduitsMapper {
    ProduitsDto produitsToProduitsDto(Produits produits);
    Produits produitsDtoToProduits(ProduitsDto produitsDto);
}
