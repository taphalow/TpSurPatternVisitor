# TpSurPatternVisitor
Pattern Visitor : Ce modèle de conception permet à une classe externe d'être informée du type exact d'instances d'un ensemble de classes.

En pratique, le modèle de conception visiteur est réalisé de la façon suivante : chaque classe de la structure (Directeur, Manager,
, Commerciaux et Ouvrier) pouvant être « visitée » doit mettre à disposition une méthode publique « accepter » prenant comme argument 
un objet du type visiteur « IVisitor » ==> ConcreteVisitor. 
La méthode « accepter » appellera la méthode « visite » (ex : visitDirecteur(Directeur d), visitManger(Manager m),...) de l'objet du 
type « IVisiteur » avec pour argument l'objet visité (Directeur, Mananger,...).
De cette manière, un objet visiteur pourra connaître la référence de l'objet visité et appeler ses méthodes publiques pour obtenir les 
données nécessaires au traitement à effectuer (calculeSalaire()).
