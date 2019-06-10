package BiuroPodrozy;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TripOffer trip1=new TripOffer(219.99f,7,Continent.EU,false);
        TripOffer trip2=new TripOffer(349.99f,10,Continent.SA,true);
        TripOffer trip3=new TripOffer(290.99f,14,Continent.AS,false);
        TripOffer trip4=new TripOffer(199.99f,8,Continent.AF,true);

        List<TripOffer> trips =new ArrayList<>();

        trips.addAll(Arrays.asList(trip1,trip2,trip3,trip4));

        System.out.println(trips);

        TravelAgency travelAgency=new TravelAgency(trips);

        boolean result;
        float maxPrice=300;
        int minNights=7;
        List<Continent> continents= Arrays.asList(Continent.EU,Continent.AS);
        boolean isDog=false;

        result=travelAgency.bookOffer(maxPrice,minNights, continents,isDog);

        System.out.println(String.format("Result for (%.2f * %d, %s, %b) is: %b", maxPrice, minNights,
                continents, isDog, result));

        System.out.println(trips);

    }
}
