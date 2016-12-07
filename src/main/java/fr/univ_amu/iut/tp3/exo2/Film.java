package fr.univ_amu.iut.tp3.exo2;

import java.time.LocalDate;

public class Film extends Document {
    private String titre;

    public Film(String titre) {
        super();
        this.titre = titre;
    }

    @Override
    public String toString() {
        if (getDateRetour() == null)
            return "[FILM] " + titre + " -- disponible";
        else if (getDateRetour().isAfter(LocalDate.now()))
            return "[FILM] " + titre + " -- disponible";
        else
            return "[FILM] " + titre + " -- " + getDateRetour();
    }
}
