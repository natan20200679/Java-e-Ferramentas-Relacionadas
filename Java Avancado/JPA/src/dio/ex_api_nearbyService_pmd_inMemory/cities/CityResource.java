/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.ex_api_nearbyService_pmd_inMemory.cities;

import com.github.andrelugomes.cities.entities.City;
import com.github.andrelugomes.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {

        this.repository = repository;

    }

//    1st
//    @GetMapping
//    public List<City> cities() {
//
//        return repository.findAll();
//
//    }

    // 2nd - Pageable
    @GetMapping
    public Page<City> cities(final Pageable page) {
        
        return repository.findAll(page);
    
    }

}
