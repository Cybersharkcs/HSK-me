package com.hskme.testService;

import java.io.File;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.hskme.dto.DictionnaireDto;
import com.hskme.service.DictionnaireDtoService;
import com.hskme.service.DictionnaireDtoServiceImpl;

@Component("dictionnaireDtoServiceTest")
public class DictionnaireDtoServiceTest {
//	@Resource(name="dictionnaireDtoServiceImpl")
	private DictionnaireDtoServiceImpl dictionnaireDtoServiceImpl;
    
	private static ApplicationContext ctx;
	
	public DictionnaireDtoServiceTest() {
		ctx = new ClassPathXmlApplicationContext("spring-context-services.cfg.xml");
		dictionnaireDtoServiceImpl = (DictionnaireDtoServiceImpl) ctx.getBean("dictionnaireDtoServiceImpl");
	}

	@Test
    public void testUnmarshallingDictionnaire(){
        DictionnaireDto dictionnaire = dictionnaireDtoServiceImpl.unmarshallDictionnaire();
        Assert.assertNotNull("dictionnaire non null", dictionnaire);
        Assert.assertNotNull("dictionnaire non vide", dictionnaire.getListCaractere());
        System.out.println(dictionnaire.getListCaractere().size());
//        System.out.println(dictionnaire.getListCaractere().get(0).getSinogramme());
////        System.out.println(dictionnaire.getListCaractere().get(0).getCategorie());
//        System.out.println(dictionnaire.getListCaractere().get(0).getPinyin());
//        System.out.println(dictionnaire.getListCaractere().get(0).getTraduction());
    }
    
    @Test
    public void testMarshallingDictionnaire() {
        File file = new File("test_dictionnaire.xml");
        dictionnaireDtoServiceImpl.marshallDictionnaire(file);
        Assert.assertNotNull("Le fichier a été crée", file.exists());
    }
    
    @Test
    public void testLoadVocab() {
    	File file = new File("test_dictionnaire.xml");
        dictionnaireDtoServiceImpl.loadVocab(new File("hsk2"), "HSK2");
        dictionnaireDtoServiceImpl.loadVocab(new File("hsk3"), "HSK3");
        dictionnaireDtoServiceImpl.marshallDictionnaire(file);
        Assert.assertNotNull("Le fichier a été crée", file.exists());
    }
    
}
