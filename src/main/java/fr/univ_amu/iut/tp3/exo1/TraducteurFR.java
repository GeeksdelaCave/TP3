package fr.univ_amu.iut.tp3.exo1;

public class TraducteurFR extends Traducteur {

    public String traduire(ExpressionComposee expressionComposee) {

        switch (expressionComposee.getOperande()) {
            case '+':
                return " ( " + traduire(expressionComposee.getFg()) + " plus " + traduire(expressionComposee.getFd()) + " ) ";
            case '-':
                return " ( " + traduire(expressionComposee.getFg()) + " moins " + traduire(expressionComposee.getFd()) + " ) ";
            case '*':
                return " ( " + traduire(expressionComposee.getFg()) + " multiplié par " + traduire(expressionComposee.getFd()) + " ) ";
            case '/':
                return " ( " + traduire(expressionComposee.getFg()) + " divisé par " + traduire(expressionComposee.getFd()) + " ) ";
        }
        throw new IllegalArgumentException("Signe d'opération non-existant.");
    }

    public String traduire(Nombre nombre) {
        switch (nombre.getNombre()) {
            case 0:
                return "zéro";
            case 1:
                return "un";
            case 2:
                return "deux";
            case 3:
                return "trois";
            case 4:
                return "quatre";
            case 5:
                return "cinq";
            case 6:
                return "six";
            case 7:
                return "sept";
            case 8:
                return "huit";
            case 9:
                return "neuf";
        }
        throw new IllegalArgumentException("L'argument n'est pas un chiffre.");
    }
}
