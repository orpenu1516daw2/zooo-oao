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
public class Amfibi extends Animal {
    protected boolean veri;
    protected boolean larva;
    protected boolean fecundacio;
    
    /**
     *
     * @param codi_animal
     * @param medi
     * @param dieta
     * @param sexe
     * @param codi_veterinari
     * @param codi_cuidador
     * @param veri
     * @param larva
     * @param fecundacio
     */
    public Amfibi (int codi_animal, String medi, String dieta, boolean sexe, int codi_veterinari, int codi_cuidador, boolean veri, boolean larva, boolean fecundacio){
        this.veri = veri;
        this.larva = larva;
        this.fecundacio = fecundacio;
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
    
    public boolean isVeri() {
        return veri;
    }

    public void setVeri(boolean veri) {
        this.veri = veri;
    }

    /**
     * 
     * Per introduir si es una larva on: Si = 1 No = 0
     *
     * @return 
     */
    public boolean isLarva() {
        return larva;
    }

    public void setLarva(boolean larva) {
        this.larva = larva;
    }
    /**
     * 
     * Per introduir el metode de fecundació on: interna = 1 externa = 0
     *
     * @return 
     */
    public boolean isFecundacio() {
        return fecundacio;
    }

    public void setFecundacio(boolean fecundacio) {
        this.fecundacio = fecundacio;
    }

    @Override
    public String toString() {
        return "Amfibi{ codi animal=" + codi_animal + ", medi=" + medi + ", dieta=" + dieta + ", sexe=" + sexe + ", codi_veterinari=" + codi_veterinari + ", codi_cuidador=" + codi_cuidador + ", veri=" + veri + ", larva=" + larva + ", fecundacio=" + fecundacio + '}';
    }
    
}
