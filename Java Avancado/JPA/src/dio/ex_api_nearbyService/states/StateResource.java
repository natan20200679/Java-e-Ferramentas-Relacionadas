/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_api_nearbyService.states;

import java.awt.print.Pageable;
import java.lang.System.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("states")
public class StateResource {

  private static Logger log = LoggerFactory.getLogger(StateResource.class);
  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    
      this.repository = repository;
  
  }

  @GetMapping
  public Page<State> states(final Pageable page) {
  
      log.info("states, {}", page);
    
      return repository.findAll(page);
  
  }

}

