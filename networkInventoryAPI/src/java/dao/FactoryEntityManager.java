/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author G0042204
 */
public class FactoryEntityManager {

    static EntityManagerFactory emf;

    public static EntityManagerFactory getInstance() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("networkInventoryPU");
        }
        return emf;
    }

}
