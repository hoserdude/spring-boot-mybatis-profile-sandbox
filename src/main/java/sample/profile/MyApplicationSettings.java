package sample.profile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties("myapp")
@EnableConfigurationProperties
public class MyApplicationSettings {
	
	private String hello;
	private String name;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
