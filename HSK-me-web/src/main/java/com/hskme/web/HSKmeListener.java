/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.hskme.model.RandomNum;

/**
 *
 * @author root
 */
public class HSKmeListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent event) {
        RandomNum randomNum = new RandomNum();
        event.getServletContext().setAttribute("randomb", randomNum);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        
    }
    
}
