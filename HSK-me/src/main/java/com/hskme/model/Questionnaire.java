package com.hskme.model;
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

/**
 * 
 */

/**
 * @author Maxime
 *
 */
public class Questionnaire implements Runnable{

	/**
	 * @param args
	 */
        @XmlElement(name="entree")
        private List<Entree> entree;
        
	private final EventListenerList listeners ;
        
	public Questionnaire(){
		listeners = new EventListenerList();
                entree = new ArrayList<Entree>();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

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
        
//	public void setQuestion(int nb, Dictionnaire dico, String from, String to){
//		List<Entree> serieold = this.getEntree();
//		int ancienb = this.nbquest;
//		this.nbquest = nb;
//		this.state = true ;
//                String question="",solution="";
//		for (int i =0 ; i<nb ; i++){
//                        if(from.equals("caractere")) {
//                            question=dico.getVocab(i).getCaractere();
//                            if(to.equals("pinyin")) solution=dico.getVocab(i).getPinyin();
//                            else if(to.equals("francais")) solution=dico.getVocab(i).getTraduction();
//                        } else if(from.equals("pinyin")) {
//                            question=dico.getVocab(i).getPinyin();
//                            if(to.equals("caractere")) solution=dico.getVocab(i).getCaractere();
//                            else if(to.equals("francais")) solution=dico.getVocab(i).getTraduction();
//                        } else if(from.equals("francais")) {
//                            question=dico.getVocab(i).getTraduction();
//                            if(to.equals("caractere")) solution=dico.getVocab(i).getCaractere();
//                            else if(to.equals("pinyin")) solution=dico.getVocab(i).getPinyin();
//                        }
//			this.serie.add(new Question(question, solution));
//		}
//		QuestionEvent q = new QuestionEvent(serieold,this.serie);
//		System.out.println("DEBUG : Questionnaire rempli, nombre questions : " + this.serie.size()) ;
//		
//		fireListQuestionChange(q);
//		fireNbQuestionChange(ancienb, this.nbquest);
//	}
        
        public QuestionListener[] getQuestionListeners() {
            return listeners.getListeners(QuestionListener.class);
        }
//
//	public Question getQuestion(int i){
//			return serie.get(i);
//	}
//        
//        public List<Question> getSerie() {
//            return serie;
//        }
//	
//	public String getSolution(int i){
//		return serie.get(i).getSolution() ;
//	}
//
//	public void setSolution(int i, String solution){
//		serie.get(i).setSolution(solution) ;
//	}
//
//	public String getReponse(int i){
//		return serie.get(i).getReponse() ;
//	}
//
//	public void setReponse(int i, String reponse){
//		String reponseold = this.serie.get(i).getReponse();
//		//on verifie si la reponse est bonne ou pas
//		serie.get(i).setReponse(reponse) ;
//		if ( serie.get(i).getReponse().equals(serie.get(i).getSolution()) ){
//			serie.get(i).setValid(true) ;
//		} else serie.get(i).setValid(false);
//		
//		fireReponseQuestionChange(reponseold,serie.get(i).getReponse());
//	}
//	
//        public void addQuestionListener(QuestionListener listener) {
//            listeners.add(QuestionListener.class, listener);
//        }
//
//        public void removeQuestionListener(QuestionListener listener) {
//            listeners.remove(QuestionListener.class, listener);
//        }
//	
	private void fireReponseQuestionChange(String reponseold, String reponse) {
		// TODO Auto-generated method stub
        for(QuestionListener listener : getQuestionListeners()) {
            listener.reponseQuestionChange(reponseold, reponse);
        }		
	}
	
	private void fireNbQuestionChange(int ancienb, int nouvnb) {
		// TODO Auto-generated method stub
        for(QuestionListener listener : getQuestionListeners()) {
            listener.nbQuestionChange(ancienb, nouvnb);
        }
	}

	private void fireListQuestionChange(QuestionEvent q) {
		// TODO Auto-generated method stub
        for(QuestionListener listener : getQuestionListeners()) {
            listener.listQuestionChange(q);
        }
	}
//
//	public void clearSerie(){
//		serie.clear() ;
//	}
//
//	public String askQuestion(int i){
//		try {
//			return serie.get(i).getQuestion();
//		}catch (IndexOutOfBoundsException e) { return null ; }
//	}	

    /**
     * @return the entree
     */
    public List<Entree> getEntree() {
        return entree;
    }

    /**
     * @param entree the entree to set
     */
    public void setEntree(List<Entree> entree) {
        this.entree = entree;
    }
    
//    public void initQuestionnaire(int nb, Dictionnaire dico, String from, String to){
//        for (int i =0 ; i<nb ; i++){
//                Entree nouvelleEntree = new Entree();
//                if(from.equals("caractere")) {
//                    nouvelleEntree.getQuestion().setQuestion(dico.getVocab(i).getSinogramme());
//                    if(to.equals("pinyin")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getPinyin());
//                    } else if (to.equals("francais")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getTraduction()); 
//                    }
//                } else if(from.equals("pinyin")) {
//                    nouvelleEntree.getQuestion().setQuestion(dico.getVocab(i).getPinyin());
//                    if(to.equals("caractere")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getSinogramme());
//                    } else if(to.equals("francais")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getTraduction()); 
//                    }
//                } else if(from.equals("francais")) {
//                    nouvelleEntree.getQuestion().setQuestion(dico.getVocab(i).getTraduction());
//                    if(to.equals("caractere")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getSinogramme());
//                    } else if(to.equals("pinyin")) {
//                        nouvelleEntree.getQuestion().setSolution(dico.getVocab(i).getPinyin());
//                    }
//                }
//                this.entree.add(nouvelleEntree);
//        }
//    }
    
}
