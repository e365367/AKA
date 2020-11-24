
@SuppressWarnings("serial")
public class OverdraftBalanceException extends RuntimeException {
	public String message; 
	public double aa;
	public OverdraftBalanceException() {
	}
	
	public OverdraftBalanceException(String s) {
		message=s;
	}
	public OverdraftBalanceException(double aa) {
		this.aa=aa;
	}
}
