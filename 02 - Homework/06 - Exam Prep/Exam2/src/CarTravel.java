import java.util.List;

public class CarTravel extends Travel implements TravelCost {

	private static final double CAR_TRAVEL_COST_MULTIPLIER = 100.0;

	public CarTravel() {
		super();
	}

	public CarTravel(List<String> inDestinations) throws EmptyDestinationException {
		// FIXME
		super.setDestinations(inDestinations);
	}

	public Double calculateTripCost() {
	   Double tripCost = 0.0;
	   // FIXME
	   
	   tripCost =  super.getDestinations().toString().length() * 100.0;
		return tripCost;
	} 
	
	@Override
	public Double calculateTripCost(List<String> inDestinations) {
	   // FIXME
	   // every stop increases the cost by a cost()
		Double cost = 0.0;
		//FIXME
		
		for (int i = 0; i < super.getDestinations().size() - 1; ++i)
		{
			String dest = inDestinations.get(i);
			cost += this.cost(dest);			
		}
		
		return cost;
	}
	
	/*
	 * Cost = number of characters in the string (except the whitespace characters) times CAR_TRAVEL_COST_MULTIPLIER
	 */
	public Double cost(String dest) {
	   // FIXME

		Double cost = -9.0;
		return cost;
	}

	@Override
	public String toString() {
		String msg = "\n** Car Travel **";
		// FIXME
		return  msg; 
	}

	@Override
	public Double calculateTripTime() {
	   // FIXME
	   // It increases 20 per stop
		Double time = Double.valueOf(0.0);

		return time;
	}

}
