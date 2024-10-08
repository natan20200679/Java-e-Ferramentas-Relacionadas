/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.ex_api_nearbyService.cities;

import com.github.andrelugomes.cities.service.DistanceService;
import com.github.andrelugomes.cities.service.EarthRadius;
import java.lang.System.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    private static Logger log = LoggerFactory.getLogger(DistanceResource.class);
    
    private final DistanceService service;

    public DistanceResource(DistanceService service) {

        this.service = service;

    }

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {

        log.info("byPoints, from={}, to={}", city1, city2);
        return service.distanceByPointsInMiles(city1, city2);

    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {

        log.info("byCube, from={}, to={}", city1, city2);
        return service.distanceByCubeInMeters(city1, city2);

    }

    @GetMapping("/by-math")
    public Double byMath(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2, 
    @RequestParam final EarthRadius unit) {

        log.info("byMath, from={}, to={}", city1, city2);
        return service.distanceUsingMath(city1, city2, unit);

    }

}
