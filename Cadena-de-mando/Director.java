public class Director extends Position{

	public Director(People boss, int range, String position_name){
		super(boss, range, position_name);
	}

	public void asignature(Object_For_Sale object){
		if ((object.getPrice() >= super.getRange()) && (object.getPrice() < super.getBoss().getRange()))
			System.out.println("Firmo Director");
		else
			super.getBoss().asignature(object);
	}
}
