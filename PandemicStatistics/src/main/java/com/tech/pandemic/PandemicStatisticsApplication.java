package com.tech.pandemic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.tech.pandemic.*"},exclude={DataSourceAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class})
@EnableJpaRepositories(basePackages = {"com.tech.pandemic.repository"})
public class PandemicStatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PandemicStatisticsApplication.class, args);
	}

}
