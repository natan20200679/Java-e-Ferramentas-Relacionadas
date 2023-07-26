import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate (final RestTemplateBuilder restTemplateBuilder) {
		final RestTemplate restTemplate = restTemplateBuilder.build();
		final List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//		((ArrayList<?>) messageConverters).add(new ByteArrayHttpMessageConverter());
//		((ArrayList<?>) messageConverters).add(new ResourceHttpMessageConverter());
//		((ArrayList<?>) messageConverters).add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(new ResourceHttpMessageConverter());
		messageConverters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
		return restTemplate;
	}

}
