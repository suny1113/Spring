package spring_DI_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean(name="p")
	public Jet jet() {
		return new Jet();
	}
	
	@Bean(name="m")
	public Missile missile() {
		return new Missile();
	}
	
}
