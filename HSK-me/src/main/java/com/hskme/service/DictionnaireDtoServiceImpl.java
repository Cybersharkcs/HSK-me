package com.hskme.service;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hskme.dto.DictionnaireDto;

@Service("dictionnaireDtoServiceImpl")
public class DictionnaireDtoServiceImpl implements DictionnaireDtoService{

   DictionnaireDto dicoDto = new DictionnaireDto();
   
   @Override
   public DictionnaireDto unmarshallDictionnaire(){
       return dicoDto.unmarshallDictionnaire();
   }
   
   @Override
   public void marshallDictionnaire(File file){
       dicoDto.marshallDictionnaire(file);
   }
}
