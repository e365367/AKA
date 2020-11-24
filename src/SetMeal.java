import java.util.Objects;

public class SetMeal extends Object{
	public String name;
	public double price;
	public String friedchickenname;
	public Drinks drink;

	public SetMeal(String name, int price, String friedchickenname, Beer drink) {
		this.name=name;
		this.price=price;
		this.friedchickenname=friedchickenname;
		this.drink=drink;
	}

	public SetMeal(String name, int price, String friedchickenname, Juice drink) {
		this.name=name;
		this.price=price;
		this.friedchickenname=friedchickenname;
		this.drink=drink;
	}
	
	@Override
	public String toString() {
		return "SetMeal{" + "name=" + name + ",price=" + price + ",friedchickenname=" + friedchickenname + ",drink="
				+ drink + '}';}
	@Override
	public boolean equals(Object o) {
		if(o instanceof SetMeal) {
			SetMeal s=(SetMeal) o;
			return Objects.equals(this.name, s.name)&&this.price==s.price
					&&Objects.equals(this.friedchickenname, s.friedchickenname)
					&&Objects.equals(this.drink,s.drink);
		}else {return false;
	}
	}
}
