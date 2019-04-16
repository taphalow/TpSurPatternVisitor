package abstractClasse;

import concreteClasse.Commerciaux;
import concreteClasse.Directeur;
import concreteClasse.Manager;
import concreteClasse.Ouvrier;

public interface IVisitor {

	public void visitDirecteur(Directeur directeur);
	public void visitManager(Manager manager);
	public void visitCommerciaux(Commerciaux commerciaux);
	public void visitOuvrier(Ouvrier ouvrier);
}
