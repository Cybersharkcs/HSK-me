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

/**
 * @author Maxime
 *
 */
@XmlType(name="DictionnaireDto", propOrder={"listCaractere"})
@XmlRootElement(name="dictionnaire")
@XmlAccessorType(XmlAccessType.FIELD)
public class DictionnaireDto {
	@XmlElement(name="caractere")
	private List<CaractereDto> listCaractere;
	
	public DictionnaireDto(){
	}
	
    public DictionnaireDto(CaractereDto caradto){
    	listCaractere = new ArrayList<CaractereDto>();
        listCaractere.add(caradto);
    }
    
    public static DictionnaireDto unmarshallDictionnaire(){
        return JAXB.unmarshal(new File("dictionnaire.xml"), DictionnaireDto.class);
    }
    
    public void marshallDictionnaire(File file){
        JAXB.marshal(this, file);
    }
        
        /**
	 * Deprecated
	 */
	public void loadVocab(File file) throws IOException{
                String line = " " ;
		String[] bf = new String[3] ;
		FileReader fr = new FileReader(file) ;
		BufferedReader bfr = new BufferedReader (fr) ;
		while( (line = bfr.readLine()) != null ){
			//System.out.println("DEBUG loadVocab String line: " + line) ;
			bf = line.split(",") ;
			//System.out.println("DEBUG loadVocab String[] bf 0 : " + bf[0] + " 1 : " + bf[1] + " 2 : " + bf[2]) ;
			this.getListCaractere().add(new CaractereDto(bf[0],bf[1],bf[2]));
		}
		bfr.close();
                Collections.shuffle(getListCaractere());
		//Collections.sort(vocab); //vocab sorted by pinyin
		System.out.println("DEBUG : Dico hsk2 cree, nombre entrees : " + this.getVocabSize()) ;
	}
	
	public void searchVocab(String pinyin){
		Arrays.binarySearch(getListCaractere().toArray(), pinyin);
	}

	public void afficheVocab(){
		Iterator<CaractereDto> it = getListCaractere().iterator();
		while(it.hasNext()){
			CaractereDto obj = it.next();
			System.out.println(obj.getPinyin());
		}
	}
	
	public int getVocabSize(){
		return getListCaractere().size() ;
	}
	
	public CaractereDto getVocabAlea(){
		int i = (int) ( Math.random() * getListCaractere().size() ) ;
		return getListCaractere().get(i) ;
	}

	public CaractereDto getVocab (int i){
		return getListCaractere().get(i) ;
	}
        
	public void clearListCaractere(){
		getListCaractere().clear() ;
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
