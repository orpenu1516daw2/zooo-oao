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
     */
    public static void main(String[] args) {
        Mamifer mamifer_1 = new Mamifer();
        mamifer_1.setCodi_animal = 1264;
        mamifer_1.setMedi = ("Terrestre");
        mamifer_1.setDieta = ("Herbívor");
        mamifer_1.setSexe = ("Mascle");
        mamifer_1.setCodi_veterinari = 0433;
        mamifer_1.setCodi_cuidador = 1045;
        mamifer_1.setPlacentari = ("true");
        System.out.println(mamifer_1);
        
        Artropode artropode_1 = new Artropode();
        artropode_1.setCodi_animal = 0257;
        artropode_1.setMedi = ("Terrestre");
        artropode_1.setDieta = ("Insectívor");
        artropode_1.setSexe = ("Femella");
        artropode_1.setCodi_veterinari = 0413;
        artropode_1.setCodi_cuidador = 1644;
        artropode_1.setVenenos = ("true");
        artropode_1.setAntennes = ("false");
        artropode_1.setNumero_potes_art = 8;
        System.out.println(artropode_1);
        
        Au au_1 = new Au();
        au_1.setCodi_animal = 3108;
        au_1.setMedi = ("Terrestre");
        au_1.setDieta = ("Carnívor");
        au_1.setSexe = ("Mascle");
        au_1.setCodi_veterinari = 0416;
        au_1.setCodi_cuidador = 1077;
        au_1.setVolador =("true");
        System.out.println(au_1);
        
        Amfibi amfibi_1 = new Amfibi();
        amfibi_1.setCodi_animal = 2648;
        amfibi_1.setMedi = ("Terrestre");
        amfibi_1.setDieta = ("Carnívor");
        amfibi_1.setSexe = ("Femella");
        amfibi_1.setCodi_veterinari = 0413;
        amfibi_1.setCodi_cuidador = 1008;
        amfibi_1.setVeri = 0;
        amfibi_1.setFecundacio = 1;
        amfibi_1.setLarva = 0;
        System.out.println(amfibi_1);
        
        Peix peix_1 = new Peix();
        peix_1.setCodi_animal = 4752;
        peix_1.setMedi = ("Aquatic");
        peix_1.setDieta = ("Carnívor");
        peix_1.setSexe = ("Femella");
        peix_1.setCodi_veterinari = 0876;
        peix_1.setCodi_cuidador = 1477;
        peix_1.setEsquelet = ("Cartilaginós");
        peix_1.setAigua = ("Salada");
        System.out.println(peix_1);
        
        Reptil reptil_1 = new Reptil();
        reptil_1.setCodi_animal = 5777;
        reptil_1.setMedi = ("Terrestre");
        reptil_1.setDieta = ("Carnívor");
        reptil_1.setSexe = ("Mascle");
        reptil_1.setCodi_veterinari = 0294;
        reptil_1.setCodi_cuidador = 1742;
        reptil_1.setTipus_reproduccio = 1;
        reptil_1.setPotes = 1;
        System.out.println(reptil_1);
        
        
        Personal personal_1 = new Personal() {};
        personal_1.setCodi_personal = 1045;
        personal_1.setDNI = ("23892819A");
        personal_1.setHorari = ("Matí");
        personal_1.setNss = 102476543277;
        personal_1.setSou = 1000.04;
        System.out.println(personal_1);
        
        Personal personal_2 = new Personal() {};
        personal_1.setCodi_personal = 0433;
        personal_1.setDNI = ("89196879X");
        personal_1.setHorari = ("Tarda");
        personal_1.setNss = 108234642016;
        personal_1.setSou = 1209.50;
        System.out.println(personal_1);
        
        
        Zona zona_1 = new Zona();
        zona_1.setCodi_zona = 0823;
        zona_1.setNum_gabies = 5;
        zona_1.setSuperficie = 1075.40;
        System.out.println(zona_1);
        
        
        Gàbia gabia_1 = new Gàbia();
        gabia_1.setCodi_gabia = 1458;
        gabia_1.setNum_animals = 5;
        gabia_1.setCapacitat = 7;
        System.out.println(gabia_1);
        
    }
    
}
