package br.com.cotemig.bandsapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String bandName;

    @Column(nullable = false, length = 50)
    private String musicName;

    public Band() {
    }

    public Band(String bandName, String musicName) {
        this.bandName = bandName;
        this.musicName = musicName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Band band = (Band) o;
        return Objects.equals(id, band.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
