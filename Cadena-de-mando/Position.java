public abstract class Position{
	private People boss;
	private int range;
	public String position_Name;

	public Position(People boss, int range, String position_Name){
		this.boss = boss;
		this.range = range;
		this.position_Name = position_Name;
	}

	public int getRange(){
		return range;
	}

	public void setBoss(People boss){
		this.boss = boss;
	}

	public void setRange(int range){
		this.range = range;
	}

	public People getBoss(){
		return boss;
	}

	public abstract void asignature(Object_For_Sale object);
}
