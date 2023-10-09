package com.example.microservices.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator routerConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/currency-exchange/**")
                        .uri("lb://currency-exchange")
                )
                .route(p -> p
                        .path("/currency-conversion/**")
                        .uri("lb://currency-conversion")
                )
                .build();
    }
}
