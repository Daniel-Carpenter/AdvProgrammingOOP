
/**
 * @author Daniel Carpenter
 */
public enum EmployeeStatus {
	/**
	 * Full Time
	 */
	FT("Full Time"),
	
	/**
	 * Part Time 
	 */
	PT("Part Time");
	
	
	private String symbol;

	private EmployeeStatus(String symbol)
	{
		this.symbol = symbol;
	}
	
	public String toString() {
		return symbol;
	}
}
