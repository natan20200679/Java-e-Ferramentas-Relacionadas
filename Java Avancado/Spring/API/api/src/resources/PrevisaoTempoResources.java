package resources;

import connectors.HGBrasilConnector;
import models.PrevisaoTempoResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static models.PrevisaoTempoResponseModel.*;

@RestController
public class PrevisaoTempoResources {
    @Autowired
    HGBrasilConnector connector;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test() {
        var retornoApi = connector.fecthWeatherForCity("São Paulo,sp");
        PrevisaoTempoResponseModel ret = null;

        if (retornoApi != null) {
            ret = builder().nomeCidade(retornoApi.getCityName()).hora(16)
                    .temperatura(retornoApi.getTemp()).data(retornoApi.getDate()).build();
        }

        return ResponseEntity.ok(ret);
    }

}