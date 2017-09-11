package com.kievstar.models;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
public class Image implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    private byte[] image;

    private transient String base64;

    @ManyToOne
    private WebCamera webCamera;

    public String getBase64() {
        return this.base64 = Base64.encode(this.image);
    }

    public void setBase64(String base64) {
        this.base64 = base64;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

        Image image1 = (Image) o;

        if (dateTime != null ? !dateTime.equals(image1.dateTime) : image1.dateTime != null) return false;
        return Arrays.equals(image, image1.image);

    }

    @Override
    public int hashCode() {
        int result = dateTime != null ? dateTime.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
