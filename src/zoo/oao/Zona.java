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
public class Zona {
   protected int codi_zona; 
   protected int num_gabies;
   protected float superficie;
    int setNum_gabies;
    double setSuperficie;
    String setCodi_zona;
   
   public Zona (){
       this.codi_zona = codi_zona;
       this.num_gabies = num_gabies;
       this.superficie = superficie;
   }
    /**
    * 
    * Per insetar un codi de la zona
    */
    public int getCodi_zona() {
        return codi_zona;
    }

    public void setCodi_zona(int codi_zona) {
        this.codi_zona = codi_zona;
    }
    /**
    * 
    * Per insetar un numero de la gàbies
    */
    public int getNum_gabies() {
        return num_gabies;
    }

    public void setNum_gabies(int num_gabies) {
        this.num_gabies = num_gabies;
    }
    /**
    * 
    * Per insetar la superficie
    */
    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
   
   
}