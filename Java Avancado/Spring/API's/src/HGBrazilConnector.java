/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import lombok.extern.slf4j.Slf4j;

import models.HGBrazilResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Component
@Slf4j
public class HGBrazilConnector {
    
    private static final String SCHEME = "https";
    private static final String HOST = "api.hgbrasil.com";
    
    // Outra opção de acesso à uma API por este HOST..
//    private static final String HOST = "34.117.10.255.nip.io"; 
    private static final String URI = "weather";
    
    // Outra opção de acesso à uma API por esta URI.
//    private static final String URI = "previsoes"; 
    private static final String API_KEY = "fe8fedf3";
    private static final String API_FIELDS = "only_results,temp,city_name,forecast,max,min,date";
    private static final int MAX_ARRAY_RESULTS = 3;

    @Autowired
    private RestTemplate restTemplate;

    public HGBrazilResponse fecthWeatherForCity (String city) {
        
        log.info("Consultando a APÌ da HG Brasil para a cidade {}",city);
        
        HttpEntity<?> entity = createHeaders();
        
        var uriComponentsBuilder = createUriBuilder(city);
        
        log.info("url para chamada da api do hgbrasil {}",uriComponentsBuilder.toUriString());
        
        final ResponseEntity<HGBrazilResponse> responseEntity = this.restTemplate
                .exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET,entity,
                        HGBrazilResponse.class);
        
        HGBrazilResponse response = Optional.ofNullable(responseEntity.getBody())
                .orElse(null);
        
        return null;
    
    }
    
    private UriComponentsBuilder createUriBuilder(String city) {
        
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance();
        
        uriBuilder.scheme(SCHEME).host(HOST).path(URI);
        uriBuilder.queryParam("key",API_KEY);
        uriBuilder.queryParam("array_limit",MAX_ARRAY_RESULTS);
        uriBuilder.queryParam("fields",API_FIELDS);
        uriBuilder.queryParam("city",city);
        
        return uriBuilder;
    
    }
    
    private HttpEntity<?> createHeaders() {
        
        HttpHeaders headers = new HttpHeaders();
        
        headers.set(MediaType.APPLICATION_JSON_VALUE, HttpHeaders.ACCEPT);
        
        return new HttpEntity<>(headers);
    
    }

}
