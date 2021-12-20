package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.exceptions.BadRequestException;
import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.mapper.CardMapper;
import com.ibm.academia.apirest.models.dtos.CardDTO;
import com.ibm.academia.apirest.models.entities.Passion;
import com.ibm.academia.apirest.repositories.PassionRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.rmi.NotBoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PassionDaoImp implements PassionDao{
    private  PassionRepository passionRepository;

    @Autowired
    public PassionDaoImp(PassionRepository passionRepository){
        this.passionRepository=passionRepository;
    }


    @Override
    public List<CardDTO> getCards(String passion, int salary, int age) {
        if(  salary<0 || age<18 )
            throw new BadRequestException(HttpStatus.BAD_REQUEST, "Datos incorrectos");

        Optional<Passion> pass=passionRepository.findPassion(passion,salary,age);
        if(pass.isPresent())
        {
            Passion p=pass.get();
            List<CardDTO> cards=p.getCards().stream().map(card -> CardMapper.cardDTO(card)).collect(Collectors.toList());
            return cards;
        }else
        {
            throw new NotFoundException(HttpStatus.NOT_FOUND,"No existe ninguna tarjeta asociada con la informacion proporcionada");
        }
    }
}
