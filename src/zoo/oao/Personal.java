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
public abstract class Personal {
    protected int codi_personal;
    protected float sou;
    protected char DNI;
    protected float nss;
    protected char horari;
    double setSou;
    String setHorari;
    String setDNI;
    int setCodi_personal;
    
    public Personal (){
        this.codi_personal = codi_personal;
        this.sou = sou;
        this.DNI = DNI;
        this.nss = nss;
        this.horari = horari;
    }
    /**
    * 
    * Per insetar el codi del personal
    */
    public int getCodi_personal() {
        return codi_personal;
    }

    public void setCodi_personal(int codi_personal) {
        this.codi_personal = codi_personal;
    }
    /**
    * 
    * Per insetar el sou del personal
    */
    public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }
    /**
    * 
    * Per insetar el DNI del personal
    */
    public char getDNI() {
        return DNI;
    }

    public void setDNI(char DNI) {
        this.DNI = DNI;
    }
    /**
    * 
    * Per insetar el número de la seguretat social
    */
    public float getNss() {
        return nss;
    }

    public void setNss(float nss) {
        this.nss = nss;
    }
    /**
    * 
    * Per insetar l'horari
    */
    public char getHorari() {
        return horari;
    }

    public void setHorari(char horari) {
        this.horari = horari;
    }
    
    
}
