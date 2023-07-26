package Teste;

import connectors.HGBrasilConnector;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {
	@Autowired
	HGBrasilConnector connector;

	@Test
	void contextLoads() {
	}

	@Test
	void xpto() {
		var resultadoApi = connector.fecthWeatherForCity("São Paulo,sp");
		Assertions.assertEquals(resultadoApi.getCityName(),"São paulo");
	}

}
