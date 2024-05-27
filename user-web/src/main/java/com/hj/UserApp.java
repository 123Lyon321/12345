package com.hj;

<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
=======
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> 5b27481 (init)
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
<<<<<<< HEAD
@EnableEurekaClient
@EnableFeignClients
=======
>>>>>>> 5b27481 (init)
@MapperScan("com.hj.mapper")
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }
<<<<<<< HEAD


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
=======
    
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
>>>>>>> 5b27481 (init)
    }
}