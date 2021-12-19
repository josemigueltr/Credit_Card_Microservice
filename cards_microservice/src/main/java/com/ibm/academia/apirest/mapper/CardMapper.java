package com.ibm.academia.apirest.mapper;

import com.ibm.academia.apirest.models.dtos.CardDTO;
import com.ibm.academia.apirest.models.entities.Card;

public class CardMapper {
    /**
     * Metodo para mappear obtetos de tipo card a cardDTO
     * @param card  tarjeta que se va mappear
     * @return Retorna un DTO de una tarjeta que se mandará como respuesta al cliente
     */
    public static CardDTO cardDTO (Card card){
        CardDTO cDTO= new CardDTO();
        cDTO.setTarjetaID(card.getCardId());
        cDTO.setNombreTarjeta(card.getName());
        return cDTO;
    }
}
