package fr.univ_amu.iut.tp3.exo1;

public class TraducteurEN extends Traducteur {

    public String traduire(ExpressionComposee expressionComposee) {

        switch (expressionComposee.getOperande()) {
            case '+':
                return "(" + traduire(expressionComposee.getFg()) + " plus " + traduire(expressionComposee.getFd()) + ")";
            case '-':
                return "(" + traduire(expressionComposee.getFg()) + " minus " + traduire(expressionComposee.getFd()) + ")";
            case '*':
                return "(" + traduire(expressionComposee.getFg()) + " times " + traduire(expressionComposee.getFd()) + ")";
            case '/':
                return "(" + traduire(expressionComposee.getFg()) + " divided by " + traduire(expressionComposee.getFd()) + ")";
        }
        throw new IllegalArgumentException("Signe d'opération non-existant.");
    }

    public String traduire(Nombre nombre) {
        switch (nombre.getNombre()) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        throw new IllegalArgumentException("L'argument n'est pas un chiffre.");
    }
}
