package dio.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class ScheduleController {

    @Autowired
    private ConsumingApi consumindoApi;

    @GetMapping
    public Contact retornaContato() {

        return consumindoApi.retornaContato();

    }

}
