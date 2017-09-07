
// Self-referential Data
interface IAncestorTree {
	
}

class Unknown implements IAncestorTree {
	Unknown () {
		
	}
}

class Person1 implements IAncestorTree {
  String name;
  IAncestorTree mother;
  IAncestorTree father;
  
  Person1(String name, IAncestorTree mother, IAncestorTree father) {
  	this.name = name;
  	this.mother = mother;
  	this.father = father;
  }
}

class ExamplesAncestorTree {
	ExamplesAncestorTree () {}
	
	IAncestorTree unknown = new Unknown();
	
	IAncestorTree ludovico = new Person1("Ludovico", this.unknown, this.unknown);
	IAncestorTree guillerma = new Person1("Guillerma", this.unknown, this.unknown);
	IAncestorTree antonio = new Person1("Antonio", this.unknown, this.unknown);
	IAncestorTree teresita = new Person1("Teresita", this.unknown, this.unknown);
	
	IAncestorTree jorge = new Person1("Jorge", this.guillerma, this.ludovico);
	IAncestorTree annavic = new Person1("Annavic", this.teresita, this.antonio);
	
	IAncestorTree jeane = new Person1("Jeane", this.annavic, this.jorge);
}
