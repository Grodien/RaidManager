package ch.spg.raidmanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Linus Manser
 */
@Entity
public class Raidencounter {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String difficulty;

    private Raidencounter() {
    }

    public Raidencounter(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}