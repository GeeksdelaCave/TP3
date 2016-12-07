package fr.univ_amu.iut.tp3.exo2;

import java.time.LocalDate;

public class Document {
    private LocalDate dateRetour;

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
        System.out.println("Date modifiée");
    }
}
