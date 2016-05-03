public class People{
	public String name;
	public int age;
	private final int id;
	private Position position;

	public People(String name, int age, int id, Position position){
		this.name = name;
		this.age = age;
		this.id = id;
		this.position = position;
	}

	public void setPosition(Position position){
		this.position = position;
	}

	public Position getPosition(){
		return position;
	}

	public void asignature(Object_For_Sale object){
	  position.asignature(object);
	}

	public int getRange(){
		return position.getRange();
	}
}
