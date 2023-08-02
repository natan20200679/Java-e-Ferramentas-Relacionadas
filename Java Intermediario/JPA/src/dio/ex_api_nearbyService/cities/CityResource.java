/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.ex_api_nearbyService.cities;

import com.github.andrelugomes.cities.entities.City;
import com.github.andrelugomes.cities.repositories.CityRepository;
import java.awt.print.Pageable;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private static Logger log = LoggerFactory.getLogger(CityResource.class);
    private final CityRepository repository;

    public CityResource(final CityRepository repository) {

        this.repository = repository;

    }

    @GetMapping
    public Page<City> cities(final Pageable page) {

        log.info("cities, {}", page);

        return repository.findAll(page);

    }

}
