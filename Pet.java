import tester.Tester;

// to represent a pet owner
class Person {
    String name;
    IPet pet;
    int age;

    Person(String name, IPet pet, int age) {
        this.name = name;
        this.pet = pet;
        this.age = age;
    }
    
    /* signature
     * Person --> boolean
     * returns true if this Person older than the given Person
     * 
     * boolean isOlder(Person other) {
     *   return false;
     * } 
     */

    /* Template
     *   Fields:
     *     ... this.name 	-- String
     *     ... this.pet		-- IPet
     *     ... this.age 	-- int
     *
     *   Method:
     *    ... isOlder()		-- boolean
     *    ... perish()		-- Person
     */

    boolean isOlder(Person other) {
    	return (this.age > other.age);
    }
    
    /* -> Person
     * Returns this Person whose pet has perished.
     */
    
    Person perish() {
    	return new Person(this.name, new NoPet() ,this.age);
    }
}

//to represent a pet
interface IPet {
	boolean sameNamePet(String givenName);
}

class NoPet implements IPet {
	NoPet() {
	}
	
	public boolean sameNamePet(String givenName) {
		return false;
	}
}

// to represent a pet cat
class Cat implements IPet {
    String name;
    String kind;
    boolean longhaired;

    Cat(String name, String kind, boolean longhaired) {
        this.name = name;
        this.kind = kind;
        this.longhaired = longhaired;
    }
    
    /* String -> boolean
     * Determines whether the name of this Person's pet is the same
     * with the given name.
     */
    
    public boolean sameNamePet(String givenName) {
    	return (this.name == givenName);
    }
}

// to represent a pet dog
class Dog implements IPet {
    String name;
    String kind;
    boolean male;

    Dog(String name, String kind, boolean male) {
        this.name = name;
        this.kind = kind;
        this.male = male;
    }
    
    public boolean sameNamePet(String givenName) {
    	return (this.name == givenName);
    }
}


class ExamplesPerson{
	ExamplesPerson() {}
	
	IPet noPet = new NoPet();
	
	IPet wilson = new Cat("Wilson", "Sphynx Cat", false);
	IPet martha = new Cat("Martha", "Persian Cat", true);
	IPet nico = new Dog("Nico", "Shiba Inu", true);
	IPet lisa = new Dog("Lisa", "Bichon Frise", false);
	
	Person wendell = new Person("Wendell", this.noPet, 48);
	Person marion = new Person("Marion", this.noPet, 32);
	
	Person jeane = new Person("Jeane", this.lisa, 18);
	Person julie = new Person("Julie", this.nico, 16);
	Person lily = new Person("Lily", this.wilson, 20);
	Person diane = new Person("Diane", this.martha, 20);

boolean testIsOlder(Tester t) {
	return 
	  t.checkExpect(this.jeane.isOlder(this.julie), true) &&
	  t.checkExpect(this.julie.isOlder(this.jeane), false) &&
	  t.checkExpect(this.lily.isOlder(this.diane), false);
 }

boolean testSameNamePet(Tester t) {
	return
	  t.checkExpect(this.wilson.sameNamePet("Wilson"), true) &&
	  t.checkExpect(this.martha.sameNamePet("Nico"), false) &&
	  t.checkExpect(this.lisa.sameNamePet("Martha"), false) &&
	  t.checkExpect(this.nico.sameNamePet("Nico"), true);
}

boolean testPerish(Tester t) {
	Person jeanePerishPet = this.jeane.perish();
	
	return
	  t.checkExpect(jeanePerishPet.name, "Jeane") &&
	  t.checkExpect(jeanePerishPet.pet, this.noPet) &&
	  t.checkExpect(jeanePerishPet.age, 18);
}
}
