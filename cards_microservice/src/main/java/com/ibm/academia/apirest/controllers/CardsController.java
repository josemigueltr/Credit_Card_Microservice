package com.ibm.academia.apirest.controllers;

import com.ibm.academia.apirest.exceptions.ExceptionType;
import com.ibm.academia.apirest.models.dtos.CardDTO;
import com.ibm.academia.apirest.services.PassionDao;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/cards")
public class CardsController {

@Autowired
PassionDao passionDao;

    /**
     * Endpoint para obtener información sobre las tarjetas recomendadas a un cliente
     * @param passion pasion del cliente
     *@param salary salario del cliente
     *@param age edad del cliente
     * @return Retorna un objeto con todas las tarjetas a las que el cliente podria optar
     */
    @ApiOperation(value = "View a list of available products", response = CardDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Satisfactorio se regresa la lista de tarjetas recomendadas"),
            @ApiResponse(code = 400, message = "Los datos proporcionados son incorrectos"),
            @ApiResponse(code = 404, message = "El recurso solicitado no fue encontrado, no existe")
    }
    )
    @GetMapping("/{passion}/{salary}/{age}")
    public ResponseEntity<?> getCards(@PathVariable String passion,
                                                 @PathVariable Integer salary,
                                                 @PathVariable Integer age) {
        log.info("RECIBIDA LA SIGUIENTE INFORMACION --> PASSION:{} SALARY:{} AGE:{}",passion,salary,age);
        try {
            List<CardDTO> cards= passionDao.getCards(passion, salary, age);
            log.info("RESPUESTA ENVIADA --> RESPUESTA: {}", cards);
            return new ResponseEntity<>(cards, HttpStatus.OK);
        }catch(ExceptionType e){

            log.info("EXCEPCION OCURRIDA --> MENSAJE:{} , STATUS:{}", e.getMessage(),e.getStatus());
            throw  e;
        }
    }
}
