package td4;

public class Livre {
protected String titre;
protected int identifiant;
protected double tva =0.01;
protected String domaine;
protected int nbpages;

public Livre(String titre,int identifiant,String domaine,int nbpages) {
	this.titre=titre;
	this.identifiant=identifiant;
	this.domaine=domaine;
	this.nbpages=nbpages;

}

public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}

public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}

public String getDomaine() {
	return domaine;
}
public void setDomaine(String domaine) {
	this.domaine = domaine;
}

public int getNbpages() {
	return nbpages;
}
public void setNbpages(int nbpages) {
	this.nbpages = nbpages;
}

public String toString() {
	return super.getClass().getSimpleName()+" : Le Livre :"+titre+" ,d'identifiant ="+identifiant
			+",de Domaine :"+domaine+" e de nombre des pages = "+nbpages+"\n*****";
}

public double calculePrix() {
	return (0.075*nbpages)*(1+tva);
}
}
