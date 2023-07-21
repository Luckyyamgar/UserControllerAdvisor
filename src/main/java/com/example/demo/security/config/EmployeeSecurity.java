/*package com.example.demo.security.config;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.example.demo.sanitization")
public class EmployeeSecurity {
	@Bean
	public SecurityFilterChain apiseSecurityFilterChain(HttpSecurity httpSecurity ) throws Exception {
		httpSecurity.authorizeHttpRequests(aut->
		aut.requestMatchers("/api/getall**").hasRole("Employee").anyRequest().authenticated()).formLogin();
		
	
	return httpSecurity.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		UserDetails normaluser=User.withUsername("Onkar")
		.password(passwordEncoder().encode("Kedar")).roles("Employee").build();
		return new InMemoryUserDetailsManager(normaluser);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}*/
