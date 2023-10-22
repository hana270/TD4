package td4;

public class Magazine extends Livre{
private double  moisParution;

public Magazine(double moisParution,String titre,int identifiant,String domaine,int nbpages) {
	super(titre,identifiant, domaine,nbpages);
	this.moisParution=moisParution;
}

public double getmoisParution() {
	 return this.moisParution;
}
public void setmoisParution(double M) {
	this.moisParution=M;
}
@Override
public String toString() {
	return super.toString()+"  le mois de parution: "+this.getmoisParution()+"\n";
}
public double calculePrix(int bonus) {
	return (0.35*nbpages)*(1+tva)+bonus;
}
}
