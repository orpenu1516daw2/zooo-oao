package zoo.oao;

/**
 *
 * @author Oriol Alex Oriol
 */
public class Gabia {
    protected int codi_gabia;
    protected int num_animals;
    protected int capacitat;
    
    /**
     *
     * @param codi_gabia
     * @param num_animals
     * @param capacitat
     */
    public Gabia (int codi_gabia, int num_animals, int capacitat){
        this.codi_gabia = codi_gabia;
        this.num_animals = num_animals;
        this.capacitat = capacitat;
    }
    /**
    * 
    * Per insetar un codi de gàbia
     * @return 
    */
    public int getCodi_gabia() {
        return codi_gabia;
    }

    public void setCodi_gabia(int codi_gabia) {
        this.codi_gabia = codi_gabia;
    }
    /**
    * 
    * Per insetar un numero de animals
     * @return 
    */
    public int getNum_animals() {
        return num_animals;
    }

    public void setNum_animals(int num_animals) {
        this.num_animals = num_animals;
    }
    /**
    * 
    * Per insetar la capacitat d'animals que té una gàbia
     * @return 
    */
    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    @Override
    public String toString() {
        return "Gabia{" + "codi_gabia=" + codi_gabia + ", num_animals=" + num_animals + ", capacitat=" + capacitat + '}';
    }
}