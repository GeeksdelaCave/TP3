package fr.univ_amu.iut.tp3.exo2;

import java.time.LocalDate;

public class CD extends Document {
    private String titre;

    public CD(String titre) {
        super();
        this.titre = titre;
    }

    @Override
    public String toString() {
        if (getDateRetour() == null)
            return "[CD] " + titre + " -- disponible";
        else if (getDateRetour().isAfter(LocalDate.now()))
            return "[CD] " + titre + " -- disponible";
        else
            return "[CD] " + titre + " -- " + getDateRetour();
    }
}
