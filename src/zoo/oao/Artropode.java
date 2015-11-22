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

    /**
     *
     * @param codi_animal
     * @param medi
     * @param dieta
     * @param sexe
     * @param codi_veterinari
     * @param codi_cuidador
     * @param venenos
     * @param antenes
     * @param numero_potes_art
     */
    public Artropode(int codi_animal, String medi, String dieta, boolean sexe, int codi_veterinari, int codi_cuidador, boolean venenos, boolean antenes, int numero_potes_art) {
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
    
     /**
    * 
    * Per insetar el codi de l'animal
    *
     * @return  */
    public int getCodi_animal() {
        return codi_animal;
    }

    public void setCodi_animal(int codi_animal) {
        this.codi_animal = codi_animal;
    }
    /**
    * 
    * Per insetar el medi de l'animal
     * @return 
    */
    public String getMedi() {
        return medi;
    }

    public void setMedi(String medi) {
        this.medi = medi;
    }
    /**
    * 
    * Per insetar la dieta de l'animal
     * @return 
    */
    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    /**
    * 
    * Per insetar el sexe on: 1 = mascle 0 = femella
     * @return 
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
     * @return 
    */
    public int getCodi_veterinari() {
        return codi_veterinari;
    }
    
    public void setCodi_veterinari(int codi_veterinari) {
        this.codi_veterinari = codi_veterinari;
    }
    /**
    * 
    * Per insetar el nom del cuidador
     * @return 
    */
    public int getcodi_cuidador() {
        return codi_cuidador;
    }

    public void setCodi_cuidador(int codi_cuidador) {
        this.codi_cuidador = codi_cuidador;
    }
    /**
     * 
     * Per introduir si es verinós on: Si = 1 No = 0
     *
     * @return 
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
     * @return 
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
     * @return 
     */
    public int getNumero_potes_art() {
        return numero_potes_art;
    }

    public void setNumero_potes_art(int numero_potes_art) {
        this.numero_potes_art = numero_potes_art;
    }

    @Override
    public String toString() {
        return "Artropode{ codi animal=" + codi_animal + ", medi=" + medi + ", dieta=" + dieta + ", sexe=" + sexe + ", codi_veterinari=" + codi_veterinari + ", codi_cuidador=" + codi_cuidador + ", venenos=" + venenos + ", antenes=" + antenes + ", numero_potes_art=" + numero_potes_art + '}';
    }
    
}