/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abinash.sessionBeans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import com.abinash.entities.ExceptionInfo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abinash
 */
@Stateless
@LocalBean
public class ExceptionRepo {

    @PersistenceContext(unitName = "ExceptionRepo-ejbPU")
    EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void addException(ExceptionInfo exInfo)
    {
        em.persist(exInfo);
    }
    
    
        
}
