package dio.phonebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class ScheduleController {

    @GetMapping
    public Contact retornaContato() {

        return Contact.builder().id(1L).nome("Renan").telefone("9999-9999").build();
    
    }

}
