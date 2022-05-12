import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/** 
*   NOTE:
*	Air travel can only visit the place once, even if it is
*	repeated a few times
*/
public class AirTravel extends Travel implements TravelCost {

	private List<String> inDestinations;

	public AirTravel() {
		super();
	}

	public AirTravel(List<String> inDestinations) throws EmptyDestinationException {
		// Look at the NOTE

      // FIXME
		super();
		super.setDestinations(inDestinations);
		
	}
	
	@Override
	public void setDestinations(List<String> inDestinations) throws EmptyDestinationException {
      // FIXME
		try {
			super.setDestinations(inDestinations);
			throw new EmptyDestinationException("Error");			
		}
		catch (EmptyDestinationException except)
		{
			except.getMessage();
		}
	}

	@Override
	public Double calculateTripCost(List<String> inDestinations) {
		//
		// cost is 100 times bigger than the length of the destination string
		//
		Double cost = 0.0;
      // FIXME
		cost =  super.getDestinations().toString().length() * 100.0;
		return cost;
	}

	public Double calculateTripCost() {

		return calculateTripCost(super.destinations);
	}

	public Double calculateTripTime(List<String> inDestinations) {
	   // Cost is 2.0 per one destination
		Double time = Double.valueOf(0.0);
      // FIXME
		double numDests = (double) super.getDestinations().size();
		time =  numDests * 2.0;
		return time;
	}

	@Override
	public Double calculateTripTime() {
	   // FIXME 
	   Double tripTime = 0.0;
	   
	   return tripTime;
	}
	
	@Override
	public String toString() {
		String msg = "\n** Air Travel **";
		// FIXME
		return  msg;

}
}
