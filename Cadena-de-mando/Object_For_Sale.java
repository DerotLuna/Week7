public class Object_For_Sale{
	private String name;
	private int price;
	//private int id;

	public Object_For_Sale(String name, int price){
		this.name = name;
		this.price = price;
		//this.id = this;
	}

    public void setPrice(int new_Price){
       this.price = new_Price;
    }

	public int getPrice(){
		return price;
	}

	/*public int getId(){
	   return id;
	}*/
}
