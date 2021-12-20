package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.data.DummyData;
import com.ibm.academia.apirest.exceptions.BadRequestException;
import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.models.dtos.CardDTO;
import com.ibm.academia.apirest.models.entities.Card;
import com.ibm.academia.apirest.models.entities.Passion;
import com.ibm.academia.apirest.repositories.PassionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PassionDaoImpTest {

    PassionRepository passionRepository;
    PassionDaoImp passionDao;


    @BeforeEach
    void setup(){
        passionRepository=mock(PassionRepository.class);
        passionDao=new PassionDaoImp(passionRepository);
    }



    /**
     * Metodo para probar que  PassionDao detecta correctamente las excepciones cuando no se
     * encuentra una pasion valida
     * Regresa True si se lanzo una NotFoundException
     */
    @Test
    @DisplayName("Test: Para corroborar la exception de que una pasion no existe en la base de datos")
    void notFoundExceptionTest() {
        String name="Sales";
        int salary=7500;
        int age=20;
        Optional<Passion> passionExpected=Optional.empty();
        when(passionRepository.findPassion(name, salary, age))
                .thenReturn(passionExpected);
         assertThrows(NotFoundException.class, () -> passionDao.getCards(name,salary,age));

    }

    /**
     * Metodo para probar que  PassionDao detecta correctamente las excepciones cuando se le proporcionan
     * datos incorrectos
     * Regresa True si se lanzo una BadRequestException
     */
    @Test
    @DisplayName("Test: Para corroborar la exception de los datos recibidos por el cliente son erroneos")
    void badRequestExceptionTest() {
        String name="Sales";
        int salary=-7500;
        int age=-20;
        Optional<Passion> passionExpected=Optional.empty();
        when(passionRepository.findPassion(name, salary, age))
                .thenReturn(passionExpected);
        assertThrows(BadRequestException.class, () -> passionDao.getCards(name,salary,age));

    }

    /**
     * Metodo para probar que  PassionDao  hace correctamente una  consulta  a la base de
     * de datos para obtener una  lista de tarjetas y regresarlas mapeadas
     * Regresa True si la lista de tarjetas obtenida no es vacia
     */
    @Test
    @DisplayName("Test: Para corroborar que se obtiene y se mapean una serie de tarjetas")
    void CardListTest() {
        String name="Sales";
        int salary=7500;
        int age=20;
        Passion expected=DummyData.passion2();
        Optional<Passion> passionExpected=Optional.of(expected);
        when(passionRepository.findPassion(name, salary, age))
                .thenReturn(passionExpected);

        List<CardDTO> expetedCards = passionDao.getCards(name,salary,age);

        assertThat(expetedCards.isEmpty()).isFalse();

    }

}
