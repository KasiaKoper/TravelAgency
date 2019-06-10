package BiuroPodrozy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelAgency {

    private List<TripOffer> tripOffers = new ArrayList<>();

    public TravelAgency(List<TripOffer> tripOffers) {
        this.tripOffers = tripOffers;
    }

    public boolean bookOffer(float maxPrice, int minNights, List<Continent> continents, boolean isDog) {
        List<Integer> indexToDelete = new ArrayList<>();

        for (TripOffer tripOffer : tripOffers) {
            boolean continentMatch = false;

            for (Continent continent : continents) {
                if (continent.name().equals(tripOffer.getContinent().name())) {
                    continentMatch = true;
                }
            }

            if (tripOffer.getPrice() <= maxPrice
                    && tripOffer.getNoOfNights() >= minNights
                    && continentMatch == true
                    && tripOffer.isDog() == isDog) {

                //indexToDelete.add(tripOffers.indexOf(tripOffer));
                tripOffers.remove(tripOffers.indexOf(tripOffer));
                return true;
            }
        } return false;

        //powinno usuwac kilka tripów, a nie dziala dla kilku
//        if (indexToDelete.isEmpty()) {
//            return false;
//        } else {
//            for (Integer integer : indexToDelete) {
//                tripOffers.remove(integer);
//            }
//            System.out.println(tripOffers);
//            return true;
//        }
    }

}
