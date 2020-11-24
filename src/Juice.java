import java.time.LocalDate;

public class Juice extends Drinks {
	public static int shelflife = 2;

	protected Juice(String name, double cost, LocalDate producedate) {
		this.name = name;
		this.cost = cost;
		this.producedate = producedate;
	}

	protected Juice() {

	}

	protected boolean isexpired() {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = producedate.plusDays(30);
		return d2.isBefore(d1);
	}

	@Override
	public String toString() {
		return "Beer{" + "name=" + name + ",cost=" + cost + ",producedate=" + producedate + ",shelflife=" + shelflife
				+ '}';
	}
}
