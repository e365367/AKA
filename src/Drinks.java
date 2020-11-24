import java.time.*;

public abstract class Drinks {
	protected String name;
	protected double cost;
	protected LocalDate producedate;
	protected int shelflife;

	protected Drinks(String name, double cost, LocalDate producedate) {
	}

	protected Drinks() {
	}

	protected abstract boolean isexpired();

	public abstract String toString();
}



