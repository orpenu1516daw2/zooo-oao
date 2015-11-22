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
   protected double codi_zona; 
   protected int num_gabies;
   protected double superficie;
   
   
   public Zona (double codi_zona, int num_gabies, double superficie){
       this.codi_zona = codi_zona;
       this.num_gabies = num_gabies;
       this.superficie = superficie;
   }


    /**
    * 
    * Per insetar un codi de la zona
     * @return 
    */
    public double getCodi_zona() {
        return codi_zona;
    }

    public void setCodi_zona(int codi_zona) {
        this.codi_zona = codi_zona;
    }
    /**
    * 
    * Per insetar un numero de la gàbies
     * @return 
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
     * @return 
    */
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Zona{" + "codi_zona=" + codi_zona + ", num_gabies=" + num_gabies + ", superficie=" + superficie + '}';
    }
  
}