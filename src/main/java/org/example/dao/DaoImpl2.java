package org.example.dao;

/**
 * Deuxième implémentation de l'interface IDao.
 * Simule une récupération de données depuis une autre source (ex : capteur).
 */
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        // Simule une lecture depuis un capteur ou une autre source
        System.out.println("[DAO2] Récupération de la valeur depuis un capteur...");
        return 50;
    }
}