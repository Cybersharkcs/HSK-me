package com.hskme.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Maxime
 *	
 */
@XmlType(name="Question", propOrder={"answered","solution","question"})
@XmlRootElement(name="entree")
@XmlAccessorType(XmlAccessType.FIELD)
public class Question {
	@XmlAttribute(required=true)
        private boolean answered ;
        @XmlAttribute(required=true)
	private String solution ;
        @XmlValue
        private String question;
        
        public Question(){
            
        }
        
	public Question(String question, String solution){
		this.question = question;
                this.solution = solution;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public boolean isAnswered() {
		return answered;
	}

	public void setAnswered(boolean answered) {
		this.answered = answered;
	}
	
}
