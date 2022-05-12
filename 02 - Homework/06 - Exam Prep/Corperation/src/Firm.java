import java.util.ArrayList;
import java.util.List;

public class Firm 
{
	private ArrayList<Office> offices = new ArrayList<Office>();

	public Firm(List<Office> offices)
	{
		this.offices.addAll(offices);
	}

	public int getNumOffices() {
		return offices.size();
	}

	public ArrayList<Office> getOffices() {
		return offices;
	}
}
