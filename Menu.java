
// Problem 3
interface IMenu {

}

class Soup implements IMenu {
	String name;
	int price;
	boolean isVegetarian;
	
	Soup(String name, int price, boolean isVegetarian) {
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements IMenu{
	String name;
	int price;
	boolean isVegetarian;
	String dressing;
	
	Salad(String name, int price, boolean isVegetarian, String dressing) {
		this.name = name;
		this.price = price;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
}

class Sandwich implements IMenu{
	String name;
	int price;
	String bread;
	Filling fillings;
	
	Sandwich(String name, int price, String bread, Filling fillings) {
		this.name = name;
		this.price = price;
		this.bread = bread;
		this.fillings = fillings;
	}
}

class Filling {
	String filling1;
	String filling2;
	
	Filling(String filling1, String filling2) {
		this.filling1 = filling1;
		this.filling2 = filling2;
	}
}

class ExamplesMenu {
	ExamplesMenu () {}
	
	Soup asoup = new Soup("Tomato Orange Soup", 210, true);
	Soup bsoup = new Soup("Beef Barley Soup", 490, false);
	
	Salad asalad = new Salad("Quick Chicken Salad", 363, false, "Thousand Island Dressing");
	Salad bsalad = new Salad("Caesar Salad", 186, true, "Balsamic Vinegar");
	
	Filling choicea = new Filling("ham", "cheese");
	Filling choiceb = new Filling("peanut butter", "jelly");
	Sandwich asandwich = new Sandwich("H and C Sandwich", 84, "Rye Bread", this.choicea);
	Sandwich bsandwich = new Sandwich("P and J Sandwich", 45, "White Bread", this.choiceb);
}