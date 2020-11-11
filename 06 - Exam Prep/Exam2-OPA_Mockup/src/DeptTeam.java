
public enum DeptTeam
{
	PETTY_VILLIAN("Petty Villian"),
	PROTAGONIST("Protagonist"),
	MAIN_BOSS("Main Boss"),
	SILLY_COMPANION("Silly Companion");
	
	
	private String symbol;
	private DeptTeam(String symbol) {
		this.symbol = symbol;
	}	
	
	public String toString() {
		return symbol;
	}
}
