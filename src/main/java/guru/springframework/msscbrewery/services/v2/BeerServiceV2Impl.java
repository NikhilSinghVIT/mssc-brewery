package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j //logger
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerID) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerID, BeerDtoV2 beerDtoV2) {
        log.debug("updating beer");
    }

    @Override
    public void deleteById(UUID beerID) {
        log.debug("deleting beer");
    }
}
