/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessionRest;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author abinash
 */
@Path("/exceptionrest")
@Stateless
@LocalBean
public class ExceptionRestful {
    
    @PUT
    @Path("/insert")    
    public String putExceprion(@PathParam("topic") final String topic)
    {
        return topic;
    }
    
    @GET
    @Path("/show")    
    public String showException()
    {
        return "Show Called";
    }
}
