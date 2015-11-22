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
    
    /**
    * 
    * Per insertar el tipus de reproducció on: ovípars = 1 ovovivípars = 0
     * @param codi_animal
     * @param medi
     * @param dieta
     * @param sexe
     * @param codi_veterinari
     * @param codi_cuidador
     * @param tipus_reproduccio
     * @param potes
    */
    public Reptil (int codi_animal, String medi, String dieta, boolean sexe, int codi_veterinari, int codi_cuidador, boolean tipus_reproduccio, boolean potes){
        this.tipus_reproduccio = tipus_reproduccio;
        this.potes = potes;
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
    public int getCodi_cuidador() {
        return codi_cuidador;
    }

    public void setCodi_cuidador(int codi_cuidador) {
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
     * @return 
     */
    public boolean isPotes() {
        return potes;
    }

    public void setPotes(boolean potes) {
        this.potes = potes;
    }

    @Override
    public String toString() {
        return "Reptil{ codi animal=" + codi_animal + ", medi=" + medi + ", dieta=" + dieta + ", sexe=" + sexe + ", codi_veterinari=" + codi_veterinari + ", codi_cuidador=" + codi_cuidador + ", tipus_reproduccio=" + tipus_reproduccio + ", potes=" + potes + '}';
    }
       
}