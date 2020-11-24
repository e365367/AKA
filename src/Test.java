
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Beer> beers = new ArrayList<Beer>();
		beers.add(West2FriedChickenRestaurant.qingdao);
		beers.add(West2FriedChickenRestaurant.baiwei);
		
		List<Juice> juices = new ArrayList<Juice>();
		juices.add(West2FriedChickenRestaurant.orjuice);
		juices.add(West2FriedChickenRestaurant.watjuice);
		West2FriedChickenRestaurant r1 = new West2FriedChickenRestaurant(500, beers, juices,
				West2FriedChickenRestaurant.setmeals);

		try {
			r1.restock(West2FriedChickenRestaurant.qingdao, 20);
			r1.sell_SetMeal(West2FriedChickenRestaurant.meal1);
		} catch (OverdraftBalanceException e) {
			System.out.println("进货还差：" + e.aa + "元");
		} catch (IngredientSortOutException e) {
			System.out.println(e.message + "已售空");
		}

	}
}
