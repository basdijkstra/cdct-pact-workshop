package provider;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    public Location findLocation(String countryCode, String zipCode) {

        Location location = new Location();
        location.setZipCode(zipCode);
        location.setCountry("United States");
        location.setCountryAbbreviation(countryCode);

        List<Place> places = new ArrayList<>();

        Place place = new Place();
        place.setPlaceName("Beverly Hills");
        place.setCounty("Los Angeles");
        place.setState("California");
        place.setStateAbbreviation("WY");

        places.add(place);

        location.setPlaces(places);

        return location;
    }
}
