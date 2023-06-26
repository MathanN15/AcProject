package com.onesoft.ac;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationAc {
@Bean
public RestTemplate reat() {
	return new RestTemplate();
}
}
