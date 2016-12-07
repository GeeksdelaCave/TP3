package fr.univ_amu.iut.tp3.exo2;

import java.time.LocalDate;

public class Livre extends Document {
    private String titre;

    public Livre(String titre) {
        super();
        this.titre = titre;
    }

    @Override
    public String toString() {
        if (getDateRetour() == null)
            return "[LIVRE] " + titre + " -- disponible";
        else if (getDateRetour().isBefore(LocalDate.now()))
            return "[LIVRE] " + titre + " -- disponible";
        else
            return "[LIVRE] " + titre + " -- " + getDateRetour();
    }
}
