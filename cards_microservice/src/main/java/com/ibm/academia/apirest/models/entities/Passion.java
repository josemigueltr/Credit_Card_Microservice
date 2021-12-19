package com.ibm.academia.apirest.models.entities;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Passion")
public class Passion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passion_id")
    private Long passion_id;

    @NotNull(message="El nombre de la pasión no puede ser nulo")
    @Column(name = "name")
    private String name;

    @NotNull(message="La edad maxima no puede ser nulo")
    @Min(value=18, message="La edad maxima no puede ser mayor a 100")
    @Column(name = "max_age")
    private int maxAge;

    @NotNull(message="La edad minima no puede ser nulo")
    @Min(value=18, message="La edad minima no puede ser menor a 18 años")
    @Column(name = "min_age")
    private int minAge;

    @NotNull(message="El salario maximo no puede ser nulo")
    @Column(name = "max_salary")
    private int maxSalary;

    @NotNull(message="El salario minima no puede ser nulo")
    @Column(name = "min_salary")
    @Min(value=1, message="El salario minimo no  puede ser menor a 0")
    private int minSalary;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "Passion_cards",
            joinColumns = {@JoinColumn(name = "passion_id")},
            inverseJoinColumns = {@JoinColumn(name = "card_id")}
    )
    private Set<Card> cards = new HashSet<>();
}
