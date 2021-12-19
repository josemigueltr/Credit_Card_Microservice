package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.models.dtos.CardDTO;
import com.ibm.academia.apirest.models.entities.Passion;

import java.util.List;

public interface PassionDao
{
    public List<CardDTO> getCards(String passion, int salary, int age);
}
