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
    protected String aigua;
    
    /**
     * 
     * Per introduir el tipus d'esquelet del peix on: cartilaginosos = 1 ossis = 0
     * 
     * Peixos cartilaginosos, tenim per exemple, el tauró. Ossis .per exemple, truita.
     * 
     * @param codi_animal
     * @param medi
     * @param dieta
     * @param sexe
     * @param codi_veterinari
     * @param codi_cuidador
     * @param esquelet
     * @param aigua
     */ 
    public Peix (int codi_animal, String medi, String dieta, boolean sexe, int codi_veterinari, int codi_cuidador, boolean esquelet, String aigua){
        this.esquelet = esquelet;
        this.aigua = aigua;
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
     * Aigua dolça = truita salada = tauró
     * 
     * @return 
     */ 
    public String getAigua() {
        return aigua;
    }

    public void setAigua(String aigua) {
        this.aigua = aigua;
    }

    @Override
    public String toString() {
        return "Peix{ codi animal=" + codi_animal + ", medi=" + medi + ", dieta=" + dieta + ", sexe=" + sexe + ", codi_veterinari=" + codi_veterinari + ", codi_cuidador=" + codi_cuidador + ", esquelet=" + esquelet + ", aigua=" + aigua + '}';
    }
    
}