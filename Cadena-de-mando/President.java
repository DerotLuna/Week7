public class President extends Position{

	public President(People boss, int range, String position_name){
		super(boss, range, position_name);
	}

	public void asignature(Object_For_Sale object){
		if (object.getPrice() >= super.getRange())
			System.out.println("Firmo Persidente");
	}
}
