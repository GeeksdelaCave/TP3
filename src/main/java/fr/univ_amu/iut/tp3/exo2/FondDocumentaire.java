package fr.univ_amu.iut.tp3.exo2;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FondDocumentaire {

    private static Map<String, Document> fondDocumentaire = new HashMap<String, Document>() {{
        put("LI_ORW_1", new Livre("1984"));
        put("LI_TOL_1", new Livre("Le seigneur des anneaux"));
        put("CD_STO_1", new CD("Satisfaction"));
        put("CD_BEA_1", new CD("Abbey Road"));
        put("FI_KUB_1", new Film("2001 Odyssée de l'espace"));
        put("FI_SCO_1", new Film("Taxi Driver"));
    }};

    public static void emprunter(ArrayList<Document> documents) {
        for (Document document : documents)
            document.setDateRetour(CalculDate.ajouter(15));
    }

    public static void main(String[] args) {
        ArrayList<Document> panier = new ArrayList<Document>();
        panier.add(fondDocumentaire.get("LI_ORW_1"));
        panier.add(fondDocumentaire.get("LI_TOL_1"));
        panier.add(fondDocumentaire.get("FI_KUB_1"));

        emprunter(panier);

        for (Document document : panier)
            System.out.println(document);

        System.out.println(fondDocumentaire.get("LI_ORW_1"));
    }
}
