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
public class Mamifer extends Animal {
    protected boolean placentari;
    
    /**
    * 
    * Per insetar si es placentari: 1 = Si es placentari 0 = No es placentari
    * 
    * Placentari vol dir que neix d'una placenta o no. Un mamífer ,per exemple, que no neix de la placenta es el cangur.
    *
    * @param codi_animal
    * 
    * @param medi
    * 
    * @param dieta
    * 
    * @param sexe
    * 
    * @param codi_veterinari
    * 
    * @param codi_cuidador
    * 
    * @param placentari
    */
 
    public Mamifer (int codi_animal, String medi, String dieta, boolean sexe, int codi_veterinari, int codi_cuidador, boolean placentari){
        this.codi_animal = codi_animal;
        this.medi = medi;
        this.dieta = dieta;
        this.sexe = sexe;
        this.codi_veterinari = codi_veterinari;
        this.codi_cuidador = codi_cuidador;
        this.placentari = placentari;
    }

    /**
    * 
    * Per insetar el codi de l'animal
    * 
    * @return 
    */
    
    public int getCodi_animal() {
        return codi_animal;
    }
    
    /**
    * 
    * Per insetar el codi de l'animal
    * 
    *@param codi_animal 
    */
    
    public void setCodi_animal(int codi_animal) {
        this.codi_animal = codi_animal;
    }
    
    /**
    * 
    * Per insetar el medi de l'animal
    * 
    * @return
    */
    
    public String getMedi() {
        return medi;
    }
    
    /**
    * 
    * Per insetar el medi de l'animal
    * 
    * @param medi
    */
    
    public void setMedi(String medi) {
        this.medi = medi;
    }
    
    /**
    * 
    * Per insetar la dieta de l'animal
    * 
    * @return 
    */
    
    public String getDieta() {
        return dieta;
    }
    
    /**
    * 
    * Per insetar el medi de l'animal
    * 
    * @param dieta
    */
    
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    /**
    * 
    * Per insetar el sexe on: 1 = mascle 0 = femella
    * 
    * @return 
    */
    
    public boolean getSexe() {
        return sexe;
    }
    
    /**
    * 
    * Per insetar el medi de l'animal
    * 
    * @param sexe
    */
    
    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }
    
    /**
    * 
    * Per insetar el nom del veterinari
    * 
    * @return 
    */
    
    public int getCodi_veterinari() {
        return codi_veterinari;
    }
    
    /**
    * 
    * Per insetar el medi de l'animal
    * 
    * @param codi_veterinari
    */
    
    public void setCodi_veterinari(int codi_veterinari) {
        this.codi_veterinari = codi_veterinari;
    }
    
    /**
    * 
    * Per insetar el nom del cuidador
    * 
    * @return 
    */
    
    public int getcodi_cuidador() {
        return codi_cuidador;
    }

    public void setCodi_cuidador(int codi_cuidador) {
        this.codi_cuidador = codi_cuidador;
    }
 
    public boolean isplacentari() {
        return placentari;
    }
 
    public void setplacentari(boolean placentari) {
        this.placentari = placentari;
    }
    
    @Override
    public String toString() {
        return "Mamifer{ codi animal=" + codi_animal + ", medi=" + medi + ", dieta=" + dieta + ", sexe=" + sexe + ", codi_veterinari=" + codi_veterinari + ", codi_cuidador=" + codi_cuidador + ", placentari=" + placentari + '}';
    }
     
}