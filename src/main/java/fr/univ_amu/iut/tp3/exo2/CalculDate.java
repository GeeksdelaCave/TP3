package fr.univ_amu.iut.tp3.exo2;

import java.time.LocalDate;

public class CalculDate {

    /**
     * Ajoute le nombre de jours passé en paramètre à la date du jour
     * @param jours nombre de jours à ajouter
     * @return La date courante ajoutée au nombre de jours
     */
    public static LocalDate ajouter(int jours) {
        return LocalDate.now().plusDays(jours);
    }

}
