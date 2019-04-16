package concreteClasse;

import abstractClasse.IVisitor;

public class ConcreteVisitor implements IVisitor{

	@Override
	public void visitDirecteur(Directeur directeur) {
		directeur.calculerSalaire();
	}

	@Override
	public void visitManager(Manager manager) {
		manager.calculerSalaire();
	}

	@Override
	public void visitCommerciaux(Commerciaux commerciaux) {
		commerciaux.calculerSalaire();
	}

	@Override
	public void visitOuvrier(Ouvrier ouvrier) {
		ouvrier.calculerSalaire();
	}

}
