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
public class Artropode extends Animal {
    protected boolean venenos;
    protected boolean antenes;
    protected int numero_potes_art;
    int setCodi_cuidador;
    int setCodi_veterinari;
    String setSexe;
    String setVenenos;
    String setAntennes;
    int setNumero_potes_art;
    String setDieta;
    String setMedi;
    int setCodi_animal;

    public Artropode(int codi_animal, char medi, char dieta, boolean sexe, char codi_veterinari, char codi_cuidador) {
        this.venenos = venenos;
        this.antenes = antenes;
        this.numero_potes_art = numero_potes_art;
        this.codi_animal = codi_animal;
        this.medi = medi;
        this.dieta = dieta;
        this.sexe = sexe;
        this.codi_veterinari = codi_veterinari;
        this.codi_cuidador = codi_cuidador;
    }

    Artropode() {
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
    /**
     * 
     * Per introduir si es verinós on: Si = 1 No = 0
     *
     */ 
    public boolean isVenenos() {
        return venenos;
    }

    public void setVenenos(boolean venenos) {
        this.venenos = venenos;
    }
    /**
     * 
     * Per introduir si té antenes on: Si = 1 No = 0
     *
     */ 
    public boolean isAntenes() {
        return antenes;
    }

    public void setAntenes(boolean antenes) {
        this.antenes = antenes;
    }
    /**
     * 
     * Per introduir el número de potes
     *
     */
    public int getNumero_potes_art() {
        return numero_potes_art;
    }

    public void setNumero_potes_art(int numero_potes_art) {
        this.numero_potes_art = numero_potes_art;
    }
}
