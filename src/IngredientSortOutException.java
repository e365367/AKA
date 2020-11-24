
@SuppressWarnings("serial")
public class IngredientSortOutException extends RuntimeException {
	public String message; 
	public IngredientSortOutException() {
	}
	
	public IngredientSortOutException(String s) {
		message=s;
	}
}
