package com.nttdata.bankeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Bank Eureka Server Application.
 *
 * @author jmacoele
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class BankEurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(BankEurekaServerApplication.class, args);
  }

}
