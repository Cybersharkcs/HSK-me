package com.hskme.dto;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dic", propOrder = {
    "listWord"
})
public class DicDto {
	@XmlElement(name = "word")
	private List<WordDto> listWord;
	
    public DicDto() {
    	
	}

	public List<WordDto> getListWord() {
		return listWord;
	}

	public void setListWord(List<WordDto> listWord) {
		this.listWord = listWord;
	}

	public static DicDto unmarshallDictionnaire(){
    	//TODO modifier le chemin
        return JAXB.unmarshal(new File("/root/NetBeansProjects/HSK-me/HSK-me/cfdict.xml"), DicDto.class);
    }
	
}
