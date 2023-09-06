package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactivefeign.spring.config.EnableReactiveFeignClients;

/**
 * @author young
 * @version 1.0.0 2023/04/19
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableAsync(proxyTargetClass = true) // 注入非接口类时需要
@EnableCaching
@EnableDiscoveryClient
//@EnableFeignClients
@EnableWebFlux
@EnableReactiveFeignClients
public class GatewayApplication {
  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class);
  }
}
