/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;

import connectors.HGBrasilConnector;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    HGBrasilConnector connector;

    @Test
    void contextLoads() {}

    @Test
    void xpto() {
        
        var resultadoApi = connector.fecthWeatherForCity("São Paulo,sp");
        
        Assertions.assertEquals(resultadoApi.getCityName(), "São paulo");
    
    }

}
