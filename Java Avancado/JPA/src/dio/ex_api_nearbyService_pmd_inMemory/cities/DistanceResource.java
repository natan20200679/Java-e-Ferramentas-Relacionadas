/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.ex_api_nearbyService_pmd_inMemory.cities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    private final DistanceService service;
    
    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    public DistanceResource(DistanceService service) {

        this.service = service;

    }

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to")
            final Long city2) {

        log.info("byPoints");

        return service.distanceByPointsInMiles(city1, city2);

    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to")
            final Long city2) {

        log.info("byCube");

        return service.distanceByCubeInMeters(city1, city2);

    }

    @GetMapping("/by-math")
    public Double byMath(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to")
            final Long city2, @RequestParam final EarthRadius unit) {

        log.info("byMath");

        return service.distanceUsingMath(city1, city2, unit);

    }

}
