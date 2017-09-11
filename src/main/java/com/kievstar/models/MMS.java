package com.kievstar.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class MMS implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL, mappedBy = "mms")
//    private Set<WebCamera> webCameras;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "mms_webCam",
//            joinColumns = { @JoinColumn(name = "id") },
//            inverseJoinColumns = { @JoinColumn(name = "id") })
//    private List<WebCamera> webCameras = new ArrayList<>();


    @ManyToOne
    private Subscriber subscriber;

    public MMS() {
    }

    public MMS(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

        MMS mms = (MMS) o;

        return subscriber != null ? subscriber.equals(mms.subscriber) : mms.subscriber == null;

    }

    @Override
    public int hashCode() {
        return subscriber != null ? subscriber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MMS{" +
                "id=" + id +
                ", subscriber=" + subscriber +
                '}';
    }
}
