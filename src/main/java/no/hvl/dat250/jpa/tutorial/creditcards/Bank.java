package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private Collection<CreditCard> creditCards = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public Collection<CreditCard> getOwnedCards() {
        return creditCards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }
}
