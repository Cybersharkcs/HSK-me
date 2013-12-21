package com.hskme.dto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.EventListenerList;
import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;

import com.hskme.model.Entree;
import com.hskme.model.Questionnaire;

@XmlType(name="QuestionnaireDto", propOrder={"entree"})
@XmlRootElement(name="questionnaire")
@XmlAccessorType(XmlAccessType.FIELD)
@Component("questionnaireDto")
public class QuestionnaireDto {
	/**
	* @param args
	*/
    @XmlElement(name="entree")
    private List<Entree> entree;
        
	public QuestionnaireDto(){
		entree = new ArrayList<Entree>();
	}
	
    public static Questionnaire unmarshallQuestionnaire(){
    	return JAXB.unmarshal(new File("questionnaire.xml"), Questionnaire.class);
    }
        
    /**
	* Sauvegarde un questionnaire
	*/
    public void marshallQuestionnaire(File file){
    	JAXB.marshal(this, file);
    }
}
