package concreteClasse;

import abstractClasse.AbstractElement;
import abstractClasse.IVisitor;

public class Manager extends AbstractElement{
	private float indice, salaireBase, prime, impot;
	
	

	public Manager(float indice, float salaireBase, float prime, float impot) {
		super();
		setIndice(indice);
		setSalaireBase(salaireBase);
		setPrime(prime);
		setImpot(impot);
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

	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}

	public float getImpot() {
		return impot;
	}

	public void setImpot(float impot) {
		this.impot = impot;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitManager(this);
	}

	@Override
	public void calculerSalaire() {
		System.out.println("La salaire du manager est "+ (getIndice()*getSalaireBase()+getPrime()-getImpot()));
		
	}

}
