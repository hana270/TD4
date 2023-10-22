package td4;

public class testlibrairie {

	public static void main(String[] args) {
		Librairie L= new Librairie(4);
		Livre l1=new Livre("Titre 1",156,"categorie 1",255);
		Roman r1=new Roman("Titre 2",451,"categorie 2",502,"Nom 1","Nom 2");
		Magazine m1=new Magazine(11,"Titre 3",122,"categorie 3",42);
		
		L.ajoutLiv(l1);
		L.ajoutLiv(r1);
		L.ajoutLiv(m1);
		
		L.inventaire();
		Roman r2=new Roman("Titre 4",451,"categorie 4",502,"Nom 1","Nom 2");
		L.ajoutLiv(r2);
		System.out.println("\n\n*******************Liste des romans:*******************");
		L.inventaire("Roman");
		
		System.out.println("****************Montant total pour les romans****************");
		double s=0;
		for(int i=0;i<L.getNb();i++) {
			if(L.liste[i] instanceof Roman) {
				s=s+L.liste[i].calculePrix();
			}
		}
		System.out.println("Le montant total est ="+s);
		Magazine m2=new Magazine(77,"Mood",564,"Mode",12);
		//L.ajoutLiv(m2);  //Impossible d'ajouter plus la librairie est pleine...
		//il faut supprimer un Livre pour ajouter un autre.
		L.suppLiv(156);
		L.ajoutLiv(m2);
		System.out.println("***************************** **Lister tous les livres** ***************************");
		L.inventaire();
	}

}
