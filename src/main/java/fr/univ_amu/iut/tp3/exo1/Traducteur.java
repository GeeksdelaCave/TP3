package fr.univ_amu.iut.tp3.exo1;

public abstract class Traducteur {

    /**
     * Traduit l'expression
     * @param expressionComposee expression à traduire
     * @return L'expression traduite
     */
    public abstract String traduire(ExpressionComposee expressionComposee);

    /**
     * Traduit un chiffre
     * @param nombre chiffre à traduire
     * @return Le chiffre traduit
     */
    public abstract String traduire(Nombre nombre);

    /**
     * Traduit une expression, sélectionne par la suite s'il s'agit d'un chiffre ou d'un nombre
     * @param expression expression à traduire, ExpressionComposee ou Nombre
     * @return L'expression à traduire
     */
    public String traduire(Expression expression) {

        /* Si c'est un Nombre */
        if (expression.getClass() == Nombre.class)
            return traduire((Nombre) expression);

        /* Si c'est une expression composée */
        else if (expression.getClass() == ExpressionComposee.class)
            return traduire((ExpressionComposee) expression);

        /* Si ce n'est pas un objet "prévu" */
        else
            throw new IllegalArgumentException("Cet objet n'est pas traduisable.");
    }

}
