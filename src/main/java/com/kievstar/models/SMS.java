package com.kievstar.models;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SMS implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "smses")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "sms_address",
            joinColumns = @JoinColumn(name = "sms_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id"))
    private Set<Address> addresses = new HashSet<>();

    @ManyToOne
    private Subscriber subscriber;

    public SMS() {
    }

    public SMS(LocalDateTime dateTime, Set<Address> addresses, Subscriber subscriber) {
        this.dateTime = dateTime;
        this.addresses = addresses;
        this.subscriber = subscriber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

//    public void addAddress(Address address){
//        addresses.add(address);
//    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SMS sms = (SMS) o;

        if (dateTime != null ? !dateTime.equals(sms.dateTime) : sms.dateTime != null) return false;
        return subscriber != null ? subscriber.equals(sms.subscriber) : sms.subscriber == null;

    }

    @Override
    public int hashCode() {
        int result = dateTime != null ? dateTime.hashCode() : 0;
        result = 31 * result + (subscriber != null ? subscriber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SMS{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", addresses=" + addresses +
                ", subscriber=" + subscriber +
                '}';
    }
}
