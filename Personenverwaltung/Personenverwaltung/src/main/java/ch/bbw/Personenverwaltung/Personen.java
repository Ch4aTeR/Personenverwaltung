package ch.bbw.Personenverwaltung;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personen {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        private int id;
        private String vorname;
        private String nachname;
        private String email;
    private int age;
    private String gender;

    public Personen(int id, String vorname, String nachname) {
    }

    public Personen() {

    }
}
