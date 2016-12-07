package fr.univ_amu.iut.tp3.exo1;

public class ExpressionComposee extends Expression {

    private Expression fg, fd;
    private char operande;

    /**
     * Constructeur d'expression composée d'une expression composée ou un nombre, une opérande, et une autre expression composée ou autre nombre.
     * @param fg opérande de gauche
     * @param fd opérande de droite
     * @param operande opérateur
     */
    public ExpressionComposee(Expression fg, Expression fd, char operande) {
        this.fg = fg;
        this.fd = fd;
        this.operande = operande;
    }

    /**
     * Méthode retournant le résultat de l'expression composée actuelle. Effectue le calcul entre ses deux opérandes avec le résultat des deux.
     * @return Retourne le résultat de l'expression composée (et de ses opérandes).
     */
    public int calculer() {
        switch (operande) {

            case '+':
                return fg.calculer() + fd.calculer();
            case '-':
                return fg.calculer() - fd.calculer();
            case '*':
                return fg.calculer() * fd.calculer();
            case '/':
                if (fd.calculer() == 0) throw new IllegalArgumentException("Diviseur égal 0.");
                return fg.calculer() / fd.calculer();
        }
        throw new IllegalArgumentException("Signe d'opération non-existant.");
    }

    @Override
    public String toString() {
        return "(" + fg + operande + fd + ")";
    }

    public char getOperande() {
        return operande;
    }

    public Expression getFg() {
        return fg;
    }

    public Expression getFd() {
        return fd;
    }
}
