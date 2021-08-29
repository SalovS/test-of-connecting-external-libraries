import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;


import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Aircraft> aircrafts = Airport.getInstance().getAllAircrafts();
        System.out.println("Количестов самолётов: " + aircrafts.size());
    }
}
