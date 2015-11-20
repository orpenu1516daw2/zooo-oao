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
public abstract class Animal {
    protected int codi_animal;
    protected char medi;
    protected char dieta;
    protected boolean sexe;
    protected float codi_veterinari;
    protected float codi_cuidador;
    
    public Animal(){
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
    public float getNom_veterinari() {
        return codi_veterinari;
    }
    
    public void setNom_veterinari(float codi_veterinari) {
        this.codi_veterinari = codi_veterinari;
    }
    /**
    * 
    * Per insetar el nom del cuidador
    */
    public float getNom_cuidador() {
        return codi_cuidador;
    }

    public void setNom_cuidador(float codi_cuidador) {
        this.codi_cuidador = codi_cuidador;
    }
}     