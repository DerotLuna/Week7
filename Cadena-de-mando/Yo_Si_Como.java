public class Yo_Si_Como{
  public static void main(String[] args) {

    People people = new People("Ruben", 19, 25217437, new President(null, 100000, "President"));
		People people2 = new People("Alejandro", 19, 25000000, new Vice_President(people, 50000, "Vice_President"));
		People people3 = new People("Leonardo", 19, 25111111, new Director(people2, 1500, "Director"));
		People people4 = new People ("Carlos", 19, 25222222, new Manager(people3, 1500, "Manager"));

	  /* President president = new President(null, 100000);
		Vice_President vice_President = new Vice_President(people, 50000);
		Director director = new Director(people2, 1500);
		Manager manager = new Manager(people3, 1500);

		people4.setPosition(manager);
		people3.setPosition(director);
		people2.setPosition(vice_President);
		people.setPosition(president); */

		Object_For_Sale object = new Object_For_Sale("Galaxy S7", 1000);
		Object_For_Sale object2 = new Object_For_Sale("Alienware A7", 30000);

		people4.asignature(object);
		people4.asignature(object2);
  }
}
