
// Problem 1 & 2
class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Address {
		String city;
		String state;
		
		Address(String city, String state) {
			this.city = city;
			this.state = state;
		}
}

class ExamplesAddress {
	ExamplesAddress () {
		Address a = new Address("Boston", "MA");
		Address b = new Address("Warwick", "RI");
		Address c = new Address("Nashua", "NH");

		Person pat = new Person("Pat", 19, "F", this.a);
		Person kim = new Person("Kim", 17, "F", this.a);
		Person tim = new Person("Tim", 20, "M", this.b);
		Person dan = new Person("Dan", 22, "M", this.c);
	}
}