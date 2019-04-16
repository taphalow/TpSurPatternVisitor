package concreteClasse;

import abstractClasse.AbstractElement;
import abstractClasse.IVisitor;

public class Directeur extends AbstractElement{

	private float indice, salaireBase, bonnus;
	
	public Directeur(float indice, float salaireBase, float bonnus) {
		super();
		setIndice(indice);
		setSalaireBase(salaireBase);
		setBonnus(bonnus);
	}
		
	public float getIndice() {
		return indice;
	}
	public void setIndice(float indice) {
		this.indice = indice;
	}

	public float getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(float salaireBase) {
		this.salaireBase = salaireBase;
	}

	public float getBonnus() {
		return bonnus;
	}
	public void setBonnus(float bonnus) {
		this.bonnus = bonnus;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitDirecteur(this);		
	}

	@Override
	public void calculerSalaire() {
		System.out.println("La salaire du directeur est "+ (getIndice()*getSalaireBase()+getBonnus()));
	}

}
