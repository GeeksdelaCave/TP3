package fr.univ_amu.iut.tp3.exo1;

public abstract class Traducteur {

    public abstract String traduire(ExpressionComposee expressionComposee);
    public abstract String traduire(Nombre nombre);

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
