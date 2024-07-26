/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_api_nearbyService_pmd_inMemory.staties;

import com.github.andrelugomes.staties.entities.State;
import com.github.andrelugomes.staties.repositories.StateRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    
      this.repository = repository;
  
  }

  @GetMapping
  public List<State> staties() {
    
      return repository.findAll();
  
  }

}
