package com.ibm.academia.apirest.data;

import com.ibm.academia.apirest.models.entities.Card;
import com.ibm.academia.apirest.models.entities.Passion;

import java.util.HashSet;
import java.util.List;

public  class DummyData {

    public static Passion passion1(){
        return new Passion(null,"Shopping",23,18,14999,7000,null,null,null);
    }

    public static Passion passion2(){
        return new Passion(null,"Shopping",75,18,34999,7000,null,null, new HashSet<Card>(slotCards1()));
    }
    public static List<Card> slotCards1(){
            List<Card> cards =List.of(
                new Card(null,"América Deporteismo",null,null,null),
                    new Card(null,"Marti Clasica Citibanamex",null,null,null),
                    new Card(null,"Pumas Deporteismo",null,null,null),
                    new Card(null,"Toluca Deporteismo",null,null,null),
                    new Card(null,"La verde Deporteismo",null,null,null)

            );

            return  cards;
    }


}
