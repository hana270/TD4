package td4;

public class Roman extends Livre{
	private String nomauteur;
	private String nomediteur;

public Roman(String titre,int identifiant,String domaine,int nbpages,String nomauteur,String nomediteur) {
	super(titre,identifiant, domaine,nbpages);
	this.nomauteur=nomauteur;
	this.nomediteur=nomediteur;
}
public String getnomAuteur() {
	return this.nomauteur;
}
public void setnomAuteur(String nom) {
	this.nomauteur=nom;
}
public String getnomEditeur() {
	return this.nomediteur;
}
public void setnomEditeur(String nom) {
	this.nomediteur=nom;
}



@Override
public String toString() {
	return super.toString()+" Nom d'auteur :"+nomauteur+" ,Nom d'editeur :"+nomediteur+"\n";
}
public double calculePrix() {
	return (0.05*nbpages)*(1+tva);
}
}
