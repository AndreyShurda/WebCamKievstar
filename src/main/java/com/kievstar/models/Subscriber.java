package com.kievstar.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subscriber  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, mappedBy = "subscriber")
    private List<SMS> smsList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, mappedBy = "subscriber")
    private List<MMS> mmsList = new ArrayList<>();

    public Subscriber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<SMS> getSmsList() {
        return smsList;
    }

    public void setSmsList(List<SMS> smsList) {
        this.smsList = smsList;
    }

    public List<MMS> getMmsList() {
        return mmsList;
    }

    public void setMmsList(List<MMS> mmsList) {
        this.mmsList = mmsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber that = (Subscriber) o;

        return phoneNumber != null ? phoneNumber.equals(this.phoneNumber) : this.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        return phoneNumber != null ? phoneNumber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
//                ", smsList=" + smsList +
//                ", mmsList=" + mmsList +
                '}';
    }
}
