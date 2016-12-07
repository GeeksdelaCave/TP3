package fr.univ_amu.iut.tp3.exo1;

public class Nombre extends Expression {
    private int nombre;

    public Nombre(int nombre) {
        this.nombre = nombre;
    }

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
