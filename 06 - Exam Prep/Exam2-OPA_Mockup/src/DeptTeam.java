
public enum DeptTeam
{
	SITE_LEAD("Site Lead"),
	DATA_SCIENTIST("Data Scientist"),
	SENIOR_MANAGER("Senior Manager");
	
	
	private String symbol;
	private DeptTeam(String symbol) {
		this.symbol = symbol;
	}	
	
	public String toString() {
		return symbol;
	}
}
