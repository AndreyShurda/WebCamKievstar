package com.kievstar.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Address implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String city;

    private String street;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "address_sms",
//            joinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "sms_id", referencedColumnName = "id"))
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
    private Set<SMS> smses = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
    private WebCamera webCamera;

    public Address() {
    }

    public Address(String city, String street, WebCamera webCamera) {
        this.city = city;
        this.street = street;
        this.webCamera = webCamera;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Set<SMS> getSmses() {
        return smses;
    }

    public void setSmses(Set<SMS> smses) {
        this.smses = smses;
    }

    public WebCamera getWebCamera() {
        return webCamera;
    }

    public void setWebCamera(WebCamera webCamera) {
        this.webCamera = webCamera;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return street != null ? street.equals(address.street) : address.street == null;

    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
