/**
 * 
 */
package com.vd.springcloudeurekafeignclient.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vivek Deshmukh
 *
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {

	@RequestMapping("/greeting")
    String greeting();
}
