/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.oao;

/**
 *
 * @author Oriol Alex Oriol
 */
public class Peix extends Animal {
    protected boolean esquelet;
    protected char aigua;
    int setCodi_cuidador;
    String setSexe;
    String setDieta;
    String setMedi;
    int setCodi_animal;
    String setEsquelet;
    String setAigua;
    
    /**
     * 
     * Per introduir el tipus d'esquelet del peix on: cartilaginosos = 1 ossis = 0
     * 
     * Peixos cartilaginosos, tenim per exemple, el tiburó. Ossis .per exemple, truita.
     * 
     */ 
    public Peix (int codi_animal, char medi, char dieta, boolean sexe, char codi_veterinari, char codi_cuidador){
        this.esquelet = esquelet;
        this.aigua = aigua;
        this.codi_animal = codi_animal;
        this.medi = medi;
        this.dieta = dieta;
        this.sexe = sexe;
        this.codi_veterinari = codi_veterinari;
        this.codi_cuidador = codi_cuidador;
    }

    Peix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     /**
    * 
    * Per insetar el codi de l'animal
    * */
    public int getCodi_animal() {
        return codi_animal;
    }

    public void setCodi_animal(int codi_animal) {
        this.codi_animal = codi_animal;
    }
    /**
    * 
    * Per insetar el medi de l'animal
    */
    public char getMedi() {
        return medi;
    }

    public void setMedi(char medi) {
        this.medi = medi;
    }
    /**
    * 
    * Per insetar la dieta de l'animal
    */
    public char getDieta() {
        return dieta;
    }

    public void setDieta(char dieta) {
        this.dieta = dieta;
    }
    /**
    * 
    * Per insetar el sexe on: 1 = mascle 0 = femella
    */
    public boolean getSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }
    /**
    * 
    * Per insetar el nom del veterinari
    */
    public float getCodi_veterinari() {
        return codi_veterinari;
    }
    
    public void setCodi_veterinari(char codi_veterinari) {
        this.codi_veterinari = codi_veterinari;
    }
    /**
    * 
    * Per insetar el nom del cuidador
    */
    public float getcodi_cuidador() {
        return codi_cuidador;
    }

    public void setCodi_cuidador(char codi_cuidador) {
        this.codi_cuidador = codi_cuidador;
    }
    
    public boolean getEsquelet() {
        return esquelet;
    }

    public void setEsquelet(boolean esquelet) {
        this.esquelet = esquelet;
    }
    /**
     * 
     * Per introduir el tipus d'aigua on viu on: dolça = 1 salada = 0 
     * 
     * Aigua dolça = truita salada = tiburó
     * 
     */ 
    public char getAigua() {
        return aigua;
    }

    public void setAigua(char aigua) {
        this.aigua = aigua;
    }
    
}