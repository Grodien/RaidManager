package ch.spg.raidmanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Thomas Bomatter
 */
@Entity
public class Raidmember {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String klasse;
    private String role;

    private Raidmember() {
    }

    public Raidmember(String name, String klasse, String role) {
        this.name = name;
        this.klasse = klasse;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}