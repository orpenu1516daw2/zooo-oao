package zoo.oao;

/**
 *
 * @author Oriol Alex Oriol
 */
public class Gàbia {
    protected int codi_gabia;
    protected int num_animals;
    protected int capacitat;
    int setCodi_gabia;
    int setNum_animals;
    int setCapacitat;
    
    public Gàbia (){
        this.codi_gabia = codi_gabia;
        this.num_animals = num_animals;
        this.capacitat = capacitat;
    }
    /**
    * 
    * Per insetar un codi de gàbia
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
    */
    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
}