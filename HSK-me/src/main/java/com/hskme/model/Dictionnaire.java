package com.hskme.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXB;

import org.springframework.stereotype.Component;

import com.hskme.dto.CaractereDto;
import com.hskme.dto.DictionnaireDto;

/**
 * @author Maxime
 *
 */
@Component("dico")
public class Dictionnaire {
	private List<Caractere> listCaractere;
	
	public Dictionnaire(){
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
//			this.getListCaractere().add(new Caractere(bf[0],bf[1],bf[2]));
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
		Iterator<Caractere> it = getListCaractere().iterator();
		while(it.hasNext()){
			Caractere obj = it.next();
			System.out.println(obj.getPinyin());
		}
	}
	
	public int getVocabSize(){
		return getListCaractere().size() ;
	}
	
	public Caractere getVocabAlea(){
		int i = (int) ( Math.random() * getListCaractere().size() ) ;
		return getListCaractere().get(i) ;
	}

	public Caractere getVocab (int i){
		return getListCaractere().get(i) ;
	}
        
	public void clearListCaractere(){
		getListCaractere().clear() ;
	}

    /**
     * @return the dictionnaire
     */
    public List<Caractere> getListCaractere() {
        return listCaractere;
    }

    /**
     * @param dictionnaire the dictionnaire to set
     */
    public void setListCaractere(List<Caractere> dictionnaire) {
        this.listCaractere = dictionnaire;
    }
}
