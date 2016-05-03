public class Manager extends Position{

  public Manager(People boss, int range, String position_name){
		super(boss, range, position_name);
	}

 	public void asignature(Object_For_Sale object){
		if (object.getPrice() < super.getRange())
			System.out.println("Firmo Gerente");
		else
			super.getBoss().asignature(object);
	}


}
