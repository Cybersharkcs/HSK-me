package com.hskme.dto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

/**
 * @author Maxime
 *
 */
@XmlType(name="DictionnaireDto", propOrder={"listCaractere"})
@XmlRootElement(name="dictionnaire")
@XmlAccessorType(XmlAccessType.FIELD)
@Component("dictionnaireDto")
public class DictionnaireDto {
	@XmlElement(name="caractere")
	private List<CaractereDto> listCaractere;
	
	public DictionnaireDto(){
		//Ajout de donnees test pour remplir le fichier xml
		listCaractere = new ArrayList<CaractereDto>();
//        CaractereDto caraDto = new CaractereDto();
////        caraDto.setCategorie("categorie");
//        caraDto.setPinyin("pinyin");
//        caraDto.setSinogramme("sino");
//        List<String> traductions = new ArrayList<>();
//        traductions.add("traduction1");
//        traductions.add("traduction2");
//        caraDto.setTraduction(traductions);
//        listCaractere.add(caraDto);
	}
	
    public DictionnaireDto(CaractereDto caradto){
    	listCaractere = new ArrayList<CaractereDto>();
        listCaractere.add(caradto);
    }

    public static DictionnaireDto unmarshallDictionnaire(){
    	//TODO modifier le chemin
        return JAXB.unmarshal(new File("/root/NetBeansProjects/HSK-me/HSK-me/dictionnaire.xml"), DictionnaireDto.class);
    }
    
    public void marshallDictionnaire(File file){
        JAXB.marshal(this, file);
    }
    
    /**
	 * Deprecated
	 */
	public void loadVocab(File file, String categorie) throws IOException{
               String line = " " ;
		String[] bf = new String[3] ;
		FileReader fr = new FileReader(file) ;
		BufferedReader bfr = new BufferedReader (fr) ;
		while( (line = bfr.readLine()) != null ){
			//System.out.println("DEBUG loadVocab String line: " + line) ;
			bf = line.split(",") ;
			System.out.println("DEBUG loadVocab String[] bf 0 : " + bf[0] + " 1 : " + bf[1] + " 2 : " + bf[2]) ;
			this.getListCaractere().add(new CaractereDto(categorie, bf[0],bf[1],bf[2]));
		}
		bfr.close();
               Collections.shuffle(getListCaractere());
		//Collections.sort(vocab); //vocab sorted by pinyin
		//System.out.println("DEBUG : Dico " + categorie + " cree, nombre entrees : ") ;
	}
    
    /**
     * @return the dictionnaire
     */
    public List<CaractereDto> getListCaractere() {
        return listCaractere;
    }

    /**
     * @param dictionnaire the dictionnaire to set
     */
    public void setListCaractere(List<CaractereDto> dictionnaire) {
        this.listCaractere = dictionnaire;
    }
}
