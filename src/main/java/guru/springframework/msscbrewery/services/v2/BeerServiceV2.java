package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerID);

    BeerDtoV2 saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerID, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerID);
}
