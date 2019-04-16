package testClasse;

import abstractClasse.AbstractElement;
import abstractClasse.IVisitor;
import concreteClasse.Commerciaux;
import concreteClasse.ConcreteVisitor;
import concreteClasse.Directeur;
import concreteClasse.Manager;
import concreteClasse.Ouvrier;

public class Test {

	public static void main(String[] args) {
		//Création des objets de la structure
		AbstractElement directeur = new Directeur((float)Math.random()*100, (float)Math.random()*50000,(float) Math.random()*1000);
		AbstractElement manager = new Manager((float)Math.random()*100, (float)Math.random()*20000, (float)Math.random()*100, (float)Math.random()*10);
		AbstractElement commerciaux = new Commerciaux((float)Math.random()*100);
		AbstractElement ouvrier = new Ouvrier((float)Math.random()*10, 10);
		
		//Création de la classe visitor
		IVisitor visitor = new ConcreteVisitor();
		
		//Affichage de la salaire du Directeur
		directeur.accept(visitor);
		
		//Affichage de la salaire du Directeur
		manager.accept(visitor);
		
		//Affichage de la salaire du Directeur
		commerciaux.accept(visitor);
		
		//Affichage de la salaire du Directeur
		ouvrier.accept(visitor);
		
	}

}
