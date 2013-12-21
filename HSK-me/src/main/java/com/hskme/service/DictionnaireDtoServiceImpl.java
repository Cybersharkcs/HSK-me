package com.hskme.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hskme.dto.DictionnaireDto;

@Service("dictionnaireDtoServiceImpl")
public class DictionnaireDtoServiceImpl {
   @Resource(name="dictionnaireDto")
   DictionnaireDto dicoDto;
   

   public DictionnaireDto unmarshallDictionnaire(){
       return dicoDto.unmarshallDictionnaire();
   }
   

   public void marshallDictionnaire(File file){
       dicoDto.marshallDictionnaire(file);
   }
   
   public void loadVocab(File file, String categorie){
	   try {
		dicoDto.loadVocab(file, categorie);
	} catch (IOException e) {
		e.printStackTrace();
	}
	   
   }
   
}
