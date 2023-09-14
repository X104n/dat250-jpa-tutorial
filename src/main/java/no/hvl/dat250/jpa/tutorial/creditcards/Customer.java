package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private Collection<Address> addresses = new ArrayList<>();
    @ManyToMany
    private Collection<CreditCard> creditCards = new ArrayList<>();

    public Customer(){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        addresses.add(address);
    }

    public Collection<Address> getAddresses() {
        return this.addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }
}
