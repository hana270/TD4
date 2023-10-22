package td4;

public class Librairie {
Livre liste[];
private int capacite;
private int nb;

public Librairie(int capacite) {
	this.capacite=capacite;
	liste=new Livre[capacite];
	this.nb=0;
}
public int getNb() {
	return nb;
}

public void inventaire(){
	for(int i=0;i<nb;i++) {
		System.out.println(liste[i].toString()+" Prix= "+liste[i].calculePrix());
	}
}
public void inventaire(String categ) {
    for (int i = 0; i < nb; i++) {
        if (liste[i].getClass().getSimpleName().equals(categ)) {
            System.out.println(liste[i].toString());
        }
    }
}

public void ajoutLiv(Livre liv) {
	if(capacite>nb) {
		liste[nb]=liv;
		nb++;
	}else {
		System.out.println("Impossible d'ajouter plus de livre");
	}
	
}
public void suppLiv(int num) {
    for (int i = 0; i < nb; i++) {
        if (liste[i].getIdentifiant() == num) {
            for (int j = i; j < nb-1 ; j++) {
                liste[j] = liste[j + 1];
            }
            liste[nb - 1] = null;
            nb--; 
            break;
        }
    }
}


}
