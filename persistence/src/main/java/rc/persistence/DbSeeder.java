package rc.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rc.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot",5,true);
        Hotel ibis = new Hotel("Ibis",5,false);
        Hotel goldenToolip = new Hotel("Golden Tooltip",5,true);
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(marriot);
        hotelList.add(ibis);
        hotelList.add(goldenToolip);
        hotelRepository.saveAll(hotelList);
    }
}
