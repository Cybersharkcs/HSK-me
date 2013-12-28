/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hskme.testService;

import com.hskme.dto.DictionnaireDto;
import com.hskme.model.Dictionnaire;
import com.hskme.service.DictionnaireService;
import com.hskme.service.DictionnaireServiceImpl;

import java.io.File;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/**
 *
 * @author root
 */
@Component("dictionnaireServiceTest")
public class DictionnaireServiceTest {
    @Resource(name="dictionnaireServiceImpl")
    private DictionnaireService dictionnaireService ;
    private static ApplicationContext ctx;
    
	public DictionnaireServiceTest() {
		ctx = new ClassPathXmlApplicationContext("spring-context-services.cfg.xml");
    	dictionnaireService = (DictionnaireServiceImpl) ctx.getBean("dictionnaireServiceImpl");
		
	}
    

    
    public DictionnaireService getDictionnaireService() {
		return dictionnaireService;
	}

	public void setDictionnaireService(DictionnaireServiceImpl dictionnaireService) {
		this.dictionnaireService = dictionnaireService;
	}
    
}
