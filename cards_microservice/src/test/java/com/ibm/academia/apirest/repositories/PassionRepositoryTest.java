package com.ibm.academia.apirest.repositories;

import com.ibm.academia.apirest.data.DummyData;
import com.ibm.academia.apirest.models.entities.Card;
import com.ibm.academia.apirest.models.entities.Passion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.and;

@DataJpaTest
public class PassionRepositoryTest {

    @Autowired
    PassionRepository passionRepository;

    /**
     * Metodo para probar que  PassionRepository  hace correctamente una  consulta  a la base de
     * de datos para buscar una pasion
     * Regresa True si la pasion obtenida es igual a la esperada
     */
    @Test
    @DisplayName("Test: Obtener una pasion valida dados ciertos parametros")
    void findPassion(){
        String name="Shopping";
        int salary=7500;
        int age=20;
        Optional<Passion> p= passionRepository.findPassion(name,salary,age);
        assertThat(p.isPresent()).isTrue();
        assertThat(p.get().equals(DummyData.passion1())).isTrue();
    }



    /**
     * Metodo para probar que  PassionRepository  hace correctamente una  consulta  a la base de
     * de datos para buscar una pasion y obtener su lista de tarjetas
     * Regresa True si la lista de tarjetas obtenida es igual a la lista de tarjetas esperada
     */
    @Test
    @DisplayName("Test: Obtener tarjetas validas")
    void findTargets(){

        String name="Sports";
        int salary=20000;
        int age=50;
        List<Card> expected=DummyData.slotCards1();
        Optional<Passion> p= passionRepository.findPassion(name,salary,age);
        assertThat(p.isPresent()).isTrue();
        List<Card> cardList= new ArrayList<>(p.get().getCards());
        cardList.forEach(card ->
        {   assertThat(expected.contains(card)).isTrue();});
    }


}
