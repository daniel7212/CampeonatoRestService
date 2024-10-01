package com.example.campeonato;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.campeonato.model.Liga;

@Configuration
public class CampeonatoConfiguration {

	@Bean
	public Liga liga() {
		return new Liga();
	}
}