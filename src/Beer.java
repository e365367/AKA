import java.time.LocalDate;

public class Beer extends Drinks {
	public float degree=(float) 5.5;
	public static int shelflife = 30;

	protected Beer(String name, double cost, LocalDate producedate) {
		this.name = name;
		this.cost = cost;
		this.producedate = producedate;
	}

	protected Beer() {

	}

	protected boolean isexpired() {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = producedate.plusDays(30);
		return d2.isBefore(d1);
	}

	@Override
	public String toString() {
		return "Beer{" + "name=" + name + ",cost=" + cost + ",producedate=" + producedate + ",shelflife=" + shelflife
				+ ",degree=" + degree + '}';
	}
}
