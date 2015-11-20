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
public class Reptil extends Animal {
    protected boolean tipus_reproduccio;
    protected boolean potes;
    int setPotes;
    int setTipus_reproduccio;
    int setCodi_cuidador;
    String setSexe;
    String setDieta;
    String setMedi;
    int setCodi_animal;
    
    /**
    * 
    * Per insertar el tipus de reproducció on: ovípars = 1 ovovivípars = 0
    */
    public Reptil (int codi_animal, char medi, char dieta, boolean sexe, char codi_veterinari, char codi_cuidador){
        this.tipus_reproduccio = tipus_reproduccio;
        this.potes = potes;
        this.codi_animal = codi_animal;
        this.medi = medi;
        this.dieta = dieta;
        this.sexe = sexe;
        this.codi_veterinari = codi_veterinari;
        this.codi_cuidador = codi_cuidador;
    }

    Reptil() {
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
    
    public void setCodi_veterinari(float codi_veterinari) {
        this.codi_veterinari = codi_veterinari;
    }
    /**
    * 
    * Per insetar el nom del cuidador
    */
    public float getCodi_cuidador() {
        return codi_cuidador;
    }

    public void setCodi_cuidador(float codi_cuidador) {
        this.codi_cuidador = codi_cuidador;
    }

    public boolean isTipus_reproduccio() {
        return tipus_reproduccio;
    }

    public void setTipus_reproduccio(boolean tipus_reproduccio) {
        this.tipus_reproduccio = tipus_reproduccio;
    }
    /**
     *
     * Per insertar el número de potes on: amb potes = 1 sense potes = 0 
     */
    public boolean isPotes() {
        return potes;
    }

    public void setPotes(boolean potes) {
        this.potes = potes;
    }
    
    
}