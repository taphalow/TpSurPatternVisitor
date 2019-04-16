package concreteClasse;

import abstractClasse.AbstractElement;
import abstractClasse.IVisitor;

public class Ouvrier extends AbstractElement{
	private float salaireHoraire;
	private int nombreHeure;
	
	public Ouvrier(float s, int n) {
		setSalaireHoraire(s);
		setNombreHeure(n);
	}
	
	
	public float getSalaireHoraire() {
		return salaireHoraire;
	}
	public void setSalaireHoraire(float salaireHoraire) {
		this.salaireHoraire = salaireHoraire;
	}

	public int getNombreHeure() {
		return nombreHeure;
	}
	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}


	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculerSalaire() {
		// TODO Auto-generated method stub
		
	}

}
