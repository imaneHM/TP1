import java.util.ArrayList;
public class Zoo {
    private ArrayList<Secteur> secteursAnimeaux;
    private int visiteurs=0;
    int n=0;
    int k=0;
    public Zoo (int visitors ) {

        this.visiteurs=visitors;

        this.secteursAnimeaux = new ArrayList();

    }
    public void ajouterSecteur(Secteur sect) {

        this.secteursAnimeaux.add(sect);

    }

    public void nouveauVisiteur(){
       visiteurs++;

    }
    public int getVisiteurs(){
        k=visiteurs++;
        return k;

    }


    public void getLimiteVisieur(){
        if(n>15){
            System.out.println("on a dépasser la limite des visiteurs");
        }
    }

    public void nouvelAnimal(Animal nouvelAnimal){
        nouvelAnimal.nomAnimal= nouvelAnimal.getNomAnimal();
        nouvelAnimal.typeAnimal= nouvelAnimal.getTypeAnimal();
    }
    public int nombreAnimeaux(Secteur secte){
       int nb=secte.getNombreAnimeaux();
       int s=secteursAnimeaux.size();
       int v=s*nb;
       return v;

    }
    public static void main(String[] args) {
        Animal Chat= new Animal("mimi","mammifére");
        Animal Chien= new Animal("olivia","mammifére");
        Zoo zoo1=new Zoo(1);
        Secteur sec1=new Secteur("mammifére");


        System.out.println("on ajoute un animal dans le zoo");
        System.out.println("son nom est "+ Chat.getNomAnimal());
        System.out.println("son type est "+ Chat.getTypeAnimal());
        System.out.println("il y'a un nouveau visiteur, le nombre de visiteurs now est à"+zoo1.getVisiteurs());
        sec1.ajouterAnimal(Chat);
        System.out.println(" voici la liste des animeaux dans le secteur mammifére"+  sec1.AnimauxDansSecteur);






    }


}
