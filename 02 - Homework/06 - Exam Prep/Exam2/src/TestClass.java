import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		AirTravel at = new AirTravel();
        List<String> list = at.getDestinations();
        System.out.println(list.toString());

	}

}
