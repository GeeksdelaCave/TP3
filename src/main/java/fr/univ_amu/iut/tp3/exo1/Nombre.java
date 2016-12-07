package fr.univ_amu.iut.tp3.exo1;

public class Nombre extends Expression {
    private int nombre;

    /**
     * Représentation d'un nombre permettant de retourner sa valeur grâce à getNombre() ou calculer()
     * @param nombre valeur du nombre
     */
    public Nombre(int nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter du nombre
     * @return La valeur du nombre
     */
    public int calculer() {
        return nombre;
    }

    @Override
    public String toString() {
        return "" + nombre;
    }

    public int getNombre() {
        return nombre;
    }
}
