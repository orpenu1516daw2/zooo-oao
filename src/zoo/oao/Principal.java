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
public class Principal {

    /**
     * 
     * Funció per crear el animals del zoo, el cual l'hi passem l'informació a través dels sets que són cridats de les classes
     *
     * @param args
     */
    public static void main(String[] args) {
        Mamifer mamifer_1;
        mamifer_1 = new Mamifer(1264, "Terrestre", "Herbívor", true, 2433, 1045, true);
        System.out.println(mamifer_1);
        
        Artropode artropode_1;
        artropode_1 = new Artropode(0257, "Terrestre", "Insectívor", false, 2433, 1045, true, false, 8);
        System.out.println(artropode_1);
        
        Au au_1;
        au_1 = new Au(3108, "Terrestre", "Carnívor", true, 2433, 1045, true);
        System.out.println(au_1);
        
        Amfibi amfibi_1;
        amfibi_1 = new Amfibi(2648, "Terrestre", "Carnívor", false, 2433, 1045, false, true, false);
        System.out.println(amfibi_1);
        
        Peix peix_1;
        peix_1 = new Peix(4752, "Aquàtic", "Carnívor", false, 2433, 1045, true, "salada");
        System.out.println(peix_1);
        
        Reptil reptil_1;
        reptil_1 = new Reptil(5777, "Terrestre", "Carnívor", true, 2433, 1045, true, true);
        System.out.println(reptil_1);
        
        Cuidador cuidador_1;
        cuidador_1 = new Cuidador(1045, 1000.04, "23892819A", "002456543277", "Matí");
        System.out.println(cuidador_1);
        
        Veterinari veterinari_1;
        veterinari_1 = new Veterinari(2433, 1209.50, "89196879X", "003476145267", "Tarda");
        System.out.println(veterinari_1);
        
        Zona zona_1;
        zona_1 = new Zona(0765, 5, 1075.40);
        System.out.println(zona_1);
        
        Gabia gabia_1;
        gabia_1 = new Gabia(1458, 5, 7);
        System.out.println(gabia_1);
        
    }
    
}