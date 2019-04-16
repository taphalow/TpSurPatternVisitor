package concreteClasse;

import abstractClasse.AbstractElement;
import abstractClasse.IVisitor;

public class Commerciaux extends AbstractElement{
	private float primeVente;
	
	public Commerciaux(float primeVente) {
		super();
		setPrimeVente(primeVente);
	}
	
	
	public float getPrimeVente() {
		return primeVente;
	}
	public void setPrimeVente(float primeVente) {
		this.primeVente = primeVente;
	}


	@Override
	public void accept(IVisitor visitor) {
		visitor.visitCommerciaux(this);
		
	}

	@Override
	public void calculerSalaire() {
		System.out.println("Le montant des commerciaux est "+ (getPrimeVente()+10000));
	}

}
