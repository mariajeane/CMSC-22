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
    
    /* Person --> boolean
     * Returns true if this Person older than the given Person
     * 
     * boolean isOlder(Person other) {
     *   return false;
     * } 
     */

    /* Template
     *   Fields:
     *     ... this.name -- String
     *     ... this.age -- int
     * 
     *   Method:
     *     ... isOlder -- boolean
     */

    boolean isOlder(Person other) {
     if (this.age > other.age) {
      return true;
     } else {
      return false;
     }
   }
}

//to represent a pet
interface IPet { }

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
}

class ExamplesPerson{
  ExamplesPerson() {}
 
  IPet wilson = new Cat("Wilson", "Sphynx Cat", false);
  IPet martha = new Cat("Martha", "Persian Cat", true);
  IPet nico = new Dog("Nico", "Shiba Inu", true);
  IPet lisa = new Dog("Lisa", "Bichon Frise", false);
 
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
}