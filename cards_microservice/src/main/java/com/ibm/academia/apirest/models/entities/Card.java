package com.ibm.academia.apirest.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name="Card")
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;

    @NotNull(message="El nombre de la tarjeta no puede ser nulo")
    @Column(name = "name")
    private String name;

    @Column(name = "date_update")
    @CreationTimestamp
    private Date dateUpdate;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @ManyToMany(mappedBy = "cards",fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Set<Passion> passions = new HashSet<>();

    @PrePersist
    private  void preCreated(){
        this.dateCreated=new Date();
    }

    @PreUpdate
    private  void preUpdate(){
        this.dateUpdate=new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
