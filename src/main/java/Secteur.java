import java.util.ArrayList;

public class Secteur {
    String typeAnimeauxDansSecteur;
    public ArrayList<Animal> AnimauxDansSecteur;
    int nb;


    Secteur(String typeInSec){
        this.typeAnimeauxDansSecteur=typeInSec;
        this.AnimauxDansSecteur=new ArrayList<Animal>();
    }
    public void ajouterAnimal(Animal an){
        this.AnimauxDansSecteur.add(an);
    }
    public int getNombreAnimeaux(){
        nb=AnimauxDansSecteur.size();
        return nb;
    }
    public String obtenirType(){
        String type=this.typeAnimeauxDansSecteur;
        return type;


    }
}
